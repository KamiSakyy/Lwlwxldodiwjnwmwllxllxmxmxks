package com.github.rudroid.uitoolkit.copilot;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.google.android.gms.internal.measurement.i4;
import d3.q;
import java.util.List;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ j71.c s;

    public k(List list, j71.c cVar) {
        this.r = list;
        this.s = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
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
            c cVar = (c) this.r.get(intValue);
            sVar.c0(885501881);
            String p0 = i4.p0(2131953723, sVar);
            boolean f = sVar.f(p0);
            Object N = sVar.N();
            Object obj5 = n.a;
            if (f || N == obj5) {
                N = new e(p0);
                sVar.n0(N);
            }
            r b = q.b(o.a, false, (j71.c) N);
            long j = ih.d.a(sVar).j0;
            j71.c cVar2 = this.s;
            boolean f2 = sVar.f(cVar2) | sVar.f(cVar);
            Object N2 = sVar.N();
            if (f2 || N2 == obj5) {
                N2 = new f(cVar2, cVar);
                sVar.n0(N2);
            }
            com.github.rudroid.uitoolkit.codesearch.d.a(b, (j71.a) N2, r1.i.d(-1309197813, new g(cVar), sVar), false, null, j, null, null, sVar, 100663680, 184);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
