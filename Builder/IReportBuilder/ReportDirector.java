/*The runtime object build the complex objects*/
public class ReportDirector {
	  private IReportBuilder myBuilder;

	  public ReportDirector(IReportBuilder builder){
	    myBuilder = builder;
	  }

	  public void buildReport(){
	    // report building logic/steps
	    myBuilder.buildReportTitle();
	    myBuilder.buildHeader();
	    myBuilder.buildPreface();
	    myBuilder.buildContent();
	    myBuilder.buildFooter();
	  }

	  public Report getReport(){
	    return this.myBuilder.getReport();
	  }
}
