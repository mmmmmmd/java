public class Button extends View implements OnClickListener {


    public void setOnClickListener(View view){
        System.out.println("setOnClickListener");
    }

    public  Button (String message){
        super(message);
    }
}
