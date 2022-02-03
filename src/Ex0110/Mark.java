package Ex0110;

public class Mark {
    private int mark = 3;
    public static int coeff = 5;
    public double getResult1() {
        return (double) coeff * mark / 100;
    }
    public static void setCoeffFloat(float c) {
        coeff = (int) (coeff * c);
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    // из статического метода нельзя обратиться
    // к нестатическим полям и методам
    public int getResult2() {
        setMark(5);// ошибка
        return coeff * mark / 100;// ошибка
    }
}