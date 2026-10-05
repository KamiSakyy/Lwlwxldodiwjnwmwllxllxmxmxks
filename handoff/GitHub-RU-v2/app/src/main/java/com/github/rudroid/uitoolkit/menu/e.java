package com.github.rudroid.uitoolkit.menu;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.menu.d;
import f1.ub;
import g3.q0;
import g3.z;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ d.c s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;

    public /* synthetic */ e(d.c cVar, long j, long j2, int i) {
        this.r = i;
        this.s = cVar;
        this.t = j;
        this.u = j2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                s sVar = (s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$CompoundDrawableText");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    androidx.compose.foundation.layout.b.c(p2.e(o.a, 1.0f), androidx.compose.foundation.layout.l.g, (androidx.compose.foundation.layout.k) null, (w1.i) null, 0, 0, r1.i.d(146269743, new e(this.s, this.t, this.u, 1), sVar), sVar, 1572918, 60);
                } else {
                    sVar.V();
                }
                break;
            default:
                s sVar2 = (s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    r B = androidx.compose.foundation.layout.b.B(o.a, 0.0f, 0.0f, ih.a.n, 0.0f, 11);
                    d.c cVar = this.s;
                    ub.b(cVar.b, B, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, q0.a(ih.d.f(sVar2).d, this.t, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar2, 48, 24960, 110588);
                    ub.b(cVar.c, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, cVar.h, 0, (j71.c) null, q0.a(ih.d.f(sVar2).q, this.u, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar2, 0, 384, 110590);
                } else {
                    sVar2.V();
                }
                break;
        }
        return a0.a;
    }
}
