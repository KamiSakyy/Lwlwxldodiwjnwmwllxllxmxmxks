package a81;

import com.google.android.gms.internal.measurement.b4;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public class q extends v71.a implements c71.d {
    public a71.c u;

    public q(a71.c cVar, a71.h hVar) {
        super(hVar, true);
        this.u = cVar;
    }

    @Override // v71.j1
    public final boolean V() {
        return true;
    }

    public final c71.d g() {
        c71.d dVar = this.u;
        if (dVar instanceof c71.d) {
            return dVar;
        }
        return null;
    }

    @Override // v71.j1
    public void n(Object obj) {
        b.h(b4.T(this.u), b0.B(obj));
    }

    @Override // v71.j1
    public void o(Object obj) {
        this.u.i(b0.B(obj));
    }

    public void r0() {
    }
}
