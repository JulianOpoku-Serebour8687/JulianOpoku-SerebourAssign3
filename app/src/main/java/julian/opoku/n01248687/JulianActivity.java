package julian.opoku.n01248687;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import julian.opoku.n01248687.databinding.ActivityMainBinding;
import julian.opoku.n01248687.ui.main.SectionsPagerAdapter;
//JULIAN OPOKU- SEREBOUR N01248687 RNA
public class JulianActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.julviewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.jultabs;
        tabs.setupWithViewPager(viewPager);
    }
            protected void onBackKeyPressed(){
                AlertDialog alertDialog = new AlertDialog.Builder(JulianActivity.this)
                .setTitle("Julian Opoku- Serebour N01248687")
                .setMessage("Are you sure you want to Exit?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();

            }

            public void onBackPressed() {
                onBackKeyPressed();
            }


        }

