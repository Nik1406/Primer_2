package Ex01_11;

public class Rector {
    // инициализированная константа
    final int ID = (int) (Math.random() * 10);
    // неинициализированная константа
    final String NAME_RECTOR;

    public Rector() {
        // инициализация в конструкторе
        NAME_RECTOR = "Старый";
        // только один раз!!!
    }

    // {NAME_RECTOR = "Новый";}
    // только один раз!!!
    public final void jobRector() {
        // реализация
        // ID = 100;
        // ошибка!
    }
}
