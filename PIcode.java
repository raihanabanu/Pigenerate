# Pigenerate
import java.util.Scanner;
public class PIcode
public static void main (string[] args){
Scanner sc =new Scanner(System.in);
String str=sc.nextLine();
if(str.length()%3==0){
for(int i=0;i<str.length()-4;i+=3){
String s=str.substring(i,i+3);
System.out.print(s+".");
}
System.out.print(str.substring(str.length()-4));
}
else if(str.length()%3==1){
for(int i=0;i<str.length()-2;i+=3){
String s=str.substring(i,i+3);
System.out.print(s+".");
}
System.out.print(str.substring(str.length()-2));
}
else{
for(int i=0;i<str.length()-3;i+=3){
String s=str.substring(i,i+3);
System.out.print(s+".");
}
System.out.println(str.substring(str.length()-3));
}
}
}
