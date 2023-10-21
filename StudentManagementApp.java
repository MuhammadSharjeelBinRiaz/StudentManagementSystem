import java.util.Scanner;

class StudentManagementApp{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Student you want to enter: ");
        int noOfStudents=sc.nextInt();

        Student[] student = new Student[noOfStudents];
        
        for(int n = 0 ; n < noOfStudents ; n++){
            student[n] = new Student();   
            System.out.println();
        }
        for(int n = 0 ; n < noOfStudents ; n++){
        System.out.println(student[n].toString());
        }
        sc.close();
    }

}