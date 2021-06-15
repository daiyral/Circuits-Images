package images;

public abstract class BinaryImageDecorator implements Image{//this class implements Image interface

	private Image b1;
	private Image b2;
	protected int height;
	protected int width;
	public BinaryImageDecorator(Image b1,Image b2) {
		this.b1=b1;
		this.b2=b2;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return height;
	}
	public Image getBase1(){
		return b1;
	}
	public Image getBase2(){
		return b2;
	}
	/*the function checks if a given point is inside a given image*/
	public boolean IsInside(Image b,int x,int y) {
		if(b.getHeight()>y && b.getWidth()>x) return true;
		return false;
	}

}
