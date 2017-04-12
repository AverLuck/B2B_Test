import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by ПК on 12.04.2017.
 */
public class Rtc_Realization {

    Pattern pattern = Pattern.compile("[^\\d]*");


    private SelenideElement fz44RtcCheckBox = $(By.xpath("//*[contains(@id, 'RadioButton3')]"));
    private SelenideElement rtcDateCheckBox = $("#aStable1 > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(1) > label");
    private SelenideElement dateRtcFz44From = $("#dnn_ctr691_View_dateFilter1From");
    private SelenideElement dateRtcFz44To = $("#dnn_ctr691_View_dateFilter1To");
    private SelenideElement buttonRtcFz44Show = $("#dnn_ctr691_View_aSbuttonSearch");
    private SelenideElement quantityRtc = $("#dnn_ctr691_View_aStotalCount");
    private SelenideElement fz223RtcCheckBox = $("#dnn_ctr691_View_RadioButton9");
    private SelenideElement dateRtcFz223From = $("#BaseMainContent_MainContent_txtPublicationDate_txtDateFrom");
    private SelenideElement dateRtcFz223To = $("#BaseMainContent_MainContent_txtPublicationDate_txtDateTo");
    private SelenideElement buttomRtcFz223Show = $("#BaseMainContent_MainContent_btnSearch");
    private SelenideElement rtcPurchaseFz223CheckBox = $("#BaseMainContent_MainContent_chkPurchaseType_0");
    private SelenideElement loadingRtcFz223PageState = $("#load_BaseMainContent_MainContent_jqgTrade");
    private SelenideElement fz223RtcQuantityPages = $("#sp_1_BaseMainContent_MainContent_jqgTrade_toppager");
    private SelenideElement Fz223RtcButtomNextPage = $("#next_t_BaseMainContent_MainContent_jqgTrade_toppager > span");


    public int searchWithRtcFz44Today(String dateRtcFirst, String dateRtcSecond) {
        fz44RtcCheckBox.click();
        //switchTo().window(1); переключениe на второе окно
        rtcDateCheckBox.click();
        dateRtcFz44From.setValue(dateRtcFirst);
        dateRtcFz44To.setValue(dateRtcSecond);
        buttonRtcFz44Show.click();
        int resultRtcString = Integer.parseInt(quantityRtc.getText().replace(" ", ""));

        return resultRtcString;
    }

    public int searchWithRtcFz223Today(String dateRtcFz223First, String dateRtcFz223Second) {


        fz223RtcCheckBox.click();
        switchTo().window(1);
        dateRtcFz223From.setValue(dateRtcFz223First);
        dateRtcFz223To.setValue(dateRtcFz223Second);
        rtcPurchaseFz223CheckBox.click();
        buttomRtcFz223Show.click();
        loadingRtcFz223PageState.shouldBe(Condition.attribute("style", "display: none;"));
        ElementsCollection resultCollection = $$(By.xpath("//td[@aria-describedby='BaseMainContent_MainContent_jqgTrade_OosNumber']"));
        String allPages = fz223RtcQuantityPages.shouldBe().getText();
        String current;

        int purchaseWithEis = 0;

        for (SelenideElement i : resultCollection) {
            current = pattern.matcher(i.getText()).replaceAll("");
            if (current.equals("")) {
                continue;
            } else {
                purchaseWithEis++;
            }
            


        }

return 0;
    }


}
