import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by Averluck on 07.04.2017.
 */
public class B2b_Realization {
    private SelenideElement zmo = $("#SearchForm > div:nth-child(1) > div > div > div > label:nth-child(8) > i");
    private SelenideElement dateFrom = $("#DatePublishedFrom");
    private SelenideElement dateTo = $("#DatePublishedTo");
    private SelenideElement buttonSelectTender = $("#SearchForm > div:nth-child(2) > div > div > div > div > button");
    private SelenideElement rts = $("#SearchForm > div:nth-child(2) > div > div > div > div > div > ul > li:nth-child(1) > label");
    private SelenideElement buttomShow = $("#SearchForm > span.btn.btn-type1.mt2.Search");
    private SelenideElement quantity = $("body > div.allwrapper > div.allcontent > div.bCenter.layout > div.main > div.clearfix > div.right_column > div.pull-left > span");
    private SelenideElement commercial = $("#SearchForm > div:nth-child(1) > div > div > div > label:nth-child(11) > i");
    private SelenideElement pprf615 = $("#SearchForm > div:nth-child(1) > div > div > div > label:nth-child(14) > i");
    private SelenideElement fz44 = $("#SearchForm > div:nth-child(1) > div > div > div > label:nth-child(2) > i");
    private SelenideElement smp = $("#SearchForm > div:nth-child(3) > div > div > div > label > i");
    private SelenideElement fz223 = $ ("#SearchForm > div:nth-child(1) > div > div > div > label:nth-child(5) > i");


    public int searchWithZmoToday(String date) {
        zmo.click();
        dateFrom.setValue(date);
        dateTo.setValue(date);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int resultZmo = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));
        return resultZmo;
    }

    public int searchWithCommercial(String date) {
        commercial.click();
        dateFrom.setValue(date);
        dateTo.setValue(date);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int resultCommercial = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));
        return resultCommercial;
    }

    public int searchWith615(String date)
    {
        pprf615.click();
        dateFrom.setValue(date);
        dateTo.setValue(date);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int result615 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));
        return result615;
    }


    public int searchWithFZ44Minus2(String dateFirst, String dateSecond)
    {
        fz44.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.shouldBe(Condition.visible).getText();           //метод для разбиения числа
        Pattern pattern = Pattern.compile("[^\\d]*");       //склеиваем оба числа
        String tmp = pattern.matcher(resultString).replaceAll("");
        tmp = tmp.replace(",1000","");
        int resultfz44 = Integer.parseInt(tmp);
        return resultfz44;
    }

    public int searchWithFZ44SmpMinus2 (String dateFirst, String dateSecond)
    {
        fz44.click();
        smp.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.shouldBe(Condition.visible).getText();           //метод для разбиения числа
        Pattern pattern = Pattern.compile("[^\\d]*");       //склеиваем оба числа
        String tmp = pattern.matcher(resultString).replaceAll("");
        tmp = tmp.replace(",1000","");
        int resultfz44Smp = Integer.parseInt(tmp);
        return resultfz44Smp;

    }

    public int searchWithFZ223Minus2(String dateFirst, String dateSecond)
    {
        fz223.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int resultFz223 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));
        return resultFz223;

    }

    public int searchWithFZ223SmpMinus2(String dateFirst, String dateSecond) {
        fz223.click();
        smp.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int resultFz223Smp = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));

        return resultFz223Smp;
    }

    public int searchWithZmoMinus2(String dateFirst, String dateSecond)
    {  //9th test
        zmo.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.shouldBe(Condition.visible).getText();           //метод для разбиения числа
        Pattern pattern = Pattern.compile("[^\\d]*");       //склеиваем оба числа
        String tmp = pattern.matcher(resultString).replaceAll("");
        tmp = tmp.replace(",1000","");
        int resultZmoMinus = Integer.parseInt(tmp);

        return resultZmoMinus;
    }

    public int searchWithZmoSmpMinus2(String dateFirst, String dateSecond)
    {
        zmo.click();
        smp.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();
        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d,]*");
        int resultZmoSmpMinus2 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));

        return resultZmoSmpMinus2;
    }
    public int searchWithCommercialMinus2(String dateFirst , String dateSecond)
    {
        commercial.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d]*");
        int resultCommercialMinus2 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));

        return resultCommercialMinus2;
    }
    public int searchWithCommercialSmpMinus2( String dateFirst , String dateSecond)
    {
        commercial.click();
        smp.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d]*");
        int resultCommercialSmpMinus2 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));

        return resultCommercialSmpMinus2;
    }

    public int searchWithCommercialPprf615minus2 ( String dateFirst , String dateSecond)
    {
        pprf615.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.getText();
        Pattern pattern = Pattern.compile("[^\\d]*");
        int resultPprf615Minus2 = Integer.parseInt(pattern.matcher(resultString).replaceAll(""));

        return resultPprf615Minus2;

    }
    public int searchWithFz44WithRtcToday(String dateFirst, String dateSecond)
    {
        fz44.click();
        dateFrom.setValue(dateFirst);
        dateTo.setValue(dateSecond);
        buttonSelectTender.click();
        rts.click();
        buttonSelectTender.click();
        buttomShow.click();

        String resultString = quantity.shouldBe(Condition.visible).getText();           //метод для разбиения числа
        Pattern pattern = Pattern.compile("[^\\d]*");       //склеиваем оба числа
        String tmp = pattern.matcher(resultString).replaceAll("");
        tmp = tmp.replace("1000","");
        int resultFz44WithRtcToday = Integer.parseInt(tmp);





        return resultFz44WithRtcToday;
    }
}

