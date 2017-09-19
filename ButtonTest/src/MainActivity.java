public class MainActivity {

    private static Button button;
    private static View view;

    public static void main(String[] args){
        button = new Button("Button");
        view = (View)button;
        button = (Button)view.findViewById(5);
        button.setOnClickListener(view);
    }
}
