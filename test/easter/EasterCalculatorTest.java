package easter;

import org.junit.*;

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
}