/*App client*/
public class ReportTest {
	  public static void main(String[] args) {
		    IReportBuilder builder = new  ReportBuilderSE();
		    ReportDirector reportDirector = new ReportDirector(builder);
		    reportDirector.buildReport();
		    Report report=reportDirector.getReport();
		    //use report object as per business
		    System.out.println(report.getReportTitle());
		    System.out.println(report.getHeader());
		    System.out.println(report.getPreface());
		    System.out.println(report.getContent());
		    System.out.println(report.getFooter());
		    IReportBuilder builder1 = new  ReportBuilderTEL();
		    ReportDirector reportDirector1 = new ReportDirector(builder1);
		    reportDirector1.buildReport();
		    Report report1=reportDirector1.getReport();
		    //use report object as per business
		    System.out.println(report1.getReportTitle());
		    System.out.println(report1.getHeader());
		    System.out.println(report1.getPreface());
		    System.out.println(report1.getContent());
		    System.out.println(report1.getFooter());
		  }
}
