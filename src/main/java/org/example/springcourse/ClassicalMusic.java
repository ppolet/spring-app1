package org.example.springcourse;

public class ClassicalMusic implements Music {
    //---less 8 - fabric method (create new objects)
    // приватный конструктор не дает создавать объект класса через new
    private ClassicalMusic() {}

    //создаем фабричный метод. Static, т.к. иначе невозможно создать объект - конструктор private
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic(); // получаем новый объект класса
    }

    //---less 8 - init method
    public void doMyInit(){
        System.out.println("Doing my initialization (from class [ClassicalMusic], method [doMyInit])");
    }

    //---less 8 - destroy method
    public void doMyDestroy(){
        System.out.println("Doing my destruction (from class [ClassicalMusic], method [doMyDestroy])");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
