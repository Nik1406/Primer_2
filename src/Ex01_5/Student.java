package Ex01_5;

public class Student {
    private int id;
    public Student(int value) {
        id = value;
    }
    protected void finalize() throws Throwable {
        try {
            System.out.println("объект удален id=" + id);
        } finally {
            super.finalize();
        }
    }
}
