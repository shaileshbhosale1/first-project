public class conditions {
    public static void main(String args[]){
        Student sc = new Student(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("adult");

        }
        else{
            System.out.println("not adult");
        }
    }

    
}
