package w2;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0 f33102r;

    public n0(o0 o0Var) {
        this.f33102r = o0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f33102r.f33107u.removeCallbacks(this);
        o0.N0(this.f33102r);
        o0 o0Var = this.f33102r;
        synchronized (o0Var.f33108v) {
            if (o0Var.A) {
                o0Var.A = false;
                ArrayList arrayList = o0Var.f33110x;
                o0Var.f33110x = o0Var.f33111y;
                o0Var.f33111y = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j10);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0.N0(this.f33102r);
        o0 o0Var = this.f33102r;
        synchronized (o0Var.f33108v) {
            if (o0Var.f33110x.isEmpty()) {
                o0Var.f33106t.removeFrameCallback(this);
                o0Var.A = false;
            }
        }
    }
}
