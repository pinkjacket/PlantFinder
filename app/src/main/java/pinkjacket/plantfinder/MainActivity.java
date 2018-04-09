package pinkjacket.plantfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.weedButton) Button mWeedButton;
    @BindView(R.id.strainText) EditText mStrainText;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mWeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strain = mStrainText.getText().toString();
                Log.d(TAG, strain);
                Intent intent = new Intent(MainActivity.this, StrainActivity.class);
                intent.putExtra("strain", strain);
                startActivity(intent);
            }
        });
    }
}
