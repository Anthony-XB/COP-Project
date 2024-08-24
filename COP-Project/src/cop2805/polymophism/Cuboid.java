package cop2805.polymophism;

//extends to the Shape3D class
public class Cuboid extends Shape3D{
	
	//instantiated width, depth, height as variables
	int width,depth,height;
	
	//constructor fn
	//sets width height and depth
	public Cuboid(int w, int d, int h) {
		width = w;
		depth = d;
		height = h;
		
		
	}
	//overrides Shape volume method
	//calculates Volume for Cuboid
	@Override
	public double Volume() {
		return width *  depth* height;
	}

	
	
	
	
}