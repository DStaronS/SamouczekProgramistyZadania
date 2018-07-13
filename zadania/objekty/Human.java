package pl.swieczkowski.zadania.objekty;

import java.util.Scanner;

public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public boolean isMale(String sex) {
        if(sex == "Male") {
            System.out.println(name + " jest mężczyzną.");
        }
        return true;
    }

    public Human(int age, int weight, int height, String name, String sex){
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setName(name);
        setSex(sex);
    }
    @Override
    public String toString(){
        return "Age: " +getAge()+"\nWeight: "+getWeight()+"\nHeight: "+getHeight()+"\nName: "+getName()+"\nSex "+getSex();
    }

}
