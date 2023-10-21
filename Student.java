import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private int gradeLevel;
    private String gradeString;
    private double balance = 0.00;
    private String courses="";
    private static double costOfCourse = 600.00;
    private static int uniqueId = 1000;
    Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName=in.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName=in.nextLine();
        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n\nEnter your grade Level: ");
        this.gradeLevel = in.nextInt();
        switch(gradeLevel){
            case 1:
             gradeString  = "Fr";
             break;
            case 2:
             gradeString = "So";
             break;
            case 3:
             gradeString = "Ju";
             break;
            case 4:
            gradeString = "Se";
            break;
            default:
            System.out.println("Enter values 1 - 4");
            break;

    }
        setStudentId();
        enrollCourses();
        payTuition();

    }
    private String setStudentId(){
        this.studentId =  gradeString + "-" + uniqueId;
        uniqueId++;
        return studentId;
    }
    public void enrollCourses(){
        Scanner in = new Scanner(System.in);
        do{
        System.out.print("Enter course to enroll (Q to quit): ");
        String course = in.nextLine();
        if(!course.equals("Q")){
            courses += "\n" + course;
            balance += costOfCourse;
        }
        else{
            break;
        }
    }while (1 != 0);
}

public void showBalance(){
    System.out.println("Your balance is :$"+balance);
}
public void payTuition(){
showBalance();
Scanner sc = new Scanner(System.in);
System.out.print("Enter your payment :$");
double payment = sc.nextDouble();
System.out.println("Thanks for your payment of $"+payment);
balance-=payment;
showBalance();
}
    
@Override
    public String toString (){
        return "Name: "+firstName +" "+lastName +"\nID: " +studentId
        +"\nGrade Year: "+gradeLevel +"\nCourses: "+courses +"\nBalance: $"+balance;
    }
    }

