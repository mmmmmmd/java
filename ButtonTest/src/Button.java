public class Button implements OnClickListener {

    public void setOnClickListener(View view){
        System.out.println(view.message);
    }

    public static void main(String[] args){
        Button button = new Button("This is Button...");
        View view = new View("This is message");
        button.setOnClickListener(view);
    }

    private Button (String message){
        System.out.println(message);
    }
}
