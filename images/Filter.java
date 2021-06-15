package images;

public class Filter extends ImageDecorator {
	private RGB filter;
	public Filter(Image base,RGB filter) {
		super(base);
		this.filter=filter;
	}
	/*apply filter on each dot*/
	@Override
	public RGB get(int x,int y)
	{
		return getBase().get(x,y).filter(filter);
	}

}
