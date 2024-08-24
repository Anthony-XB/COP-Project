package cop2805.polymophism;

//extends to the Shape3D class
public class Cylinder extends Shape3D{
	
	//instantiated radius and height as variables
	int radius,height;
	
	//Cylinder constructor function
	// assigns variables to radius and height
	public Cylinder(int r, int h){
		radius = r;
		height = h;
	}
	
	//Overides Shapes3D volume method
	//calculates Volume for Cylinder
	@Override
	public double Volume() {
	
		return Math.PI * radius * radius * height;
	}

	
	
}