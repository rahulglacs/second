// Name = rahul yaduvanshi section= G , Roll number=55
import java.util.Scanner;

public class student {
     String Name;
    int class1;
    int Roll_number;
    String email;
    int mobile_num;
    float marks;

void get()
{Scanner sc=new Scanner(System.in);
    System.out.println("enetr your name");
     Name = sc.nextLine();
     System.out.println("enetr your class");
     class1 = sc.nextInt();
     System.out.println("enetr your roll number");
     Roll_number = sc.nextInt();
     System.out.println("enter your email address");
     email = sc.next();
     System.out.println("enter your mobile number");
     mobile_num = sc.nextInt();
     System.out.println(" enter your marks(out of 100)");
     marks = sc.nextFloat();
    
}
void display(){
    System.out.println(Name);
    System.out.println(class1);
    System.out.println(Roll_number);
    System.out.println(email);
    System.out.println(mobile_num);
    System.out.println(marks);


}
void result(){
    System.out.println("RESULT="+marks+"%");
}

    
    public static void main(String[] args){
        student sc=new student();
        sc.get();
        sc.display();
        sc.result();
        

        
        
    }
}
   








    

