package z71;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import v71.r1;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final a71.c[] a = new a71.c[0];
    public static final a81.t b = new a81.t(0, "NULL", false);
    public static final a81.t c = new a81.t(0, "UNINITIALIZED", false);
    public static final a81.t d = new a81.t(0, "DONE", false);

    public static final Object a(a71.c cVar, j71.a aVar, j71.f fVar, y71.j jVar, y71.i[] iVarArr) {
        n nVar = new n(null, aVar, fVar, jVar, iVarArr);
        r1 r1Var = new r1(cVar.q(), cVar, 1);
        Object o0 = i4.o0(r1Var, true, r1Var, nVar);
        return o0 == b71.a.r ? o0 : a0.a;
    }

    public static /* synthetic */ y71.i b(r rVar, a71.h hVar, int i, x71.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            hVar = a71.i.r;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            aVar = x71.a.r;
        }
        return rVar.a(hVar, i, aVar);
    }

    public static final Object c(a71.h hVar, Object obj, Object obj2, j71.e eVar, a71.c cVar) {
        Object s;
        Object n = a81.b.n(hVar, obj2);
        try {
            y yVar = new y(cVar, hVar);
            if (eVar == null) {
                s = b4.u0(eVar, obj, yVar);
            } else {
                k71.z.c(2, eVar);
                s = eVar.s(obj, yVar);
            }
            a81.b.g(hVar, n);
            if (s == b71.a.r) {
                k71.k.g(cVar, "frame");
            }
            return s;
        } catch (Throwable th) {
            a81.b.g(hVar, n);
            throw th;
        }
    }
}
