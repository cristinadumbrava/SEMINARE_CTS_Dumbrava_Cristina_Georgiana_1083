package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterClaseRestaurant extends SoftBar implements ISoftRestaurant {

    public AdapterClaseRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalSuma) {
        super.printeazaNotaBauturi(totalSuma);
    }
}
