package zg;

import a0.d2Shadow;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.sessionevents.ui.m2;
import com.github.rudroid.uitoolkit.text.p0;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, String str, w1.r rVar) {
        w1.r rVar2;
        w1.r rVar3;
        b2 t;
        sVar.e0(-1837642847);
        int i3 = i | (sVar.f(str) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 32 : 16;
            if (sVar.S(i3 & 1, (i3 & 19) == 18)) {
                sVar.V();
                rVar3 = rVar2;
            } else {
                if (i4 != 0) {
                    rVar2 = w1.o.a;
                }
                ub.b(str, androidx.compose.foundation.layout.b.B(rVar2, 0.0f, 0.0f, 0.0f, ih.a.l, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).l, sVar, i3 & 14, 0, 131068);
                rVar3 = rVar2;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new m2(str, rVar3, i, i2, 5);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if (sVar.S(i3 & 1, (i3 & 19) == 18)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(j71.c cVar, j71.c cVar2, w1.r rVar, String str, String str2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        w1.r rVar2;
        w1.r rVar3;
        j71.c cVar3;
        String str3;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(cVar, "onBaseBranchPickerClick");
        k71.k.g(cVar2, "onHeadBranchPickerClick");
        k71.k.g(str, "headRefName");
        k71.k.g(str2, "baseRefName");
        sVar2.e0(-1573717174);
        if ((i & 6) == 0) {
            i2 = (sVar2.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(cVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.f(str2) ? 16384 : 8192;
        }
        int i4 = i3;
        if (sVar2.S(i4 & 1, (i3 & 9363) != 9362)) {
            String p0 = i4.p0(2131953652, sVar2);
            String p02 = i4.p0(2131953800, sVar2);
            String upperCase = i4.p0(2131951962, sVar2).toUpperCase(Locale.ROOT);
            k71.k.f(upperCase, "toUpperCase(...)");
            String p03 = i4.p0(2131953661, sVar2);
            float f = ih.a.n;
            w1.r rVar4 = w1.o.a;
            w1.r z = androidx.compose.foundation.layout.b.z(rVar4, f, 0.0f, 2);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, z);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            e.a(0, 2, sVar2, i4.p0(2131954351, sVar2), null);
            a(0, 2, sVar2, i4.p0(2131951836, sVar2), null);
            w1.r B = androidx.compose.foundation.layout.b.B(rVar4, 0.0f, 0.0f, 0.0f, f, 7);
            boolean f2 = sVar2.f(p0);
            Object N = sVar2.N();
            Object obj = androidx.compose.runtime.n.a;
            if (f2 || N == obj) {
                N = new tj.b(p0, 21);
                sVar2.n0(N);
            }
            w1.r b = d3.q.b(B, false, (j71.c) N);
            String p04 = i4.p0(2131953660, sVar2);
            d3.k kVar = new d3.k(0);
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 57344) == 16384);
            Object N2 = sVar2.N();
            if (z2 || N2 == obj) {
                N2 = new bd.c(13, cVar, str2);
                sVar2.n0(N2);
            }
            p0.a(f0.o.m(b, false, p04, kVar, (j71.a) N2, 9), str2, 0, q0.a(ih.d.f(sVar2).E, ih.d.a(sVar2).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, com.github.rudroid.uitoolkit.text.m.b(null, 2131231172, null, 13), ih.d.a(sVar2).f0, ih.d.a(sVar2).e0, ih.d.a(sVar2).g0, null, 0.0f, sVar, (i4 >> 9) & 112, 0, 1556);
            sVar2 = sVar;
            a(48, 0, sVar2, i4.p0(2131951837, sVar2), androidx.compose.foundation.layout.b.B(rVar4, 0.0f, ih.a.l, 0.0f, 0.0f, 13));
            if (str.length() == 0) {
                sVar2.c0(-1064555772);
                int i5 = i4 & 112;
                int i6 = i4 & 7168;
                boolean f3 = sVar2.f(p02) | sVar2.f(p03) | (i5 == 32) | (i6 == 2048);
                Object N3 = sVar2.N();
                if (f3 || N3 == obj) {
                    a0.a aVar = new a0.a(p02, p03, cVar2, str, 18);
                    cVar3 = cVar2;
                    str3 = str;
                    sVar2.n0(aVar);
                    N3 = aVar;
                } else {
                    cVar3 = cVar2;
                    str3 = str;
                }
                w1.r b2 = d3.q.b(rVar4, false, (j71.c) N3);
                float f4 = ih.a.i;
                f2 f2Var = new f2(f4, f4, f4, f4);
                boolean z3 = (i6 == 2048) | (i5 == 32);
                Object N4 = sVar2.N();
                if (z3 || N4 == obj) {
                    N4 = new bd.c(14, cVar3, str3);
                    sVar2.n0(N4);
                }
                sg.k0Shadow.b(b2, false, (j71.a) N4, null, upperCase, f2Var, sVar2, 196608, 10);
                sVar2.q(false);
                rVar3 = rVar4;
            } else {
                sVar2.c0(-1063681603);
                w1.r B2 = androidx.compose.foundation.layout.b.B(rVar4, 0.0f, 0.0f, 0.0f, f, 7);
                rVar3 = rVar4;
                boolean f5 = sVar2.f(p02);
                Object N5 = sVar2.N();
                if (f5 || N5 == obj) {
                    N5 = new tj.b(p02, 22);
                    sVar2.n0(N5);
                }
                w1.r b3 = d3.q.b(B2, false, (j71.c) N5);
                d3.k kVar2 = new d3.k(0);
                boolean z4 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
                Object N6 = sVar2.N();
                if (z4 || N6 == obj) {
                    N6 = new bd.c(15, cVar2, str);
                    sVar2.n0(N6);
                }
                p0.a(f0.o.m(b3, false, p03, kVar2, (j71.a) N6, 9), str, 0, q0.a(ih.d.f(sVar2).E, ih.d.a(sVar2).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, com.github.rudroid.uitoolkit.text.m.b(null, 2131231172, null, 13), ih.d.a(sVar2).f0, ih.d.a(sVar2).e0, ih.d.a(sVar2).g0, null, 0.0f, sVar, (i4 >> 6) & 112, 0, 1556);
                sVar2 = sVar;
                sVar2.q(false);
            }
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new d2(cVar, cVar2, rVar2, str, str2, i, 12);
        }
    }
}
