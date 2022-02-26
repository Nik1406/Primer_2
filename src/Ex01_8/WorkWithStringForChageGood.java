package Ex01_8;

public class WorkWithStringForChageGood {
    public static void main(String[] args) {
        String str = "Vladivostok";
        System.out.println("In main - before call function - str="+str);
        str = changeString(str);
        System.out.println("In main - after call function - str="+str);
    }
    public static String changeString(String s){
        System.out.println("In changeString - before change - s="+s);
        s = s+" end.";
        System.out.println("In changeString - before change - s="+s);
        return s;
    }
}