package ninja.purup.smeelslikebacon;

/**
 * Created by jesper on 25/08/2016.
 */
public class DirectionsFragment extends CheckBoxesFragment{
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
