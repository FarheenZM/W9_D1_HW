import models.Randomiser;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RandomiserTest {

    Randomiser randomiser;

    @Before
    public void setUp() throws Exception {
        randomiser = new Randomiser();
    }

    @Test
    public void hasNames() {
        assertEquals(7, randomiser.getStudentNames().size());
    }

//    @Test
//    public void canGiveARandomName() {
//        randomiser.addNames();
////        assertEquals(randomiser.get(0), randomiser.giveARandomName());
//        assertEquals(true, randomiser.giveARandomName() instanceof String);
//    }

}
