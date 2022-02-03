package Ex016;

public class WorkWithString {
    public static void main(String[] args) {
        String str = "MINSK";
        String str2 = str;
        System.out.println("str="+str+"   str2="+str2);
        str = str+" MOSKVA";
        System.out.println("str="+str+"   str2="+str2);
    }
}