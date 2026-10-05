package com.github.rudroid.starredreposandlists.bottomsheet;

import com.github.rudroid.starredreposandlists.bottomsheet.i;
import com.github.rudroid.uitoolkit.o2;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ j71.a s;
    public final /* synthetic */ j71.c t;

    public o(List list, j71.a aVar, j71.c cVar) {
        this.r = list;
        this.s = aVar;
        this.t = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            i iVar = (i) this.r.get(intValue);
            sVar.c0(60923206);
            if (k71.k.b(iVar, i.a.a)) {
                sVar.c0(417607786);
                p.a(0, sVar, this.s, null);
                sVar.q(false);
            } else if (iVar instanceof i.b) {
                sVar.c0(61038525);
                i.b bVar2 = (i.b) iVar;
                v vVar = bVar2.a;
                String str = vVar.b;
                boolean z2 = vVar.c;
                String p0 = i4.p0(z2 ? 2131954108 : 2131953737, sVar);
                j71.c cVar = this.t;
                boolean f = sVar.f(iVar) | sVar.f(cVar);
                Object N = sVar.N();
                if (f || N == androidx.compose.runtime.n.a) {
                    N = new k(cVar, bVar2);
                    sVar.n0(N);
                }
                o2.a(0, 1, sVar, (j71.a) N, str, p0, null, z2);
                sVar.q(false);
            } else {
                if (!k71.k.b(iVar, i.c.a)) {
                    throw f1.e.r(417607261, sVar, false);
                }
                sVar.c0(61711628);
                z = false;
                ub.b(i4.p0(2131953001, sVar), androidx.compose.foundation.layout.b.y(w1.o.a, ih.a.n, ih.a.l), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).v, 0L, 0L, (k3.s) null, (k3.o) null, lh.d.a, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777183), sVar, 0, 0, 131068);
                sVar = sVar;
                sVar.q(false);
                sVar.q(z);
            }
            z = false;
            sVar.q(z);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
