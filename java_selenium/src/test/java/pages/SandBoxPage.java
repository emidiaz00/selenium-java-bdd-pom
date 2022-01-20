package pages;



public class SandBoxPage extends BasePage {

    private String cell = "//*[@id='root']/div";

    public SandBoxPage() {
        super(driver);
    }
    public void navigateToSandBoxPage() {
        navigateTo("https://1v2njkypo4.csb.app");
    }
    public String getValueFromGrid(int row, int column) {
        return getValueFromTable(cell, row, column);
    }


}
