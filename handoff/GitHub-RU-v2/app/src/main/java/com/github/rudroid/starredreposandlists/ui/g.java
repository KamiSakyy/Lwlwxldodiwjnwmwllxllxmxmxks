package com.github.rudroid.starredreposandlists.ui;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.m0;
import com.github.rudroid.repositories.k;
import com.github.rudroid.starredreposandlists.h;
import com.github.rudroid.starredreposandlists.u;
import com.github.rudroid.starredreposandlists.v;
import com.github.rudroid.uitoolkit.k0;
import d2.a0Shadow;
import java.util.List;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ j71.a s;
    public final /* synthetic */ j71.e t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ j71.c v;
    public final /* synthetic */ j71.e w;
    public final /* synthetic */ com.github.rudroid.html.b x;

    public g(List list, j71.a aVar, j71.e eVar, boolean z, j71.c cVar, j71.e eVar2, com.github.rudroid.html.b bVar) {
        this.r = list;
        this.s = aVar;
        this.t = eVar;
        this.u = z;
        this.v = cVar;
        this.w = eVar2;
        this.x = bVar;
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
            k kVar = (com.github.rudroid.starredreposandlists.h) this.r.get(intValue);
            sVar.c0(1597233927);
            if (k71.k.b(kVar, h.b.s)) {
                sVar.c0(1159902890);
                com.github.rudroid.starredreposandlists.e.a(0, sVar, this.s, null);
                sVar.q(false);
            } else if (kVar instanceof h.c) {
                sVar.c0(1597346487);
                v.a(null, this.s, (h.c) kVar, sVar, 0, 1);
                sVar.q(false);
            } else {
                boolean z = kVar instanceof h.d;
                Object obj5 = n.a;
                if (z) {
                    sVar.c0(1159910069);
                    h.d dVar = (h.d) kVar;
                    j71.e eVar = this.t;
                    boolean f = sVar.f(kVar) | sVar.f(eVar);
                    Object N = sVar.N();
                    if (f || N == obj5) {
                        N = new b(eVar, dVar);
                        sVar.n0(N);
                    }
                    com.github.rudroid.starredreposandlists.s.a(dVar, (j71.a) N, null, sVar, 0);
                    sVar.q(false);
                } else {
                    boolean z2 = kVar instanceof h.e;
                    o oVar = o.a;
                    if (z2) {
                        sVar.c0(1597725245);
                        r x = androidx.compose.foundation.layout.b.x(f0.o.f(oVar, ih.d.b(sVar).b, a0Shadow.b), ih.a.n);
                        k kVar2 = kVar;
                        j71.e eVar2 = this.w;
                        boolean f2 = sVar.f(eVar2) | sVar.f(kVar);
                        Object N2 = sVar.N();
                        if (f2 || N2 == obj5) {
                            N2 = new c(eVar2, (h.e) kVar);
                            sVar.n0(N2);
                        }
                        j.a(x, kVar2, this.u, this.v, (j71.a) N2, this.x, sVar, 0);
                        k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
                        sVar = sVar;
                        sVar.q(false);
                    } else if (k71.k.b(kVar, h.f.s)) {
                        sVar.c0(1159939845);
                        m0.C(oVar, ih.a.n, sVar, false);
                    } else {
                        if (!(kVar instanceof h.g)) {
                            throw f1.e.r(1159902332, sVar, false);
                        }
                        sVar.c0(1159943234);
                        u.a(0, sVar, null, ((h.g) kVar).s);
                        sVar.q(false);
                    }
                }
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return w61.a0Shadow.a;
    }
    public static final Object b = null;
    public static final Object d = null;
    public static final Object e = null;
    public static final Object f = null;
}
