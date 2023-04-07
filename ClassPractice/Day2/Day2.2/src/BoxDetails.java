
public class BoxDetails {
	//properties/non static data members/instance variable
	private double width;
	private double height;
	private double depth;
//add a parameterized constructor to init COMPLETE state of the box	

	public BoxDetails(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth; //RMS: local var,LHS: instance var
	}
//Behavior : functionality (methods)
//Add a member : To return Box details in string form (dims of Box)

	public String toString() {
		return "BoxDetails [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	

 public double Volume() {
	 return (this.width*this.height*this.depth);
	 
 }


}
