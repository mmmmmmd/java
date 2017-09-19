public class View {
    public String message;
    public int id;

    public View(String message){
        this.message = message;
    }

    public View findViewById(int id) {
        View view = new View("this is view");
        this.id = id;
        return view;
    }
}
