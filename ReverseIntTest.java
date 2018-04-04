import static org.junit.Assert.*;

public class ReverseIntTest {

    ReverseInt reverseInt;

    @org.junit.Before
    public void setUp() throws Exception {
        reverseInt = new ReverseInt();
    }

    @org.junit.Test
    public void reverseTestCase1() throws Exception {
        assertEquals(12, reverseInt.reverse(21));
    }

    @org.junit.Test
    public void reverseTestCase2() throws Exception {
        assertEquals(0, reverseInt.reverse(0));
    }

    @org.junit.Test
    public void reverseTestCase3() throws Exception {
        assertEquals(1, reverseInt.reverse(1));
    }

    @org.junit.Test
    public void reverseTestCase4() throws Exception {
        assertEquals(122, reverseInt.reverse(221));
    }

    @org.junit.Test
    public void reverseTestCase5() throws Exception {
        assertEquals(31, reverseInt.reverse(13));
    }

    @org.junit.Test
    public void reverseTestCase6() throws Exception {
        assertEquals(2223, reverseInt.reverse(3222));
    }

    @org.junit.Test
    public void reverseTestCase7() throws Exception {
        assertEquals(1, reverseInt.reverse(100000));
    }

    @org.junit.Test
    public void reverseTestCase8() throws Exception {
        assertEquals(1135, reverseInt.reverse(5311));
    }

    @org.junit.Test
    public void reverseTestCase9() throws Exception {
        assertEquals(22, reverseInt.reverse(22));
    }

}