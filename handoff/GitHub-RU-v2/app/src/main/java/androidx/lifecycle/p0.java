package androidx.lifecycle;

import android.os.Looper;

/* loaded from: /home/user/work/p/classes.dex */
public class p0 extends l0 {
    public final void k(Object obj) {
        boolean z10;
        synchronized (this.f2890a) {
            z10 = this.f2895f == l0.f2889k;
            this.f2895f = obj;
        }
        if (z10) {
            r.a Z = r.a.Z();
            h0 h0Var = this.f2898j;
            r.c cVar = Z.f31056f;
            if (cVar.f31061h == null) {
                synchronized (cVar.f31059f) {
                    try {
                        if (cVar.f31061h == null) {
                            cVar.f31061h = r.c.Z(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            cVar.f31061h.post(h0Var);
        }
    }
}
