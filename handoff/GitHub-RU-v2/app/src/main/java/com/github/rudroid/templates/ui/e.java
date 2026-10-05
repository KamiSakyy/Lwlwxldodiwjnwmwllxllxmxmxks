package com.github.rudroid.templates.ui;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.k0;
import com.google.android.gms.internal.measurement.i4;
import d3.k;
import f0.o;
import java.util.ArrayList;
import le.p;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements j71.g {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ j71.c s;

    public e(ArrayList arrayList, j71.c cVar) {
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
            p.c cVar = (p) this.r.get(intValue);
            sVar.c0(-156664336);
            if (cVar instanceof p.b) {
                sVar.c0(-156628377);
                k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
                sVar.q(false);
            } else {
                if (!(cVar instanceof p.c)) {
                    throw f1.e.r(-697790349, sVar, false);
                }
                sVar.c0(-156510050);
                String p0 = i4.p0(2131954107, sVar);
                j71.c cVar2 = this.s;
                boolean f = sVar.f(cVar2) | sVar.f(cVar);
                Object N = sVar.N();
                if (f || N == n.a) {
                    N = new a(cVar2, cVar);
                    sVar.n0(N);
                }
                h.a(androidx.compose.foundation.layout.b.x(o.m(w1.o.a, false, p0, (k) null, (j71.a) N, 13), ih.a.n), cVar.c, sVar, 0);
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
