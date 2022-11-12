import java.util.Scanner;
class Notepad

{
    Scanner sc=new Scanner(System.in);
    int date;
    void runInner()
    {
        data d=new data();
        d.IN();
        d.zapis();
        d.view();
    }
    Notepad()
    {}
    class data
    {
        String zapis[];
        int kol;
        data()
        {}
        void IN()
        {
            System.out.println("Введите дату: ");
            date=sc.nextInt();
        }
        void zapis()
        {
            System.out.println("Сколько записей вы хотите ввести? ");
            kol=sc.nextInt();
            zapis=new String[kol];
            for(int i=0; i<kol; i++)
            {
                System.out.println("Введите запись на дату: " + date );
                zapis[i]=sc.next();
            }
        }
        void view()
        {
            System.out.println(" Дата " + date);
            for(int i=0; i<kol; i++)
            {
                System.out.println("Запись " + zapis[i]);
            }
        }
    }

}

public class z4 {

    public static void main(String[] args) {
        Notepad piska= new Notepad();
        piska.runInner();
    }

}
