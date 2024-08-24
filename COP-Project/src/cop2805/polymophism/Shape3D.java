package cop2805.polymophism;



//abstract class shape3D
//implements the Comparable method
public abstract class Shape3D implements Comparable<Shape3D> {

	
	//abstract method Volume returns double
	public abstract double Volume();
	
	
	//compareTo method
	//compares one class to another
	//conditional
	//returns specific output depending on which class has more volume
	@Override
	public int compareTo(Shape3D other) {
		// TODO Auto-generated method stub
		
		if(this.Volume() > other.Volume()) {
			return  1;
		} else if(other.Volume() > this.Volume()) {
			return  -1;
		}else {
			return  0;
		}
	}
	
	

	
}






