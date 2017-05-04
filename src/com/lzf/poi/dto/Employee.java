package com.lzf.poi.dto;


/**
 * Created by Administrator on 2017/5/3.
 */
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String nativePlace;
    private String entryDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public Employee(Integer id, String name, Integer age,String sex, String nativePlace, String entryDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nativePlace = nativePlace;
        this.entryDate = entryDate;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", entryDate='" + entryDate + '\'' +
                '}';
    }
}
