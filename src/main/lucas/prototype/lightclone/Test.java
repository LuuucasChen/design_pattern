package main.lucas.prototype.lightclone;

import main.lucas.decorator.character.Person;

public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume("张三");
        resume1.setPersonalInfo("gg", "21");
        resume1.setWorkExperience("2002", "SouthernFund");

        Resume resume2 = resume1.clone();
        Resume resume3 = resume1.clone();

        resume1.show();
        resume2.show();
        resume3.show();
    }
}
