package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        System.out.println("Masa a fost rezervata pentru " + numarPersoane + " persoane la restaurantul " + this.numeRestaurant + ".");
    }
}
