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
    public void setUp() throws Exception{
        System.out.println("@Before");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("@After");
    }

    @Test
    public void easterDate1() throws Exception {

    }


    //test 11 -19

    @Test
    public void EasterDate11() throws Exception {
    	int year = 1980;
		String expectedDate = new MyDate ("April",6).toString();
		Assert.assertEquals(expectedDate, EasterCalculator.easterDate(1980).toString());
    }

    @Test
    public void easterDate12() throws Exception {
        int year = 1981;
        String expectedDate = new MyDate ("April",19).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(1981).toString());
    }
    @Test
    public void easterDate13() throws Exception {
        int year = 1982;
        String expectedDate = new MyDate ("April",11).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(1982).toString());
    }
    @Test
    public void easterDate14() throws Exception {
        int year = 2048;
        String expectedDate = new MyDate ("April",05).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2048).toString());
    }
    @Test
    public void easterDate15() throws Exception {
        int year = 2049;
        String expectedDate = new MyDate ("April",18).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2049).toString());
    }
    @Test
    public void easterDate16() throws Exception {
        int year = 2050;
        String expectedDate = new MyDate ("April",10).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2050).toString());
    }

    @Test
    public void easterDate17() throws Exception {
        int year = 2075;
        String expectedDate = new MyDate ("April",07).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2075).toString());
    }
    @Test
    public void easterDate18() throws Exception {
        int year = 2076;
        String expectedDate = new MyDate ("April",19).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2076).toString());
    }
    @Test
    public void easterDate19() throws Exception {
        int year = 2077;
        String expectedDate = new MyDate ("April",11).toString();
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(2077).toString());
    }


}