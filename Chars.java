import java.util.Scanner;

public class Chars {

    public static void main(String[] args) {
        char[]c={'.',',','-',':',';','?','!'};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<c.length;j++){
                if(s.charAt(i)==c[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}