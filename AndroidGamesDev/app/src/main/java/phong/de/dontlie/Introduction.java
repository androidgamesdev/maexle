package phong.de.dontlie;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Introduction extends AppCompatActivity implements View.OnClickListener {

    private Button introButton, nextButton;

    TextView dialogTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/Montserrat-Regular.otf", true);

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
                Intent diceRoll = new Intent(Introduction.this, DiceAnimation.class);
                startActivity(diceRoll);

            default:
                break;
        }
    }

    private void security() {
        Dialog dIntro = new Dialog(Introduction.this);
        dIntro.setContentView(R.layout.dintro);

        Typeface fontSetter = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.otf");

        dialogTextview = (TextView) dIntro.findViewById(R.id.dialog_Textview);
        dialogTextview.setTypeface(fontSetter);
        dIntro.show();
        dIntro.setCancelable(false);

        nextButton = (Button) dIntro.findViewById(R.id.next_Button);
        nextButton.setTypeface(fontSetter);
        nextButton.setOnClickListener(this);
    }
}
