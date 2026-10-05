package q61;

import android.view.MotionEvent;
import androidx.viewpager.widget.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends k {
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
