package pinkjacket.plantfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StrainActivity extends AppCompatActivity {
    @BindView(R.id.strainTextView) TextView mStrainTextView;
    @BindView(R.id.tempList) ListView mListView;
    private String[] strains = new String[] {"Jean's Green", "Lemon Sour", "The Orphan", "MKULTRA", "Big Boy", "Azure Haze", "Relax", "Pineapple Express", "Bioshock", "The Fugitive", "Boar's Head", "Pocketwatch", "Blur Witch", "Jeb!", "Drowzee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strain);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strains);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strain = ((TextView)view).getText().toString();
                Toast.makeText(StrainActivity.this, strain, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String strain = intent.getStringExtra("strain");
        mStrainTextView.setText("Strains found: " + strain);
    }
}
