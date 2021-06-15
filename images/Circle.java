package images;

public class Circle extends BaseImage{
private int centerX,centerY,radius;
RGB center,outside;
/*constructor of a circle image, the image will be at the size widthXheight*/
public Circle(int width, int height, int centerX, int centerY, int radius, RGB center, RGB outside) 
 {
		super(width,height);
		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;
		this.center=center;
		this.outside=outside;
 }
/*constructor of a circle image, the image will be at the size sizeXsize, and the circle is in the center*/
public Circle(int size, int radius, RGB center, RGB outside) 
{
	super(size,size);
	this.radius=radius;
	this.center=center;
	this.outside=outside;
	this.centerX=size/2;
	this.centerY=size/2;
}
/*the function checks the position of the given dot, and returns the correct color for it*/
	@Override
	public RGB get(int x,int y){
	double distance=isInside(x,y);//if the return value = -1 we are outside the circle
	return distance>-1? RGB.mix(outside, center,(distance/radius)) :outside; 
			
	}
	/*check if the current point is inside the circle and return the distance from the center of it*/
	private double isInside(int x,int y)
	{
		double deltaX=Math.pow(x-centerX, 2);
		double deltaY=Math.pow(y-centerY, 2);
		double distance=Math.sqrt(deltaX+deltaY);
		if(distance<radius) return distance;//distance from center of circle
		return -1;//outside of circle
	}
	
}
