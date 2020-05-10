package com.rvce;

import com.cse.Thirdsem;
public class CSEDept extends Thirdsem{
    private String welcome(String arg){
        return "Welcome "+arg+" department third sem young and budding engineers";
    }
    public void welcomeMessage(){
        System.out.println(welcome("CSE"));
    }
    

    public static void main(String[] args) {
        new CSEDept().welcomeMessage();
        new Thirdsem().welcomeMessage();
    }
}