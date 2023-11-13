/*Правила для POJO класса включают в себя:

Класс должен быть public и иметь пустой конструктор.
Переменные экземпляра класса должны быть private и иметь геттеры и сеттеры для доступа к ним.
Класс не должен реализовывать никаких интерфейсов или наследоваться от других классов, которые не являются также POJO.
*/
public class Cat {
    private String name;

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
