package w2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0 extends v71.v {
    public static final w61.p D = sy.w.t(g0.f33018y);
    public static final k21.h E = new k21.h(3);
    public boolean A;
    public androidx.compose.runtime.h C;

    /* renamed from: t, reason: collision with root package name */
    public Choreographer f33106t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f33107u;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33112z;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33108v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final x61.k f33109w = new x61.k();

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f33110x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f33111y = new ArrayList();
    public final n0 B = new n0(this);

    public o0(Choreographer choreographer, Handler handler) {
        this.f33106t = choreographer;
        this.f33107u = handler;
        this.C = new androidx.compose.runtime.h(choreographer, this);
    }

    public static final void N0(o0 o0Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (o0Var.f33108v) {
                runnable = (Runnable) o0Var.f33109w.n();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (o0Var.f33108v) {
                    runnable = (Runnable) o0Var.f33109w.n();
                }
            }
            synchronized (o0Var.f33108v) {
                if (o0Var.f33109w.isEmpty()) {
                    z10 = false;
                    o0Var.f33112z = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final void J0(a71.h hVar, Runnable runnable) {
        synchronized (this.f33108v) {
            this.f33109w.addLast(runnable);
            if (!this.f33112z) {
                this.f33112z = true;
                this.f33107u.post(this.B);
                if (!this.A) {
                    this.A = true;
                    this.f33106t.postFrameCallback(this.B);
                }
            }
        }
    }
}
