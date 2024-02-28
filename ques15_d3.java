class Sum{
public static void main(String [] args){
int n=19854;
int r;
int s=0;
do{
r=n%10;
s=s+r;
n=n/10;
}while(n>0);
System.out.println("the sum is "+s);
}
}

