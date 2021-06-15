package images;

public class TwoColorImage extends BaseImage {

	private RGB zero,one;
	private TwoDFunc func;
	public TwoColorImage(int width,int height,RGB zero,RGB one,TwoDFunc func) {
		super(width,height);//create a base image
		this.zero=zero;//initalize values
		this.one=one;
		this.func=func;
	}
	public RGB get(int x,int y)
	{
		//create norm x and y according to our width and height
		double xNorm=(double)x/getWidth();
		double yNorm=(double)y/getHeight();
		double res=func.f(xNorm, yNorm);//run our func( we used stategy to send func and we use f according to each image)
		if(res>=1) return one;
		if(res<=0) return zero;
		return RGB.mix(one, zero, res);//creates our mix
	}
	

}
