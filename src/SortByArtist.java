import java.util.Comparator;

public class SortByArtist implements Comparator<Album>
{
    @Override
    public int compare(Album o1, Album o2)
    {
        return (o1.getArtist().compareTo(o2.getArtist()));
    }
}
