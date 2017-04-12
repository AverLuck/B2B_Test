import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by ПК on 12.04.2017.
 */
public class Rtc_Realization {



    private SelenideElement fzRtc44CheckBox = $(By.xpath("//*[contains(@id, 'RadioButton3')]"));
    private SelenideElement rtcDateCheckBox = $("#aStable1 > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(1) > label");
    private SelenideElement dateRtcFrom = $ ("#dnn_ctr691_View_dateFilter1From");
    private SelenideElement dateRtcTo = $("#dnn_ctr691_View_dateFilter1To");
    private SelenideElement buttonRtcShow = $ ("#dnn_ctr691_View_aSbuttonSearch");
    private SelenideElement quantityRtc =$("#dnn_ctr691_View_aStotalCount");
    


    public int searchWithRtcFz44Today (String dateRtcFirst, String dateRtcSecond)
    {
        fzRtc44CheckBox.click();
        //switchTo().window(1); переключениe на второе окно
        rtcDateCheckBox.click();
        dateRtcFrom.setValue(dateRtcFirst);
        dateRtcTo.setValue(dateRtcSecond);
        buttonRtcShow.click();
        String resultRtcString = quantityRtc.shouldBe(Condition.visible).getText();


    }




}
