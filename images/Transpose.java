package images;

public class Transpose extends ImageDecorator {


	public Transpose(Image base) {
		super(base);
		
	}
	@Override
	public int getHeight()
	{
		return getBase().getWidth();
	}
	@Override
	public int getWidth()
	{
		return getBase().getHeight();
	}
	@Override
	public RGB get(int x,int y)
	{
	return getBase().get(y,x);
	}

}
