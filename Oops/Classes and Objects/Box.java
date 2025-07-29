package ClassesAndObjects;

public class Box {
	int width,height,depth;
	
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;	
	}
	public int calculateVolume() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		Box b1=new Box(2,3,4);
		System.out.println(b1.calculateVolume());

	}

}
