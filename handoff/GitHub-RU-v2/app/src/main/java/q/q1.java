package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /home/user/work/p/classes.dex */
public final class q1 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f30693r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r1 f30694s;

    public /* synthetic */ q1(r1 r1Var, int i) {
        this.f30693r = i;
        this.f30694s = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30693r) {
            case k5.f.J /* 0 */:
                ViewParent parent = this.f30694s.f30702u.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                r1 r1Var = this.f30694s;
                r1Var.a();
                View view = r1Var.f30702u;
                if (view.isEnabled() && !view.isLongClickable() && r1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    r1Var.f30705x = true;
                    break;
                }
                break;
        }
    }
}
