package julian.opoku.n01248687;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import static julian.opoku.n01248687.display.colorList;
import static julian.opoku.n01248687.display.current_brush;
import static julian.opoku.n01248687.display.pathList;

//JULIAN OPOKU- SEREBOUR N01248687 RNA
public class OpokuFragment extends Fragment {

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_opoku,
                container, false);

        Button red = (Button) view.findViewById(R.id.julbutton2);
        Button blue = (Button) view.findViewById(R.id.julbutton3);
        Button yellow = (Button) view.findViewById(R.id.julbutton4);
        Button green = (Button) view.findViewById(R.id.julbutton5);
        Button eraser = (Button) view.findViewById(R.id.julbutton6);
        Button pencil = (Button) view.findViewById(R.id.julbtt1);
        red.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paint_brush.setColor(Color.RED);
                currentColor(paint_brush.getColor());
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paint_brush.setColor(Color.BLUE);
                currentColor(paint_brush.getColor());
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paint_brush.setColor(Color.YELLOW);
                currentColor(paint_brush.getColor());
            }
        });
        green.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paint_brush.setColor(Color.GREEN);
                currentColor(paint_brush.getColor());
            }
        });
        eraser.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                pathList.clear();
                colorList.clear();
                path.reset();
            }
        });
        pencil.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paint_brush.setColor(Color.BLACK);
                currentColor(paint_brush.getColor());
            }

        });


        return view;
    }

    private void currentColor(int c) {
        current_brush = c;
        path = new Path();
    }
}