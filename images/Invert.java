package images;

public class Invert extends ImageDecorator {

	public Invert(Image base) {
		super(base);

	}
	/*invert the color of each dot in the image*/
	@Override
	public RGB get(int x,int y)
	{
		return getBase().get(x,y).invert();
	}

}
