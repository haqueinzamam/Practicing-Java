public class strings {
    public static void main(String[] args) {
        //concatetnate 
        String name1 = "Zakariya";
        String name2 = "Inzamam";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);
        //charAt
        System.out.println(name1.charAt(1));
        //length
        System.out.println(name3.length());
        //replace
        String name4 = name1.replace("Z", "B");
        System.out.println(name4);
        //substring
        String name5 = "Arbaaz and Zakariya";
        System.out.println(name5.substring(0, 6));
    
    }
}
 