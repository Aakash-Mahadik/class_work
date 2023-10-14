/*WAP to implement  hierarchical inheritance .Create a class Employee with fields id,name,salary.Create  two more classes PermantEmp and ContractEmp in that add hike() method to display percentage hike in the salary
permantEmployee hike is 10% of the salary and contractEmployee salary will be  hiked by 5% of salary
 */

// class Employee{
//     int id , salary;
//     String name ;
//     public void hike(){
//         System.out.println("you are hard working employee, so you are going to get hike in salary");
//     }
// }
// class PermantEmp extends Employee{
//     @Override
//     public void hike(){
//         System.out.println("Hello "+name+"!!");
//         super.hike();
//         System.out.println("your salary hike will be 10%");
//         System.out.println("your new salary is: "+salary*1.1);
//     }
// }

// class ContractEmp extends Employee{
//     @Override
//     public void hike(){
//         System.out.println("Hello "+name+"!!");
//         super.hike();
//         System.out.println("Your salary hike will be 5%");
//         System.out.println("your new salary is: "+salary*1.05);
//     }
//     }

class Employee{
    int id , salary,serviceTime;
    String name ;
    public void hike(){
        System.out.println("you are hard working employee, so you are going to get hike in salary");
    }
    public void hikeDicision(){
        if(serviceTime>3){
            PermantEmp pe = new PermantEmp();
            pe.id = id;
            pe.name = name;
            pe.salary = salary;
            pe.serviceTime = serviceTime;
            pe.hike();
        }else{
            ContractEmp ce=new ContractEmp();
            ce.id = id;
            ce.name = name;
            ce.salary = salary;
            ce.serviceTime = serviceTime;
            ce.hike();
        }
    }
}
class PermantEmp extends Employee{
    @Override
    public void hike(){
        System.out.println("Hello "+name+"!!");
        super.hike();
        System.out.println("your salary hike will be 10%");
        System.out.println("your new salary is: "+salary*1.1);
    }
}

class ContractEmp extends Employee{
    @Override
    public void hike(){
        System.out.println("Hello "+name+"!!");
        super.hike();
        System.out.println("Your salary hike will be 5%");
        System.out.println("your new salary is: "+salary*1.05);
    }
    }

public class HierarchicalInhe {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id=5254;
        e.name="Rahul";
        e.salary=50000;
        e.serviceTime=2;
        e.hikeDicision();

        e.id=3698;
        e.name="Aakash";
        e.salary=75000;
        e.serviceTime=5;
        e.hikeDicision();
    }
}
