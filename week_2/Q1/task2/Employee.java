
package task2;

import javafx.scene.chart.PieChart.Data;


public class Employee extends Person{
    String Office ;
    String salary;
    Data data_hired;

    public Employee( String n , String add , String Phone , String email , String Off , String Sa) {
        super (n,add,Phone,email);
        this.Office=Off;
        this.salary=Sa;
    }
    public String toString (){
        return name+"Employee";
    }
    
    
    
}
