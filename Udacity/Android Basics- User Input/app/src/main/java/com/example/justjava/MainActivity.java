package com.example.justjava;
/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
 int total,quant=0;
 boolean whipping=false;
 boolean chocolate=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void inc(View view ){
         quant++;
         display(quant);
    }
    public void dec(View view){
        quant--;
        display(quant);
    }

    public void whip(View view){
        if(whipping==true){whipping=false;}
        else{whipping=true;}
    }

    public void choco(View view){
        if(chocolate==true){chocolate=false;}
        else{chocolate=true; }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void calculate(){
       total= quant*5;
       if (whipping){total=total+(quant*1);}
       if (chocolate){total=total+(quant*10);}

    }

    public void email(View view){
        calculate();

        TextView name= findViewById(R.id.NameBox);

//        String tot=NumberFormat.getCurrencyInstance().format(quant);
//        TextView priceTextView=findViewById(R.id.price_text_view);
//        priceTextView.setText("Name: "+name.getText().toString()+"\n" +
//                "Add Whipping Cream :"+whipping+"\n"+
//                "Add chocolate :"+chocolate+"\n"+
//                "Quantity: "+quant+"\n" +
//                "Total"+tot+" \n " +
//                "Thank you!" );
    //String Pricemessage=displaymessage(total);
        String tot=NumberFormat.getCurrencyInstance().format(total);

        Intent intent= new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"order of"+name.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,"Name: "+name.getText().toString()+"\n" +
                "Add Whipping Cream :"+whipping+"\n"+
                "Add chocolate :"+chocolate+"\n"+
                "Quantity: "+quant+"\n" +
                "Total"+tot+" \n " +
                "Thank you!" );
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }

    }

    public void displaymessage(View view){
        calculate();
        TextView name= findViewById(R.id.NameBox);

        String tot=NumberFormat.getCurrencyInstance().format(total);
                TextView priceTextView=findViewById(R.id.price_text_view);
        priceTextView.setText("Name: "+name.getText().toString()+"\n" +
                "Add Whipping Cream :"+whipping+"\n"+
                "Add chocolate :"+chocolate+"\n"+
                "Quantity: "+quant+"\n" +
                "Total"+tot+" \n " +
                "Thank you!" );

    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView2);
        quantityTextView.setText("" + number);
    }
}