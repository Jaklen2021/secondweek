
package task2;


public class Student extends Person {
    final String St1 ="Ali";
    final String St2="Alaa";
    final String St3 ="Omer";
    final String St4= "may";
    
    public Student(String n,String add , String Phone , String email ){
        super (n , add , Phone , email);
    }

    Student(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return name +"Student";
    }
}
