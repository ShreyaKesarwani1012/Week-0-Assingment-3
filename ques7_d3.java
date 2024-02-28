class Getnumber{

int a;

int getnumber(int a1)
{
a=a1;
return a;
}

public static void main(String [] agrs){
Check obj = new Check();
obj.getnumber(0);
int i ;
do {
i=obj.a;;
System.out.println(i);
}while(i!=0);

}
}

// if given no is not eqal to 0 the it will go  to infinite loop








