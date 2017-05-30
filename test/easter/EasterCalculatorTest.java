package easter;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@RunWith(Parameterized.class)
public class EasterCalculatorTest{

    private int year;
    private MyDate expectedDate;

    public EasterCalculatorTest(int year, MyDate expectedDate) {
        this.year = year;
        this.expectedDate = expectedDate;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List <Objects[]> arrayYears = new LinkedList<Objects[]>();
        //arrayYears.add();
        
        return null;
    }


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
}