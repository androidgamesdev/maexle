package phong.de.dontlie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction extends AppCompatActivity implements View.OnClickListener {

    private Button introButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        introButton = (Button) findViewById(R.id.introButton);
        introButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.introButton:
                Intent main = new Intent(Introduction.this, MainActivity.class);
                startActivity(main);
                break;

            default:
                break;
        }
    }
}
