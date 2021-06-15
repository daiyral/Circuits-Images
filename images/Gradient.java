package images;

public class Gradient extends BaseImage {
private RGB start,end;
	public Gradient(int width, int height, RGB start, RGB end){
		super(width,height);
		this.start=start;
		this.end=end;
	}
	/*return the correct color for each dot by using mix function*/
	@Override
	public RGB get(int x,int y){
		return RGB.mix(start, end, 1.0-((double)x/super.getWidth()));
	}

}
