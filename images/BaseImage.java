package images;

public abstract class  BaseImage  implements Image  {//this class implements Image interface
	private int width,height;
	
	public BaseImage(int width,int height) {
		this.height=height;
		this.width=width;
	}
	public int getWidth() {return width;}
	public int getHeight(){return height;}

}
