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

    @Test()
    public void easterDate1() throws Exception {
        int year = 1899;
        MyDate expectedDate = null;
        Assert.assertEquals(expectedDate, EasterCalculator.easterDate(year));
    }

    @Test
    public void easterDate2() throws Exception {
        int year = 1900;
        MyDate expectedDate = new MyDate("April", 15);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate3() throws Exception {
        int year = 1901;
        MyDate expectedDate = new MyDate("April", 7);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate4() throws Exception {
        int year = 2000;
        MyDate expectedDate = new MyDate("April", 23);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate5() throws Exception {
        int year = 2099;
        MyDate expectedDate = new MyDate("April", 12);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate6() throws Exception {
        int year = 2100;
        MyDate expectedDate = new MyDate("March", 28);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate7() throws Exception {
        int year = 2101;
        MyDate expectedDate = null;
        MyDate actualDate = EasterCalculator.easterDate(year);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void easterDate8() throws Exception {
        int year = 1953;
        MyDate expectedDate = new MyDate("April", 5);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate9() throws Exception {
        int year = 1954;
        MyDate expectedDate = new MyDate("April", 18);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
    }

    @Test
    public void easterDate10() throws Exception {
        int year = 1953;
        MyDate expectedDate = new MyDate("April", 5);
        String expectedDateStr = expectedDate.toString();
        MyDate actualDate = EasterCalculator.easterDate(year);
        String actualDateStr = actualDate.toString();
        Assert.assertEquals(expectedDateStr, actualDateStr);
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