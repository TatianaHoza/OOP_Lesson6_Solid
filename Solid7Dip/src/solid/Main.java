package solid;

import solid.dip.Print;
import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        Print print = new PrintReport();
        report.output(print);
    }
}
