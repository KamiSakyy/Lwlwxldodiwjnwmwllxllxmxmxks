package k31;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements View.OnTouchListener {
    public final Dialog r;
    public final int s;
    public final int t;
    public final int u;

    public a(Dialog dialog, Rect rect) {
        this.r = dialog;
        this.s = rect.left;
        this.t = rect.top;
        this.u = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.s;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.t, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.u;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.r.onTouchEvent(obtain);
    }
}
