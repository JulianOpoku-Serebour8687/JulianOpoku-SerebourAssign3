package julian.opoku.n01248687;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
//JULIAN OPOKU- SEREBOUR N01248687 RNA

public class N01248687Fragment extends Fragment {


    @Override
    public ViewWithBitmap onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_n01248687, container, false);
        return new ViewWithBitmap (this);
    }

        private static class ViewWithBitmap extends View {



            public ViewWithBitmap(N01248687Fragment n01248687Fragment) {
                super(n01248687Fragment.getContext());
            }

                @Override protected void onDraw(Canvas canvas) {

                    Bitmap doomPic = BitmapFactory.decodeResource(getResources(), R.drawable.doomz);
                    Bitmap doomPicMedium= Bitmap.createScaledBitmap(doomPic, 1000, 1400, false);
                    canvas.drawBitmap(doomPicMedium, 60, 75, null);

                    // Create the thumbnail jay
                    Bitmap doomPicSmall= Bitmap.createScaledBitmap(doomPic, 50, 75, false);
                    //transform the small image
                    Matrix maxTopLeft = new Matrix();
                    maxTopLeft.preRotate(60);

                    Matrix maxBottomLeft = new Matrix();
                    maxBottomLeft.preRotate(-70);

                    Matrix maxTopRight = new Matrix();
                    maxTopRight.preRotate(-30);			// tilt 30 degrees left
                    maxTopRight.preScale(-1, 1);		// mirror image

                    Matrix maxBottomRight = new Matrix();
                    maxBottomRight.preRotate(70);		// tilt 30 degrees right
                    maxBottomRight.preScale(-1, 1);		// mirror image

                    Bitmap doomPicTopLeft = Bitmap.createBitmap(doomPicSmall, 0, 0, doomPicSmall.getWidth(), doomPicSmall.getHeight(), maxTopLeft, false);
                    Bitmap doomPicBottomLeft = Bitmap.createBitmap(doomPicSmall, 0, 0, doomPicSmall.getWidth(), doomPicSmall.getHeight(), maxBottomLeft, false);

                    Bitmap doomPicTopRight = Bitmap.createBitmap(doomPicSmall, 0, 0, doomPicSmall.getWidth(), doomPicSmall.getHeight(), maxTopRight, false);
                    Bitmap doomPicBottomRight = Bitmap.createBitmap(doomPicSmall, 0, 0, doomPicSmall.getWidth(), doomPicSmall.getHeight(), maxBottomRight, false);

                    // Free up some memory by dumping bitmaps we don't need anymore
                    doomPicSmall.recycle();
                    doomPic.recycle();
                    //draw the bitmap in the canvas
                    canvas.drawBitmap(doomPicTopLeft, 30, 30, null);
                    canvas.drawBitmap(doomPicBottomLeft, 30, 1425, null);
                    canvas.drawBitmap(doomPicTopRight, 1025, 30, null);
                    canvas.drawBitmap(doomPicBottomRight, 1025, 1425, null);


                }
        }

}


