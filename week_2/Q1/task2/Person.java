
package task2;

/**
 *
 * @author JAM
 */
public class Person {
    String name;
    String address;
    String Phone_num;
    String email_address;
    
    public Person(){
        
    }
    public Person(String n ,String add ,String Phone , String email){
        name = n;
        address = add;
        Phone_num = Phone ;
        email_address = email;
        
     
    }
    @Override
    public String toString(){
      return name +"Person"  ;
      
    }
    
}
