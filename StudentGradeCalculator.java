import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        int no_subjects=6;
        int marks[] = new int[no_subjects];
        int i;
        float total=0, avg;
        Scanner sc = new Scanner(System.in);
		
        for(i=0; i<no_subjects; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = sc.nextInt();
           if(marks[i]<=100){
           total = total + marks[i];
           }
           else{
            System.out.println("Enter marks only below or equal to hundred. ");
            break;
           }
        }
        sc.close();
        avg = total/no_subjects;
        if(i==6){
        System.out.print("The Grade of Student is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.print("D");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.print("E");
        }
        else
        {
            System.out.print("F");
        }
        }
    }
}
