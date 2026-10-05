package q2;

import android.view.MotionEvent;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class j {
    public static long a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
