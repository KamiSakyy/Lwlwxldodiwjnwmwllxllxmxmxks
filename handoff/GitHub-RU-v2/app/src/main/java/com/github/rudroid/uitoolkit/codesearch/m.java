package com.github.rudroid.uitoolkit.codesearch;

import androidx.compose.runtime.s;
import com.google.android.gms.internal.measurement.i4;
import d3.q;
import java.util.ArrayList;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements j71.g {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ j71.c s;

    public m(ArrayList arrayList, j71.c cVar) {
        this.r = arrayList;
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
            e eVar = (e) this.r.get(intValue);
            sVar.c0(-949627912);
            String q0 = i4.q0(2131953682, new Object[]{eVar.b}, sVar);
            boolean f = sVar.f(q0);
            Object N = sVar.N();
            Object obj5 = androidx.compose.runtime.n.a;
            if (f || N == obj5) {
                N = new g(q0);
                sVar.n0(N);
            }
            r b = q.b(o.a, false, (j71.c) N);
            j71.c cVar = this.s;
            boolean f2 = sVar.f(cVar) | sVar.f(eVar);
            Object N2 = sVar.N();
            if (f2 || N2 == obj5) {
                N2 = new h(cVar, eVar);
                sVar.n0(N2);
            }
            d.a(b, (j71.a) N2, r1.i.d(-1396762173, new i(eVar), sVar), false, null, 0L, null, null, sVar, 100663680, 248);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
