package br.edu.ifsp.dmoS5superbancoimobiliriodmo;

import androidx.appcompat.app.AppCompatActivity;
import br.edu.ifsp.dmoS5superbancoimobiliriodmo.Model.CreditCard;
import br.edu.ifsp.dmoS5superbancoimobiliriodmo.Model.StarBank;
import java.util.ArrayList;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<CreditCard> cards ;

    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if((getSupportActionBar() != null)){
            getSupportActionBar().hide();
        }

        //btn_start = findViewById(R.id.startbutton);
        //btn_start.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

    }
}