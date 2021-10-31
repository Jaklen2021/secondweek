
package task2;

/**
 *
 * @author JAM
 */
public class Faculty extends Employee {
    double work_hour;
    String rank;
    
    public Faculty(String n, String add, String Phone, String email, String Off, String Sa ,double w ,String r ) {
        super(n, add, Phone, email, Off, Sa);
        this.work_hour=w;
        this.rank=r;
    }

    



    
    @Override
    public String toString(){
        return name +"Faculty";
    }
    
}
