class Echo{
int a;

int getNumber(int a1){
a= a1;
return a;
}

public static void main(String [] args){
Echo obj = new Echo();
obj.getNumber(4);

int i= obj.a;
while(i>=0){
		if (i==0){
		System.out.println(i);
		break;
		}
	else{
		System.out.println(i);

		}
i--;
}
}
}