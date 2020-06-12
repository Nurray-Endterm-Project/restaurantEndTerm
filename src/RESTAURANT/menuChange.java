package RESTAURANT;

import java.util.ArrayList;

public interface menuChange extends menuFeatures {
    public void deleteMenu();
    public void updateMenu(ArrayList<Foods> foods);
}
