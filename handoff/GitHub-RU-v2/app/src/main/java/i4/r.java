package i4;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: /home/user/work/p/classes.dex */
public final class r implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25973r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f25974s;

    public /* synthetic */ r(View view, int i) {
        this.f25973r = i;
        this.f25974s = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25973r) {
            case k5.f.J /* 0 */:
                this.f25974s.setNestedScrollingEnabled(true);
                break;
            default:
                ((MotionLayout) this.f25974s).I0.a();
                break;
        }
    }
}
