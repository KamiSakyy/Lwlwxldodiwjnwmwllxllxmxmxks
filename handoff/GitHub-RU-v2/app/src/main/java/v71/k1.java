package v71;

import com.google.android.gms.internal.measurement.b4;
import kotlinx.coroutines.DispatchException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k1 extends q1 {
    public a71.c u;

    public k1(a71.h hVar, j71.e eVar) {
        super(hVar, false);
        this.u = b4.G(this, this, eVar);
    }

    @Override // v71.j1
    public final void f0() {
        try {
            a81.b.h(b4.T(this.u), w61.a0.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).r;
            }
            i(sy.y.d(th));
            throw th;
        }
    }
}
