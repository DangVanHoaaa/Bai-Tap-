package bai6;

import java.util.*;
public class Employee extends Person{
    protected String mnv;
    protected int luong;
    public Employee() {  
    }
    public Employee(String name, int age, char gender, String mnv, int luong) {
        super(name, age, gender);
        this.mnv = mnv;
        this.luong = luong;
    }
    public String getMnv() {
        return mnv;
    }
    public void setMnv(String mnv) {
        this.mnv = mnv;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    @Override
    public String toString() {
        return "Employee [mnv=" + mnv  + super.toString() + ", luong=" + luong + "]";
    }
    
    
    
    
    
    
    
}