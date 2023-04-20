package string;

public class StringFunctiondemo {
	public static void main(String[] args) {
		//String literal
//We use it mainly to save memory so that new memories are not created for the same String
	String name="Sumaiyya";
	String name1="Sumaiyya";//I doesn't create a new instance
	String str = "welcome";
	System.out.println(name==name1);
	//checking if name is same as str since it is different the o/p will return false
	System.out.println(name==str);
	//joining using concatenate function
	name=name.concat(" Shaikh");
	System.out.println(name);
	 System.out.println("===================");
	
	System.out.println();
	String message = "Good Morning";
	int index =11;
	char ch = message.charAt(index);
	System.out.println(index+"th character : "+ch);
	 System.out.println("===================");
	
	//By using new Keyword
	String str1 = new String("Welcome");
	String str2 = new String("Welcome");
	System.out.println(str1==str2);//comapring the refenrences
    System.out.println(str1.equals(str2));//comparison of values
    System.out.println("===================");
    
    //lexographically checking
    String s1="hello";//104
    String s2="hello";
    String s3="meklo";
    String s4="hemlo";
    String s5="flag";
    
    System.out.println(s1.compareTo(s2));//0
    System.out.println(s1.compareTo(s3));//-5
    System.out.println(s3.compareTo(s1));//5
    System.out.println(s1.compareTo(s4));//-1
    System.out.println(s1.compareTo(s5));//2
    System.out.println("===================");
    
    String high="king";
    System.out.println(high.toUpperCase());
    String low="KING";
    System.out.println(low.toLowerCase());
    System.out.println("===================");
    
    //String buffer --> mutable 
    StringBuffer buffer = new StringBuffer("Hello Java ");//default capacity 16
    System.out.println(buffer.capacity());//27
    buffer.append(" World this is a welcome Message");//appending or adding the string
    System.out.println(buffer);//(27*2)+2=56
    System.out.println(buffer.capacity());
    System.out.println("===================");
    
    //charAt(index)
    System.out.println(buffer.charAt(4));
    System.out.println(buffer.indexOf("ello"));//checking the index of the word
    System.out.println("===================");
    
    //Substring is used in two ways--> 
    //1) by giving the starting index it will print rest of the string
    System.out.println(buffer.substring(6));
    
    //2)by giving the start index and end index-1
    System.out.println(buffer.substring(6,10));
    System.out.println("===================");
    
    //it will delete the string present in the index(in our case)
    buffer.delete(6, 10);
    System.out.println(buffer);
    System.out.println("===================");
    
    //String builder
    StringBuilder builder = new StringBuilder("java 20");
    System.out.println("String Builder : "+builder);
    builder.append(" Latest version");
    System.out.println(builder);
    builder.insert(7, " is the");//insert a string from the index which is provided
    System.out.println(builder);
    builder.reverse();//to reverse a string builder
    System.out.println(builder);
    System.out.println(builder.indexOf("avaj"));//fnding the position of avaj
    builder.replace(25, 29, "java");//replacing avaj by java
    System.out.println(builder);
   }
}
