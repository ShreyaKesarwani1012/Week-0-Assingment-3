class Check{

int a;

int getnumber(int a1 )
{
a=a1;
return a;
}

public static void main(String [] agrs){
Check obj = new Check();
obj.getnumber(3);

int i= obj.a;
while (i<10){
 i++;
int j=obj.a;
if(j==0){
break;
}
else if(j==1){
continue;
}

System.out.println(i);
//System.out.println(j);

}
System.out.println("finished");

}
}



// it will print output from given input no to 10 the print finish..








