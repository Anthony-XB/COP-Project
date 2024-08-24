package cop2805.polymophism;

public class Test{
	
//main fn
public static void main(String[] args) {
	
	//creates new Cuboid and cylinder instance
	//inputs any parameters
	Cuboid cuboid = new Cuboid(1,1,1);
	Cylinder cylinder = new Cylinder(2,2);
	
	//assigns compared to compareTo method
	//compares cuboid to cylinder
	double compared = cuboid.compareTo(cylinder);
	
	//prints result
	System.out.println(compared);
	
	
	}
	
}