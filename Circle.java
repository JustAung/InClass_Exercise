
public class Circle implements ShapeInterface{

	@Override
	public double calcArea(double r) {
		// TODO Auto-generated method stub
		double area = Math.PI*Math.pow(r, 2);
		return area;
	} 
	
}
