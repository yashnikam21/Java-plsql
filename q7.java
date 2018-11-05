package assignment1;

public class q7 {

public static void main(String[] args) {
if((args.length)==2) {
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
getResult(n1,n2);
}
else {
System.out.println("You must enter only two integers.");
}

}

private static void getResult(int n1, int n2) {
int n3=0;
System.out.print(n1+"\t"+n2);
for(int i=0;i<13;i++) {
n3 = n1+n2;
System.out.print("\t"+n3);
n1 = n2;
n2 = n3;
}
}

}
