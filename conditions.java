import java.util.Scanner;

public class conditions {
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);
        int age=st.nextInt();
        if(age>18){
            System.out.println("adult");

        }
        else{
            System.out.println("not adult");
        }
    }

    
}
