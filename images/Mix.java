package images;

public class Mix extends BinaryImageDecorator {

	private double alpha;
	public Mix(Image b1, Image b2,double alpha) {
		super(b1,b2);
		height=Math.max(b1.getHeight(), b2.getHeight());//get max height bettwen 2 images
		width=Math.max(b1.getWidth(),b2.getWidth());//get max width between 2 images
		this.alpha=alpha;
	}
	
	public RGB get(int x,int y) {
		boolean ans1=IsInside(getBase1(),x,y);//check if cords are inside b1
		boolean ans2=IsInside(getBase2(),x,y);//check if cords are inside b2
		if(ans1 && ans2) return RGB.mix(getBase1().get(x,y), getBase2().get(x, y),alpha);//if cords are in both points return their mix
		if(ans1) return getBase1().get(x,y);//if cord is only in b1
		if(ans2) return getBase2().get(x, y);//if cord is only in b2
		return RGB.BLACK;
		
	}

	
}
