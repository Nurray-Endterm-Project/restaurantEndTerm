package RESTAURANT;

import java.util.ArrayList;

public interface menuChange extends menuFeatures {
    public void deleteMenu(ArrayList<String> foods);
    public void updateMenu(ArrayList<String> foods);
    public void setMenu(ArrayList<String> foods);
}
