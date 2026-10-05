package com.github.rudroid.uitoolkit.debug;

import androidx.compose.runtime.n;
import androidx.compose.runtime.n1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.uitoolkit.debug.h;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f implements j71.f {
    public final Object f(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj2;
        ((Integer) obj3).getClass();
        int i = h.a;
        k.g((r) obj, "$this$composed");
        sVar.c0(-1678075053);
        Object N = sVar.N();
        int i2 = 0;
        androidx.compose.runtime.i iVar = n.a;
        Object obj4 = N;
        if (N == iVar) {
            Long[] lArr = {0L};
            sVar.n0(lArr);
            obj4 = lArr;
        }
        Long[] lArr2 = (Long[]) obj4;
        lArr2[0] = Long.valueOf(lArr2[0].longValue() + 1);
        Object N2 = sVar.N();
        if (N2 == iVar) {
            N2 = new n1(0L);
            sVar.n0(N2);
        }
        n1 n1Var = (n1) N2;
        Long l = lArr2[0];
        boolean h = sVar.h(lArr2);
        Object N3 = sVar.N();
        if (h || N3 == iVar) {
            N3 = new h.a(n1Var, lArr2, null);
            sVar.n0(N3);
        }
        t.f(sVar, (j71.e) N3, l);
        boolean h2 = sVar.h(lArr2);
        Object N4 = sVar.N();
        if (h2 || N4 == iVar) {
            N4 = new g(lArr2, n1Var, i2);
            sVar.n0(N4);
        }
        r e = a2.i.e(o.a, (j71.c) N4);
        sVar.q(false);
        return e;
    }
}
