
public class variable {
    
        private String name;
        private String engine;
        int d;		//instance variable
	    int f=700;
	    public static int e=500;	//static variable
        
        public static int numberOfCars;
        
        public variable(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }
        void sum()
        {
            int a=100;	//local variable
        }
        void mul()
        {
            int b=400;		//local variable
            //int c=a+b;	//error because we cannot use local variable a inside mul() method
            int c=d+b+e;	
        }
        
        static void divide()
        {
            int rollno=101;	//local variable
            //int res=d;	//error because d is not static variable
        }
    
        // getters and setters
    public static void main(String[] args) {
        /*
         * there are three types of varibalbe can be declared in java
         * 1) local variable    2) Instance Variable    3) Static variable
         * 
         * 1 ) Local variable : 
         *      - declaration : local variable are declared with in the body of methods , constructors or blocks
         *      - scope : local variables can be used within the method constructors or blocks but not outside 
         *      - allocation & deallocation : local variable get allocated when their method or constructor get executed 
         *                  and deallocated when execution completes
         *      - Stored memory area : local variable get memory allocated in "Stack area " , since the main method also resides in the stack area , if main method call  method , it will pushed into the stack and all the local variables in method also resides on stack and after the method get out of scope , it get poped from stacks and execution point start refer to main method again .
         *          - Default value : local variable do not have default value unless it will throw error
         *          - Access modifier : local variable do not supports access modifiers 
         * 
         * 2) Instance variable : 
         *      - Declaration : instance variable declared within the class but outside the method and contructors 
         *      - Scope : it can be used in methods , contructors blocks but not in static method or static blocks 
         *      - Allocation & Deallocation : instance variable get allocated whenever new object is created 
         *              and get deallocated when object destroyed 
         *      -  Stored memory area : instance variable are stored in "Heap area" , and everytime new object is created it also create new instance variable on heap
         *      - Default values : default value is 0 for every data type.
         *      - Access modifier : we can used access modifier with instance variable
         * 
         * 
         * 3) Static Variable : 
         *         - Declaration : static variable also declared within the class but outside the method , constructors , with static keyword 
         *  <a href="https://www.baeldung.com/java-static#:~:text=Since%20static%20variables%20belong%20to,static%20fields%20without%20object%20initialization." /> [best resource]
         * - scope : static variable can be used in every method , static method or blocks , or static blocks or contructors
         *  - allocation : when java program run ,class file (byte code ) loaded in jvm and static variable then get allocated in memory 
         *  - Stored memory area : static variable are stored in "Method area" 
         *  - Default values : default values of static variable are 0
         *  - Access modifier ; can use 
         */
        variable v = new variable("name", "engine");
        variable v2 = new variable("name", "engine");
        variable v1 = new variable("name", "engine");
        System.out.println(variable.numberOfCars);
    }
}
