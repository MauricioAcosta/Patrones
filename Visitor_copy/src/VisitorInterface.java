
public interface VisitorInterface {

    public double visit(NonCaliforniaOrder nco);

    public double visit(CaliforniaOrder co);

    public double visit(OverseasOrder oo);
}
