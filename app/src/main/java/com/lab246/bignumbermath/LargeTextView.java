package com.lab246.bignumbermath;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;


public class LargeTextView extends androidx.appcompat.widget.AppCompatTextView {

    public LargeTextView(Context context) {
        super(context);
    }

    public LargeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LargeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // Set the text size to 80% of the width of the TextView
        float tw = (float) (w * 0.2);
        float th = (float) (h * 0.9);

        setTextSize(TypedValue.COMPLEX_UNIT_PX, Math.min(tw, th));
    }
}