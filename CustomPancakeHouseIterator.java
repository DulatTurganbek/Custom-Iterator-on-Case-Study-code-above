package LB10;

import java.util.ArrayList;

public class CustomPancakeHouseIterator implements CustomMenuIterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public CustomPancakeHouseIterator(ArrayList<MenuItem> menuItems){
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
