public class Animal {
     final String species;
     private Double weight;
     private boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if(species.equals("owczarek")) {
            weight = 30.0;
        } else if(species.equals("pinczer")){
            weight = 8.0;
        }

    }

}
