import java.util.ArrayList;

/**
 * Reads dog weight data based on type (csv) and converts it into an arrayList of dogBreed
 */
public class DogReader {
    private static ArrayList<DogBreed> dogBreeds;

    /**
     * Given name of dog breed, finds and returns dog breed from list
     * @param name
     * @return
     */
    public static DogBreed findDogBreed(String name){
        for (DogBreed breed : dogBreeds){
            if (breed.getName().equalsIgnoreCase(name)){
                return breed;
            }
        }
        return null;
    }
}
