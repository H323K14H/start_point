public class Rectangle {


    private int length;
    private int height;
    private int area;




    //constructor
    public Rectangle(int inputLength, int inputHeight) {
        this.height = inputHeight;
        this.length = inputLength;
        this.area = this.height * this.length;


    }


    //getter -> no args
    public int getArea() {
        return this.area;
    }


    public int getHeight() {
        return this.height;
    }


    public int getLength() {
        return this.length;
    }


    public void setHeight(int newHeight) {
        this.height = newHeight;
        this.area = this.length * this.height;
    }


    public boolean isRectangle() {
        return this.height == this.length;
    }
    //
}
