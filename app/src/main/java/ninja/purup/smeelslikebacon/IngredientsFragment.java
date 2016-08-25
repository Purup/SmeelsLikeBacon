package ninja.purup.smeelslikebacon;

/**
 * Created by jesper on 25/08/2016.
 */
public class IngredientsFragment extends CheckBoxesFragment{
    @Override
    public String[] getContents(int index){
        return Recipes.ingredients[index].split("`");
    }
}
