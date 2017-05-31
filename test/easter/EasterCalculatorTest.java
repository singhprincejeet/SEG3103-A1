package easter;

import org.junit.*;

public class EasterCalculatorTest{

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("@BeforeClass");
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("@Before");
    }

    @AfterClass
    public static void setDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("@After");
    }

    @Test(expected = NullPointerException.class)
    public void easterDate1() throws Exception {
        int year = 1899;
        EasterCalculator.easterDate(year);
    }


    //test 11 -19
    @Test
    public void easterDate11() throws Exception {
/*    	int firstDate = new Date (1700,06,20);
		Date expectedDate = new Date (1700,06,21);
		Assert.assertEquals(expectedDate, firstDate.nextDate());*/
        System.out.println("hiiiii");
    }
    @Test
    public void easterDate12() throws Exception {
/*    	int firstDate = new Date (1700,06,20);
		Date expectedDate = new Date (1700,06,21);
		Assert.assertEquals(expectedDate, firstDate.nextDate());*/
    }
}