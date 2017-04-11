import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Averluck on 07.04.2017.
 */


public class B2b_Scenario {

    private static final DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
    private static final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy ");
    private static final Calendar cal = Calendar.getInstance();
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/Solar/chromedriver.exe");
        Configuration.browser = "chrome";
        open("http://b2bpoint.ru/");

    }

    @Test
    public void firstTest() {
        B2b_Realization tp = new B2b_Realization();
        int a1 = tp.searchWithZmoToday("07.04.2017");
        System.out.print(a1);
        open("http://beta.b2bpoint.ru/");
        int b1 = tp.searchWithZmoToday("07.04.2017");
        System.out.print(b1);
    }

    @Test
    public void secondTest() {
        B2b_Realization tp = new B2b_Realization();
        int a2 = tp.searchWithCommercial("07.04.2017");
        System.out.print(a2);
        open("http://beta.b2bpoint.ru/");
        int b2 = tp.searchWithCommercial("07.04.2017");
        System.out.print(b2);
    }

    @Test                       //значения не совпадают,нужно разобраться
    public void thirdTest() {
        B2b_Realization tp = new B2b_Realization();
        int a3 = tp.searchWith615("07.04.2017");
        System.out.print(a3);
        open("http://beta.b2bpoint.ru/");
        int b3 = tp.searchWith615("07.04.2017");
        System.out.print(b3);
    }

    @Test
    public void fourthTest() {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();                         //на 2 дня раньше(спросить у феди как можно переписать)
        String dateSecond = sdf.format(cal.getTime());


        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a4 = tp.searchWithFZ44Minus2(dateFirst, dateSecond);
        System.out.print(a4);

        open("http://beta.b2bpoint.ru/");
        int b4 = tp.searchWithFZ44Minus2(dateFirst, dateSecond);
        System.out.print(b4);
    }

    @Test                       //значения не совпадают,нужно разобраться
    public void fifthTest() {
        B2b_Realization tp = new B2b_Realization();

        Calendar cal = Calendar.getInstance();                         //на 2 дня раньше(спросить у феди как можно переписать)
        String dateSecond = sdf.format(cal.getTime());


        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a5 = tp.searchWithFZ44SmpMinus2(dateFirst, dateSecond);
        System.out.print(a5);

        open("http://beta.b2bpoint.ru/");
        int b5 = tp.searchWithFZ44SmpMinus2(dateFirst, dateSecond);
        System.out.print(b5);
    }

    @Test
    public void sixthTest()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());


        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a6 = tp.searchWithFZ223Minus2(dateFirst, dateSecond);
        System.out.print(a6);

        open("http://beta.b2bpoint.ru/");
        int b6 = tp.searchWithFZ223Minus2(dateFirst, dateSecond);
        System.out.print(b6);
    }

    @Test
    public void seventhTest()                   //на b2b пришло 45,и на бете 45.на сайте тоже 45 было
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a7 = tp.searchWithFZ223SmpMinus2(dateFirst, dateSecond);
        System.out.print(a7);

        open("http://beta.b2bpoint.ru/");
        int b7 = tp.searchWithFZ223SmpMinus2(dateFirst, dateSecond);
        System.out.print(b7);
    }

    @Test
    public void eighthTest()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a8 = tp.searchWithFZ223SmpMinus2(dateFirst, dateSecond);
        System.out.print(a8);

        open("http://beta.b2bpoint.ru/");
        int b8 = tp.searchWithFZ223SmpMinus2(dateFirst, dateSecond);
        System.out.print(b8);

    }
}
