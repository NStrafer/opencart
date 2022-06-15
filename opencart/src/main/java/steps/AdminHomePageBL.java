package steps;

import driver.Driver;
import org.openqa.selenium.ElementNotVisibleException;
import pages.AdminHomePage;

public class AdminHomePageBL {
    private  AdminHomePage adminHomePage;
    public AdminHomePageBL() {
        adminHomePage = new AdminHomePage();
    }

    public AdminHomePageBL clickDevelopmentSettingButton(){
        adminHomePage.getDeveloperSettingButton().click();
        return this;
    }

    public AdminHomePageBL dropCalendarSalesAnalyticsRange(){
        try{
        adminHomePage.getDropDownTimeRangeButton().click();
        } catch (ElementNotVisibleException dropTimeRange){
            Driver.waitForElement(adminHomePage.getDropDownTimeRangeButton());
            adminHomePage.getDropDownTimeRangeButton().click();
        }
        return this;
    }

    public AdminHomePageBL chooseTimeRangeOneDay(){
        dropCalendarSalesAnalyticsRange();
        try{
            adminHomePage.getTodayRangeSalesAnalyticsButton().click();}
        catch (ElementNotVisibleException chooseOneDayRange){
            Driver.waitForElement(adminHomePage.getTodayRangeSalesAnalyticsButton());
            adminHomePage.getTodayRangeSalesAnalyticsButton().click();
        }
        return this;
    }

    public AdminHomePageBL chooseTimeRangeOneWeek(){
        dropCalendarSalesAnalyticsRange();
        try{
            adminHomePage.getWeekRangeSalesAnalyticsButton().click();}
        catch (ElementNotVisibleException chooseOneWeekRange){
            Driver.waitForElement(adminHomePage.getWeekRangeSalesAnalyticsButton());
            adminHomePage.getWeekRangeSalesAnalyticsButton().click();
        }
        return this;
    }

    public AdminHomePageBL chooseTimeRangeOneMonth(){
        dropCalendarSalesAnalyticsRange();
        try{
            adminHomePage.getMonthRangeSalesAnalyticsButton().click();}
        catch (ElementNotVisibleException chooseOneWeekRange){
            Driver.waitForElement(adminHomePage.getMonthRangeSalesAnalyticsButton());
            adminHomePage.getMonthRangeSalesAnalyticsButton().click();
        }
        return this;
    }

    public AdminHomePageBL chooseTimeRangeOneYear(){
        dropCalendarSalesAnalyticsRange();
        try{
            adminHomePage.getYearRangeSalesAnalyticsButton().click();}
        catch (ElementNotVisibleException chooseOneWeekRange){
            Driver.waitForElement(adminHomePage.getYearRangeSalesAnalyticsButton());
            adminHomePage.getYearRangeSalesAnalyticsButton().click();
        }
        return this;
    }

    public AdminHomePageBL clickViewOrder(short id){
        adminHomePage.getOrders().get(id).getOrderViewButton().click();
        return this;
    }

    public AdminHomePageBL zoomInMap(){
        adminHomePage.getZoomInMapButton().click();
        return this;
    }

    public AdminHomePageBL zoomOutMap(){
        adminHomePage.getZoomOutMapButton().click();
        return this;
    }

    public AdminHomePageBL clickViewMoreTotalOrders(){
        adminHomePage.getTotalOrdersViewMoreButton().click();
        return this;
    }

    public AdminHomePageBL clickViewMoreTotalSales(){
        adminHomePage.getTotalSalesViewMoreButton().click();
        return this;
    }

    public AdminHomePageBL clickViewMoreTotalCustomers(){
        adminHomePage.getTotalCustomersViewMoreButton().click();
        return this;
    }

    public AdminHomePageBL clickViewMorePeopleOnline(){
        adminHomePage.getPeopleOnlineViewMoreButton().click();
        return this;
    }

}
