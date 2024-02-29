import java.util.Scanner;
class Calc{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Simple Calculator");
System.out.println("Enter First No ");
int a = sc.nextInt();
System.out.println("Enter Second No ");
int b = sc.nextInt();
float c ;
System.out.println("Enter Operator ");
System.out.println("+");
System.out.println("- ");
System.out.println("*");
System.out.println("/");
char op = sc.next().charAt(0);

switch(op){
    case '+':
	c=a+b;
	System.out.println("The sum is "+c);
	break;

case '*':
	c=a*b;
	System.out.println("The sum is "+c);
	break;

case '-':
	c=a-b;
	System.out.println("The sum is "+c);
	break;

case '/':
	c=b/a;
	System.out.println("The sum is "+c);
	break;

}
}

}