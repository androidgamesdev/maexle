package phong.de.dontlie;

import android.app.Dialog;
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
                safetyDialog();
                break;

            default:
                break;
        }
    }

    private void safetyDialog() {
        Dialog dialog = new Dialog(Introduction.this);
        dialog.setContentView(R.layout.dintro);
        dialog.show();
        dialog.setCancelable(false);

        Button dintroButton = (Button) dialog.findViewById(R.id.dintroButton);
        dintroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Introduction.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
