package w2;

import android.view.MotionEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f33233a = new z1();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
