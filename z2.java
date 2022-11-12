public class z2
{
    // не соображу как реализовать подсчет количество четырехугольников разного типа :с
    public static void main(String[] args) {
        Quadrangle q1 = new Quadrangle(4,6,7,9);
        System.out.println(q1.toString());
        q1.solve();
        Rectangle r1 = new Rectangle(2,4,2,4);
        System.out.println(r1.isQuadrangle());
        if(r1.isQuadrangle()){
            System.out.println("Площадь = "+r1.solveSquare()+", Периметр = "+r1.solvePer());
        }
    }
}

class Quadrangle{
    double a;
    double b;
    double c;
    double d;
    public Quadrangle(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public void solve(){
        double dig = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Диагональ ="+dig);

    }
    public String toString(){
        return "Координаты = " + a + " , "+ b + " , "+ c + " , "+ d;
    }
}

class Rectangle extends Quadrangle{
    public Rectangle(double a,double b,double c,double d){
        super(a,b,c,d);
    }
    boolean isQuadrangle(){
        if(a ==c && b == d)return true;
        return false;
    }

    double solveSquare(){
        return a*b;
    }

    double solvePer(){
        return 2*(a+b);
    }
}