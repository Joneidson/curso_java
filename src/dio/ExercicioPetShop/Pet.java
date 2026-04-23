package dio.ExercicioPetShop;

public class Pet {

    private final String name;

    private boolean petClean;

    public Pet(String name) {
        this.name = name;
        this.petClean = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPetClean() {
        return petClean;
    }

    public void setPetClean(boolean petClean) {
        this.petClean = petClean;
    }

}
