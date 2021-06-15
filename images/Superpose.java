package images;

public class Superpose extends BinaryImageDecorator{

	public Superpose(Image b1, Image b2) {
		super(b1,b2);
		height=Math.max(b1.getHeight(), b2.getHeight());//finds max between heights
		width=Math.max(b1.getWidth(),b2.getWidth());//finds max between width
	}
	
	public RGB get(int x,int y) {
		boolean ans1=IsInside(getBase1(),x,y);//checks if our cord are inside b1
		boolean ans2=IsInside(getBase2(),x,y);//checks if our cords and inside b2
		if(ans1 && ans2) return RGB.superpose(getBase1().get(x,y), getBase2().get(x, y));//if the cords are inside both images we superpose
		if(ans1) return getBase1().get(x,y);//if cord is only inside b1 we return that color
		if(ans2) return getBase2().get(x, y);//if cord is only inside b2 we return that color
		return RGB.BLACK;
		
	}
	

}
