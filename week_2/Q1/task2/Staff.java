
package task2;

/**
 *
 * @author JAM
 */
public class Staff extends Employee{
    
    String Title;
        public Staff(String n, String add, String Phone, String email, String Off, String Sa ,String t) {
        super(n, add, Phone, email, Off, Sa);
        this.Title=t;
    }

    
       
    @Override
    public String toString(){
        return name +"Staff";
    }
}
