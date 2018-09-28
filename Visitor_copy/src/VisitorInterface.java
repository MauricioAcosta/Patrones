
public interface VisitorInterface {

    public NonCaliforniaOrder visit(NonCaliforniaOrder nco);

    public CaliforniaOrder visit(CaliforniaOrder co);

    public OverseasOrder visit(OverseasOrder oo);
}
