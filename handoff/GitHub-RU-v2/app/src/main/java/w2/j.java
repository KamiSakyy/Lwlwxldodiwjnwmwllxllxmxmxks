package w2;

import android.os.Trace;
import android.view.MotionEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f33058r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f33059s;

    public /* synthetic */ j(t tVar, int i) {
        this.f33058r = i;
        this.f33059s = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33058r) {
            case k5.f.J /* 0 */:
                t tVar = this.f33059s;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!tVar.f33178y.isEmpty()) {
                    try {
                        ((j71.a) tVar.f33178y.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                t tVar2 = this.f33059s;
                tVar2.T0 = false;
                MotionEvent motionEvent = tVar2.L0;
                k71.k.d(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                tVar2.N(motionEvent);
                return;
        }
    }
}
