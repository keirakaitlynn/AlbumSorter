import java.util.Comparator;

public class SortByTitleReverse implements Comparator<Album>
{

    @Override
    public int compare(Album o1, Album o2)
    {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
