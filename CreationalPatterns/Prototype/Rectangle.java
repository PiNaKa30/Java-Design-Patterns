package CreationalPatterns.Prototype;

public class Rectangle extends Shape{

    public int length;
    public int width;

    public Rectangle() {}

    public Rectangle(Rectangle target){
        super(target);
        if(target  != null){
            this.length = target.length;
            this.width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle target) || !super.equals(obj)) return false;
        return this.length == target.length && this.width ==  target.width;
    }

}
