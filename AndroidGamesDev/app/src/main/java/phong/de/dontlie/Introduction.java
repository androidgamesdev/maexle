package phong.de.dontlie;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction extends AppCompatActivity implements View.OnClickListener {

    private Button introButton, nextButton;

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
                security();
                break;

            case R.id.next_Button:
                Intent diceRoll = new Intent(Introduction.this, DiceAnimationActivity.class);
                startActivity(diceRoll);

            default:
                break;
        }
    }

    private void security() {
        Dialog dIntro = new Dialog(Introduction.this);
        dIntro.setContentView(R.layout.dintro);
        dIntro.show();
        dIntro.setCancelable(false);

        nextButton = (Button) dIntro.findViewById(R.id.next_Button);
        nextButton.setOnClickListener(this);
    }
}
