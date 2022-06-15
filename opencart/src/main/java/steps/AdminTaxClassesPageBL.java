package steps;

import pages.AdminTaxClassesPage;
import pages.containers.TaxClassContainer;

public class AdminTaxClassesPageBL {
    private AdminTaxClassesPage adminTaxClassesPage;

    public AdminTaxClassesPageBL() {
        adminTaxClassesPage = new AdminTaxClassesPage();
    }

    public AdminTaxClassesPageBL checkSummaryTaxClassesCheckbox() {
        if (!adminTaxClassesPage.getSummaryTaxClassesCheckbox().isSelected()) {
            adminTaxClassesPage.getSummaryTaxClassesCheckbox().click();
        }
        return this;
    }

    public AdminTaxClassesPageBL uncheckSummaryTaxClassesCheckbox() {
        if (adminTaxClassesPage.getSummaryTaxClassesCheckbox().isSelected()) {
            adminTaxClassesPage.getSummaryTaxClassesCheckbox().click();
        }
        return this;
    }

    public AdminTaxClassesPageBL checkTaxClassCheckbox(short id) {
        if (!adminTaxClassesPage.getTaxes().get(id).getTaxClassCheckbox().isSelected()) {
            adminTaxClassesPage.getTaxes().get(id).getTaxClassCheckbox().click();
        }
        return this;
    }

    public AdminEditTaxClassPageBL editTaxableGoodsClass(){
        for(TaxClassContainer taxClass: adminTaxClassesPage.getTaxes()){
            if(taxClass.getTaxClassTitle().getText().contains("Taxable Goods")){
                taxClass.getTaxClassEditButton().click();
                break;
            }
        }
        return new AdminEditTaxClassPageBL();
    }

}
