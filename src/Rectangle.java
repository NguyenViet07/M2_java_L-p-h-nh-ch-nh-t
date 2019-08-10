public class Rectangle {
    double width ,heiht;
    public Rectangle(){

    }
    public Rectangle( double width, double heiht){
        this.width = width;
        this.heiht = heiht;
    }
    public double getArea(){
        return this.width * this.heiht;
    }
    public double getPrimeter(){
        return 2*(this.width+this.heiht);
    }
    public String disPlay(){
        return "Rectangle has" + "width = " + this.width + " heidth = " + this.heiht;
    }

}
