package Ex01_3;

public class TwoConstructors {
    private int id;
    private String text;
    public TwoConstructors() {
        super(); // если класс будет написан без конструкторов, то компилятор
        // предоставит его именно в таком виде
    }
    public TwoConstructors(int idc, String txt) {
        super(); // вызов конструктора суперкласса явным образом необязателен,
        // компилятор вставит его автоматически
        id = idc;
        text = txt;
    }
}