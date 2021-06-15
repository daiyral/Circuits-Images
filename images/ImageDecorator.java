package images;

public abstract class ImageDecorator implements Image {//implement image interface
	private Image base;
	public ImageDecorator(Image base) {
		this.base=base;
	}
	public int getWidth() {
		return base.getWidth();
	}
	public int getHeight() {
		return base.getHeight();
	}
	public Image getBase(){
		return base;
	}
}
