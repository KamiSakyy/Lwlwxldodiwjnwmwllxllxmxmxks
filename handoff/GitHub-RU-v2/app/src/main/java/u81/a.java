package u81;

import androidx.compose.foundation.lazy.layout.t1;
import h91.d0;
import h91.e0;
import h91.m0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import n0.w;
import q81.a0;
import q81.u;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements q81.p {
    public static final a a = new a();

    @Override // q81.p
    public final a0 a(w wVar) {
        Object fVar;
        m mVar = (m) wVar.g;
        synchronized (mVar) {
            if (!mVar.G) {
                throw new IllegalStateException("released");
            }
            if (mVar.D || mVar.C || mVar.F || mVar.E) {
                throw new IllegalStateException("Check failed.");
            }
        }
        g gVar = mVar.y;
        k71.k.d(gVar);
        n a2 = gVar.a();
        u uVar = mVar.r;
        a2.getClass();
        int i = wVar.d;
        l51.h hVar = a2.h;
        x81.o oVar = a2.j;
        if (oVar != null) {
            fVar = new x81.p(uVar, a2, wVar, oVar);
        } else {
            a2.e.setSoTimeout(i);
            m0 b = ((e0) hVar.t).r.b();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b.g(j, timeUnit);
            ((d0) hVar.u).r.b().g(wVar.e, timeUnit);
            fVar = new w81.f(uVar, a2, hVar);
        }
        k71.k.g(gVar, "finder");
        t1 t1Var = new t1();
        t1Var.b = mVar;
        t1Var.c = gVar;
        t1Var.d = fVar;
        mVar.B = t1Var;
        mVar.I = t1Var;
        synchronized (mVar) {
            mVar.C = true;
            mVar.D = true;
        }
        if (mVar.H) {
            throw new IOException("Canceled");
        }
        return w.a(wVar, 0, t1Var, (androidx.lifecycle.b) null, 61).f((androidx.lifecycle.b) wVar.i);
    }
}
