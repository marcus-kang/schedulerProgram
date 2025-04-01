package Figure;

public abstract class Shape {
	
	public String shapeName;
	
	public Shape (String name) {
		shapeName = name;
	}
	
	public abstract double computeArea();
	public abstract double computePerimeter();
}
