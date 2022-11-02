package encapsulation;

public class Employee {

    // data member or member variable or properties( name,age,department,roll number,and empid)

    private int empid; // data hiding

    // setter method : to set or modify the data (variables)

    public void setEmpId( int eid){

        empid =eid;
    }

    //getter method : to get or view the data(variables)

    public int getEmpId(){

        return ++empid;
    }
}

// the entire coding is encapsulation
// real world example of encapsulation : capsule, car engine
// example of encapsulation in coding form  is given above
// getter and setter is method, and it is used to provide the protection of data(variables)