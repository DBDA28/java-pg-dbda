package offset;

class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box(double w, double h, double d) { //parameterized constructor.
		this.width=w;
		this.height=h;
		this.depth=d;	
	}
	
	public String getBoxDims() {
		return "Box dims are"+this.width+" "+this.height+" "+this.depth;
		
	}
	
//	public Box createNewBox(double woff, double hoff, double doff)
//	{
//			
//		this.width=this.width+woff;
//		this.height=this.height+hoff;
//		this.depth=this.depth+doff;
//		return null;
//		
//	}

	public String createNewBox(double woff, double hoff, double doff) {
		this.width = this.width + woff;
		this.height = this.height + hoff;
		this.depth = this.depth + doff;
		 return "Box dims are"+this.width+" "+this.height+" "+this.depth;
		
	}
	
	public Box createNewBox1(double woff, double hoff, double doff) {
		
		this.width = this.width + woff;
		this.height = this.height + hoff;
		this.depth = this.depth + doff;
		return new Box(this.width,this.height,this.depth);
		
		
	}

}
