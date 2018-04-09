package pinkjacket.plantfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StrainActivity extends AppCompatActivity {
    @BindView(R.id.strainTextView) TextView mStrainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strain);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String strain = intent.getStringExtra("strain");
        mStrainTextView.setText("Strains found: " + strain);
    }
}
