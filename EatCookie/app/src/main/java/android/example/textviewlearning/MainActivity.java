package android.example.textviewlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeTextAndImage(View view) {
        TextView textView = findViewById(R.id.text_view);
        textView.setText("I'm so full");

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(R.drawable.after_cookie);
    }

}