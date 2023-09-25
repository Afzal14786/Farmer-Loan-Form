package Pakage_1;

class employee{
    private salary slr;
    public employee(salary slr){
        this.slr=slr;
    }
    public void salary(){
        slr.mySalary();
    }
}

class salary{
    public void mySalary(){
        System.out.println("My Average Salary is : 10000");
    }
}

public class file_2 {
    public static void main(String[] args) {
        salary slr = new salary();
        employee emp = new employee(slr);
        slr.mySalary();
    }
}
