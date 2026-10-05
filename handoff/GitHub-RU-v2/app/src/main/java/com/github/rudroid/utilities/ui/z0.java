package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class z0 implements j71.e {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ long s;
    public final /* synthetic */ w1.r t;

    public /* synthetic */ z0(long j, w1.r rVar) {
        this.s = j;
        this.t = rVar;
    }

    public final Object s(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        Integer num = (Integer) obj2;
        switch (this.r) {
            case 0:
                num.getClass();
                b1.a(this.t, this.s, sVar, androidx.compose.runtime.t.L(1));
                break;
            default:
                int intValue = num.intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    long j = this.s;
                    w1.r rVar = this.t;
                    if (j != 9205357640488583168L) {
                        sVar.c0(-1244013944);
                        w1.r m = p2.m(rVar, s3.h.b(j), s3.h.a(j), 0.0f, 0.0f, 12);
                        androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.s, false);
                        int hashCode = Long.hashCode(sVar.T);
                        androidx.compose.runtime.v1 l = sVar.l();
                        w1.r c = w1.a.c(sVar, m);
                        v2.h.o.getClass();
                        v2.f fVar = v2.g.b;
                        sVar.g0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.q0();
                        }
                        androidx.compose.runtime.t.I(sVar, v2.g.f, d);
                        androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar, v2.g.h);
                        androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                        s0.a.b(0, 1, sVar, (w1.r) null);
                        sVar.q(true);
                        sVar.q(false);
                    } else {
                        sVar.c0(-1243644858);
                        s0.a.b(0, 0, sVar, rVar);
                        sVar.q(false);
                    }
                } else {
                    sVar.V();
                }
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ z0(w1.r rVar, long j, int i) {
        this.t = rVar;
        this.s = j;
    }
}
