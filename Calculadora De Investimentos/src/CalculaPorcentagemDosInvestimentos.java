public class CalculaPorcentagemDosInvestimentos {

    double rico;
    double modal;
    double clear;
    double sicredi;
    double nubank;
    double santander;
    double bradesco;

    public CalculaPorcentagemDosInvestimentos(double rico, double modal, double clear, double sicredi,
                                              double nubank, double santander, double bradesco) {
        this.rico = rico;
        this.modal = modal;
        this.clear = clear;
        this.sicredi = sicredi;
        this.nubank = nubank;
        this.santander = santander;
        this.bradesco = bradesco;
    }


    public CalculaPorcentagemDosInvestimentos(double rico, double modal, double clear) {
        this.rico = rico;
        this.modal = modal;
        this.clear = clear;
    }

    void info() {
        System.out.println("A conta Rico tem: R$" + rico);
        System.out.println("A conta Modal tem: R$" + modal);
        System.out.println("A conta Clear tem: R$" + clear);
        System.out.println("A conta Sicredi tem: R$" + sicredi);
        System.out.println("A conta Nubank tem: R$" + nubank);
        System.out.println("A conta Santander tem: R$" + santander);
        System.out.println("A conta Bradesco tem: R$" + bradesco);
    }


}
