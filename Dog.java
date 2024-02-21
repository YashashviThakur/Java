

public class Dog {
    private String name;
    private String breed;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getDogName() {
        return name;
    }

    public String getDogBreed() {
        return breed;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public void setDogBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Dusky", "Black Pomerian");
        Dog dog2 = new Dog("Rio", "Syberian Husky");

        System.out.println("Dog Name - " + dog1.getDogName());
        System.out.println("Dog Breed - " + dog1.getDogBreed());
        System.out.println("Dog Name - " + dog2.getDogName());
        System.out.println("Dog Breed - " + dog2.getDogBreed()+ "\n");
        

        dog1.setDogName("Rusky");
        dog2.setDogBreed("Golden Retriever");

        System.out.println("After Changing Through Setter - ");
        System.out.println("Dog Name - " + dog1.getDogName());
        System.out.println("Dog Breed - " + dog1.getDogBreed());
        System.out.println("Dog Name - " + dog2.getDogName());
        System.out.println("Dog Breed - " + dog2.getDogBreed());
    }
}

