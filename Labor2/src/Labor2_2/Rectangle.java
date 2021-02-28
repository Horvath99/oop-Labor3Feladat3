package Labor2_2;

public class Rectangle {
    private double lenght,widht;
    public Rectangle(double widht,double lenght){
//        if(widht>=0 && lenght>=0){
//            this.widht=widht;
//            this.lenght=lenght;
//        }
        if(widht<=0 || lenght<=0){
            return;
        }
        this.widht=widht;
        this.lenght=lenght;
    }
    public double getLenght(){
        return lenght;
    }

    public double getWidht() {
        return widht;
    }
    public double area(){
        return widht*lenght;
    }
    public double perimeter(){

        return 2*(lenght+widht);
    }
}
