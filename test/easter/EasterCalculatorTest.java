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
    public static void tearDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("@After");
    }

    @Test()
    public void easterDate0() throws Exception {
        int year = 1750;
        Assert.assertNull(EasterCalculator.easterDate(year));
    }

    @Test()
    public void easterDate1() throws Exception {
        int year = 1899;
        Assert.assertNull(EasterCalculator.easterDate(year));
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
        MyDate actualDate = EasterCalculator.easterDate(year);
        Assert.assertNull(actualDate);
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
    @Test
    public void easterDate20() throws Exception {
        int year = 2200;
        Assert.assertNull(EasterCalculator.easterDate(year));
    }


}