class StringEx
{
public static void main(String args[])
{
String name = new String("  dhanush");
  String nameE = new String ("  Anish"); 

//character position(charAt)
char c1=name.charAt(6);
System.out.println(c1);
//upper case(toUpperCase)
String s1=name.toUpperCase();
System.out.println(s1);
//lowercase
String l1=s1.toLowerCase();
System.out.println(l1);
//concadinate(concat) and lowercase(toLowerCase)
String s2=name.concat(s1).concat(s1.toLowerCase());
System.out.println(s2);
//trim
String s3=s2.trim();
System.out.println(s3);
//length
int s4=name.length();
System.out.println(s4);
//startsWith
boolean s5=name.startsWith("d");
System.out.println(s5);
//endsWith
boolean s6=name.endsWith("h");
System.out.println(s6);
//equals
boolean s7=name.equals(s1);
System.out.println(s7);
//replace with trim
String rep1=name.trim().replace('d','a');
System.out.println(rep1);
//replaceAll
String rep2=name.replaceAll("h","x");
System.out.println(rep2);
//indexOf
int i1=s3.indexOf("a");
System.out.println(i1);
//lastIndesOf
int i2=name.lastIndexOf("a");
System.out.println(i2);
//lastIndesOf-1
int i3=name.lastIndexOf("s");
System.out.println(i3);

}
}
