package Event;

import java.util.Scanner;

public class Scheduler {
	
	private int capacity = 10;
	public Event [] events = new Event [capacity];
	public int n = 0;
	private Scanner kb;
	
	public void processCommand() {
		kb = new Scanner( System.in );
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			if(command.equals("addevent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday"))
					handleAddOneDayEvent();
				else if(type.equalsIgnoreCase("duration"))
					handleAddDurationEvent();
				else if(type.equalsIgnoreCase("deadline"))
					handleAddDeadlinedEvent();
			}else if(command.equals("list")) {
				handleList();
			}else if(command.equals("show")) {
				
			}else if(command.equals("exit"))
				break;
		}
		kb.close();
	}
	
	private void handleList() {
		for(int i=0; i<n; i++) {
			System.out.println("   "+events[i].toString());
		}
	}

	private void handleAddDeadlinedEvent() {
		// TODO Auto-generated method stub
		
	}

	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub
		
	}

	private void handleAddOneDayEvent() {
		System.out.println(" when: ");
		String dateString = kb.next(); // dateString = "2025/01/25"
		System.out.println(" title: ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
		OneDayEvent ev = new OneDayEvent(title, date);
		//System.out.println(ev.toString());
		
		addEvent(ev);
	}

	private void addEvent(Event ev) {
		if(n >= capacity) {
			reallocate();
		}
		events[n++] = ev;
		
	}

	private void reallocate() {
		Event [] tmp = new Event[capacity * 2];
		for(int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *= 2;
	}

	private MyDate parseDateString(String dateString) {
		String [] tokens = dateString.split("/");
		
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}
}
