class Prime{

public static void main(String [] args){
int n=7;
int c=0;

for (int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if (c==2){
System.out.println("The no is prime");
}
else{
System.out.println("The no is not prime");
}

}//end of main
}//end of class
