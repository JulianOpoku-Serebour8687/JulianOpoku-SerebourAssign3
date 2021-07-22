package julian.opoku.n01248687;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
//JULIAN OPOKU- SEREBOUR N01248687 RNA

public class JulianFragment extends Fragment {

    DatePicker datePicker;
    Button button;
    ImageView image1;
    boolean flag;
    int images[]={R.drawable.firebending_emblem,R.drawable.waterbending_emblem,R.drawable.earthbending_emblem};
    int i=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_julian, container, false);
        datePicker = view.findViewById(R.id.juldatepick);
        button = view.findViewById(R.id.julonto);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year= datePicker.getYear();
                Toast.makeText(getActivity(), ""+day+ " / " + month + " / " + year, Toast.LENGTH_SHORT).show();
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.ca"));
                startActivity(intent);

            }

        });
        image1 = view.findViewById(R.id.julelement);
        flag= true;
        image1.setOnTouchListener((v, event) -> {
            image1.setImageResource(images[i]);
            i++;
            if (i == 3)
                i = 0;
            return true;
        });

        return view;
    }
}
