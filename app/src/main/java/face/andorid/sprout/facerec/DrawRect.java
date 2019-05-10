package face.andorid.sprout.facerec;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class DrawRect extends View {

    private int left = 0, top = 0, right = 0, bottom = 0;

    private Paint paint;

    public DrawRect(Context context) {
        super(context);
        init();
    }

    public DrawRect(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawRect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public DrawRect(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(left, top, right, bottom, paint);

    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
    }

    //Setters
    public void drawRect(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;

        invalidate();
    }


}
