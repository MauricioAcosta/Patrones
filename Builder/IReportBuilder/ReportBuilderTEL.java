/* Build the report about Complex Theory course*/
/*Adapted by HAD*/
public class ReportBuilderTEL implements IReportBuilder{
    private Report report; 
	  public ReportBuilderTEL(){
	    report = new Report();
	  }
	  @Override
	  public Report getReport(){   
	    return report;
	  }
	  @Override
	  public void buildContent() {
	    report.setContent("My first report with Builder design pattern about Complex Theory");
	  }
	  @Override
	  public void buildFooter() {
	    report.setFooter("MCIC-UDFJC");
	  }
	  @Override
	  public void buildHeader() {
	    report.setHeader("Mandatory course  of Telematic Emphasis");
	  }
	  @Override
	  public void buildPreface() {
	    report.setPreface("Report using Builder by : MCIC student");
	  }
	  @Override
	  public void buildReportTitle() {
	    report.setReportTitle("Complex Theory Report(2)");
	  }
}
