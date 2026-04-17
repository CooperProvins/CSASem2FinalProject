public class Main {
    /**
     * console program that recieves user input for dog breed, sex, weight
     * @param args arguments provided by application
     */
    public static void main(String[] args){
        // define variables that defines user's dog
        int dogWeight;
        Sex dogSex;
        String dogBreed;

        for (int i = 0; i < 8; i++){
            System.out.println(PortionGenerator.getPortion());
        }
    }
}
