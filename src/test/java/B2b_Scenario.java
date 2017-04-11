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
        System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver/chromedriver.exe");
        Configuration.browser = "chrome";
        open("http://b2bpoint.ru/");

    }

    @Test
    public void TestZmoToday() {
        B2b_Realization tp = new B2b_Realization();
        int a1 = tp.searchWithZmoToday("07.04.2017");
        System.out.print(a1);
        open("http://beta.b2bpoint.ru/");
        int b1 = tp.searchWithZmoToday("07.04.2017");
        System.out.print(b1);
    }

    @Test
    public void TestCommercial() {
        B2b_Realization tp = new B2b_Realization();
        int a2 = tp.searchWithCommercial("07.04.2017");
        System.out.print(a2);
        open("http://beta.b2bpoint.ru/");
        int b2 = tp.searchWithCommercial("07.04.2017");
        System.out.print(b2);
    }

    @Test                       //значения не совпадают,нужно разобраться
    public void Test615() {
        B2b_Realization tp = new B2b_Realization();
        int a3 = tp.searchWith615("07.04.2017");
        System.out.print(a3);
        open("http://beta.b2bpoint.ru/");
        int b3 = tp.searchWith615("07.04.2017");
        System.out.print(b3);
    }

    @Test
    public void TestFz44minus2() {
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
    public void TestFz44SmpMinus2() {
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
    public void TestFZ223Minus2()
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
    public void TestFZ223SmpMinus2()                   //на b2b пришло 45,и на бете 45.на сайте тоже 45 было
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
    public void TestZmoMinus2()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a9 = tp.searchWithZmoMinus2(dateFirst, dateSecond);
        System.out.print(a9);

        open("http://beta.b2bpoint.ru/");
        int b9 = tp.searchWithZmoMinus2(dateFirst, dateSecond);
        System.out.print(b9);

    }

    @Test                                                           ///!!!!выдает результат ,но должно быть 0 и 0
        public void TestZmoSmpMinus2 ()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);                             //текущая дата (спросить у феди как можно переписать)
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a10 = tp.searchWithZmoSmpMinus2(dateFirst, dateSecond);
        System.out.print(a10);

        open("http://beta.b2bpoint.ru/");
        int b10 = tp.searchWithZmoSmpMinus2(dateFirst, dateSecond);
        System.out.print(b10);
    }
    @Test
        public void TestCommercialMinus2()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a11 = tp.searchWithCommercialMinus2(dateFirst, dateSecond);
        System.out.print(a11);

        open("http://beta.b2bpoint.ru/");
        int b11 = tp.searchWithCommercialMinus2(dateFirst,dateSecond);
        System.out.print(b11);

    }
    @Test
        public void TestCommercialSmpMinus2()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a12 = tp.searchWithCommercialSmpMinus2(dateFirst , dateSecond);
        System.out.print(a12);

        open("http://beta.b2bpoint.ru/");
        int b12 = tp.searchWithCommercialSmpMinus2(dateFirst , dateSecond);
        System.out.print(b12);

    }
    @Test
        public void TestrPprf615Minus2()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        cal.add(Calendar.DATE, -2);
        Date todate1 = cal.getTime();
        String dateFirst = dateFormat.format(todate1);
        int a13 = tp.searchWithCommercialPprf615minus2 (dateFirst, dateSecond);
        System.out.println(a13);

        open("http://beta.b2bpoint.ru/");
        int b13 = tp.searchWithCommercialPprf615minus2(dateFirst , dateSecond);
        System.out.println(b13);
    }
    @Test
        public void TestFz44WithRtcToday()
    {
        B2b_Realization tp = new B2b_Realization();
        Calendar cal = Calendar.getInstance();
        String dateSecond = sdf.format(cal.getTime());
        String dateFirst = sdf.format(cal.getTime());
        int a14 = tp.searchWithFz44WithRtcToday (dateFirst, dateSecond);
        System.out.println(a14);

        open ("https://www.rts-tender.ru/auctionsearch");
        

    }



}
