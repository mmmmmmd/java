public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return this.getNumberA()+this.getNumberB();
    }
}
