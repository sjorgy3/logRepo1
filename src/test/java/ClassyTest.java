import junit.framework.TestCase;

public class ClassyTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testReturnClassy() {
        Classy c = new Classy();
        assertEquals("classy", c.returnClassy());
    }
}