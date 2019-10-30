  import java.util.*;
class abc4
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
	char grade;
	int roll;
	float per;
	double marks;
	String name;
	System.out.println("enter grade");
	name=input.nextLine();
	grade=name.charAt(0);
	System.out.println("enter name");
	name=input.nextLine();
	System.out.println("enter roll no"); 
    roll=input.nextInt();
    System.out.println("enter marks");
    marks=input.nextDouble();
	System.out.println("enter percentage");
	per=input.nextFloat();
	
	System.out.println("Name :"+name);
	System.out.println("Roll no :"+roll);
	System.out.println("Marks :"+marks);
	System.out.println("Percentage :"+per);
	System.out.println("Grade :"+grade); 
	
	}
	} 