package easter;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



public class EasterCalculatorTest{




    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("@BeforeClass");
    }

    @Before
    public static void setUp() throws Exception{
        System.out.println("@Before");
    }

    @AfterClass
    public static void setDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }

    @After
    public static void tearDown() throws Exception{
        System.out.println("@After");
    }

    @Test
    public void easterDate1() throws Exception {

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