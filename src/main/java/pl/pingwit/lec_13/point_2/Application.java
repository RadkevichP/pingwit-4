package pl.pingwit.lec_13.point_2;

/**
 * @author Pavel Radkevich
 * @since 9.03.23
 */
public class Application {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();

        String report = reportGenerator.generateReport("Illia");
        System.out.println(report);
    }
}
