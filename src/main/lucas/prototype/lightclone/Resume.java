package main.lucas.prototype.lightclone;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String time;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String time, String company) {
        this.time = time;
        this.company = company;
    }

    public void show() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历： " + this.time + " " + this.company);
    }

    public Resume clone() {
        Resume object = null;
        try {
            object = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
