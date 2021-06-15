package images;

public class RGB {
	private double  red,green,blue;
	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);

	//create our function according to the excercise document
	public RGB(double red,double green,double blue) {
		this.red=red;
		this.green=green;
		this.blue=blue;
	}
	public RGB(double grey){
		this.red=grey;
		this.green=grey;
		this.blue=grey;
	}
	public double getRed(){
		return red;
	}
	public double getBlue(){
		return blue;
	}
	public double getGreen(){
		return green;
	}
	public RGB invert(){
		double rNew;
		double bNew;
		double gNew;
		rNew=1-red;
		gNew=1-green;
		bNew=1-blue;
		return new RGB(rNew,gNew,bNew);
	}
	public RGB filter(RGB filter){
		double rNew;
		double bNew;
		double gNew;
		rNew=red*filter.getRed();
		gNew=green*filter.getGreen();
		bNew=blue*filter.getBlue();
		return new RGB(rNew,gNew,bNew);
	}
	public static RGB superpose(RGB rgb1, RGB rgb2) {
		double rNew;
		double bNew;
		double gNew;
		rNew=rgb1.getRed()+rgb2.getRed();
		if(rNew>1)
			rNew=1;
		gNew=rgb1.getGreen()+rgb2.getGreen();
		if(gNew>1)
			gNew=1;
		bNew=rgb1.getBlue()+rgb2.getBlue();
		if(bNew>1)
			bNew=1;
		
		return new RGB(rNew,gNew,bNew);
			
	}
	public static RGB mix(RGB rgb1, RGB rgb2,double alpha)
	{
		double rNew;
		double bNew;
		double gNew;
		rNew=alpha*rgb1.getRed()+(1-alpha)*rgb2.getRed();
		gNew=alpha*rgb1.getGreen()+(1-alpha)*rgb2.getGreen();
		bNew=alpha*rgb1.getBlue()+(1-alpha)*rgb2.getBlue();
		
		return new RGB(rNew,gNew,bNew);
	}
	public String toString()
	{
		String str;
		str=String.format("<%.4f, %.4f, %.4f>",red,green,blue);
		return str;
	}

}
