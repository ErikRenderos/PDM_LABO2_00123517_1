package com.example.eje1_labo2;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_click;
    private EditText txt_user;
    private TextView show_user;
    private EditText txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click = findViewById(R.id.btn_click);
        txt_user = findViewById(R.id.user);
        show_user = findViewById(R.id.user_id);
        txt_pass = findViewById(R.id.password);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_user.setText(txt_user.getText());
                btn_click.setText("Click");
            }
        });

        btn_click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                show_user.setText(txt_pass.getText());
                btn_click.setText("Long Click");
                return false;
            }
        });
    }
}
