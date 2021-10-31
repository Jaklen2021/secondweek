/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

public class Task2 {

    
    public static void main(String[] args) {
        Person p1 =new Person("JAK","Ciro","1234","JAK12@gmail.com");
        System.out.println(p1.toString());
        
        Student s1 = new Student("AA","ss","4567","wrd@gmail.com");
        System.out.println(s1.toString());
        
        Employee e = new Employee("hh","kk","yf@gmail.com","456","room12","4567");
        System.out.println(e.toString());
        
        Faculty F = new Faculty("hg","poi","fgh@gmail.com","room56","3456","8","leader");
        System.out.println(F.toString());
        
        Staff st = new Staff ("gfgh","ryj","ghj@gmail.com","345678","monitor");
        System.out.println(st.toString());
        
    }
    
}
