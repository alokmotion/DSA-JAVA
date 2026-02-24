class ExceptionPractice {
    public static void  main (String [] args){

        try{
            checkAge(15)
        } catch(Exception e){
            System.out.println("error " e);
        } finally{
            System.out.println("Finised Program");
        }
    }

    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("You are not eligible for vote");
        } 
        System.out.println("Eligible");
    }
}