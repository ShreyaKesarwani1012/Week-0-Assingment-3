class Calculator{
public static void main(String [] args){
int a=12;
int b=24;
char op='/';
float c;

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