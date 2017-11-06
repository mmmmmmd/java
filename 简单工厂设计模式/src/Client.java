public class Client {
    public static void main(String[] args) {
        Operation operation;
        operation=OperationFactory.createOperation("+");
        operation.setNumberA(5);
        operation.setNumberB(6);
        System.out.println(operation.getResult());
    }
}
