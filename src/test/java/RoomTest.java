import org.example.Room;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RoomTest {
    Room room;

    @Before
    public void before() {
        room = new Room("Double");
    }

    @Test
    public void hasDoubleType() {
        assertEquals("Double", room.getRoomType());
    }
}
