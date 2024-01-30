package session02;




public class session02 {

    public static void main(String[] args) {

//        String stringLiteral="Hello World";
//        String s3=new String("hello");
//        int a=s3.length();
//        System.out.println(a);
//        System.out.println("the length is :"+stringLiteral.length());
//        char b=s3.charAt(0);
//        char c=s3.charAt(s3.length()-1);
//        System.out.println(stringLiteral.substring(3));
//        System.out.println(stringLiteral.substring(3,8));
//        System.out.println(s3.concat(stringLiteral));
//        System.out.println(stringLiteral.equals(s3));
//        System.out.println(stringLiteral.indexOf("ld"));
//
//        System.out.println(b);
//        System.out.println(c);

//       *** part2: string Formatting ***
//        String name="         farzaneh noori             ";
//        String greeting=String.format("%s to %s ", "Hello",name);
//        System.out.println(greeting);
//
//        String a=greeting.toUpperCase();
//        System.out.println(a);
//        System.out.println(a.split(" ")[2]);
//        System.out.println(name.trim());
//        System.out.println(greeting.replace("Hello","Hiii"));

//        *** part3-hands-on-questions ***

        String name="Farzaneh";
        int age=33;
        String introduce=String.format("I am %s and i am %d years old .",name,age );
        System.out.println(introduce);
        introduce=introduce.toUpperCase();
        System.out.println(introduce);
        introduce=introduce.replace("FARZANEH","DOTIN");
        System.out.println(introduce);
        int dotinindex=introduce.indexOf("DOTIN");
        System.out.println(dotinindex);
        int dotinlength="DOTIN".length();
        System.out.println(dotinindex);
        System.out.println(introduce.substring(0,dotinindex+dotinlength));


    }
}
