package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, int i, int i2, Integer num, androidx.compose.runtime.s sVar, int i3, int i4) {
        int i5;
        w1.r rVar2;
        int i6;
        w1.r rVar3;
        int i7;
        sVar.e0(1176870433);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= ((i4 & 2) == 0 && sVar.d(i)) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar.d(i2) ? 256 : 128;
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= sVar.f(num) ? 2048 : 1024;
        }
        if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
            sVar.X();
            String str = null;
            if ((i3 & 1) == 0 || sVar.A()) {
                if (i8 != 0) {
                    rVar = w1.o.a;
                }
                if ((i4 & 2) != 0) {
                    i5 &= -113;
                    i = 2131231509;
                }
                if (i9 != 0) {
                    rVar3 = rVar;
                    i7 = i5;
                    num = null;
                    int i11 = i;
                    sVar.r();
                    String p0 = i4.p0(i2, sVar);
                    if (num != null) {
                        sVar.c0(329378278);
                    } else {
                        sVar.c0(329378279);
                        str = i4.p0(num.intValue(), sVar);
                    }
                    sVar.q(false);
                    b(rVar3, i11, p0, str, sVar, i7 & 126, 0);
                    i6 = i11;
                    rVar2 = rVar3;
                }
            } else {
                sVar.V();
                if ((i4 & 2) != 0) {
                    i5 &= -113;
                }
            }
            rVar3 = rVar;
            i7 = i5;
            int i112 = i;
            sVar.r();
            String p02 = i4.p0(i2, sVar);
            if (num != null) {
            }
            sVar.q(false);
            b(rVar3, i112, p02, str, sVar, i7 & 126, 0);
            i6 = i112;
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
            i6 = i;
        }
        Integer num2 = num;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.paywall.ui.z0(rVar2, i6, i2, num2, i3, i4);
        }
    }

    public static final void b(w1.r rVar, int i, String str, String str2, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        String str3;
        androidx.compose.runtime.s sVar2;
        String str4;
        k71.k.g(str, "message");
        sVar.e0(485764539);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(str2) ? 2048 : 1024;
        }
        if (sVar.S(i4 & 1, (i4 & 1171) != 1170)) {
            sVar.X();
            if ((i2 & 1) != 0 && !sVar.A()) {
                sVar.V();
            } else if (i5 != 0) {
                rVar = w1.o.a;
            }
            w1.r rVar2 = rVar;
            sVar.r();
            str3 = str2;
            sVar2 = sVar;
            c(rVar2, r1.i.d(2092283719, new ah.b(i, 6), sVar), str, str3, sVar2, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168));
            str4 = str;
            rVar = rVar2;
        } else {
            str3 = str2;
            sVar2 = sVar;
            str4 = str;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.ui.l(i, i2, i3, str4, str3, rVar);
        }
    }

    public static final void c(w1.r rVar, r1.d dVar, String str, String str2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "message");
        sVar2.e0(-129049449);
        if ((i & 6) == 0) {
            i2 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if (sVar2.S(i2 & 1, (i2 & 1171) != 1170)) {
            w1.r f = f0.o.f(f0.o.w(p2.d(rVar, 1.0f), f0.o.v(sVar2), true), ih.d.b(sVar2).a, d2.a0.b);
            float f2 = ih.a.n;
            w1.r x = androidx.compose.foundation.layout.b.x(f, f2);
            boolean z = (i2 & 896) == 256;
            Object N = sVar2.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.uitoolkit.listitems.z(str, 5);
                sVar2.n0(N);
            }
            w1.r a = d3.q.a(x, (j71.c) N);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, a);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            dVar.s(sVar2, Integer.valueOf((i2 >> 3) & 14));
            float f3 = ih.a.p;
            w1.o oVar = w1.o.a;
            androidx.compose.foundation.layout.b.g(sVar2, p2.f(oVar, f3));
            int i3 = i2;
            ub.b(str, (w1.r) null, ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).a, sVar, (i3 >> 6) & 14, 0, 130042);
            sVar2 = sVar;
            if (str2 == null) {
                sVar2.c0(-980633152);
            } else {
                sVar2.c0(-980633151);
                androidx.compose.foundation.layout.b.g(sVar2, p2.f(oVar, f2));
                ub.b(str2, (w1.r) null, ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).q, ih.d.b(sVar2).t, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, (i3 >> 9) & 14, 0, 130042);
                sVar2 = sVar;
            }
            sVar2.q(false);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(rVar, dVar, str, str2, i, 13);
        }
    }
}
