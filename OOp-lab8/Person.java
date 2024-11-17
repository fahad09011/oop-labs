public abstract class  Person{

    // person class is the MAIN class 
     
        private String name ;

        public Person (String name){
            this.name= name ;
        }

        public String getName() {
            return name;
        }
        
        public abstract  String getDescription();
    


    
}


