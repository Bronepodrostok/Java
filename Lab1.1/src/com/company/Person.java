package com.company;

interface Person {
    public int getAge();
    public void setAge(int age) throws Exception;
    public int getHeight();
    public void setHeight(int height) throws Exception;
    public String getName();
    public void setName(String name);
    public Gender getGender();
    public void setGender(Gender gender);
    public String toString();
}