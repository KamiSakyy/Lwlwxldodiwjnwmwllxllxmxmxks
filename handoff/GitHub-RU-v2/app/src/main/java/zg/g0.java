package zg;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.text.p0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, String str2, float f, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        float f2;
        w1.r rVar3;
        float f3;
        b2 t;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1749815190);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= sVar2.c(f2) ? 2048 : 1024;
            if (sVar2.S(i3 & 1, (i3 & 1171) == 1170)) {
                sVar2.V();
                rVar3 = rVar2;
                f3 = f2;
            } else {
                w1.r rVar4 = w1.o.a;
                w1.r rVar5 = i4 != 0 ? rVar4 : rVar2;
                float f4 = i5 != 0 ? 0 : f2;
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, rVar5);
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
                androidx.compose.foundation.layout.b.g(sVar2, p2.s(rVar4, f4));
                float f5 = f4;
                p0.a(null, str, 0, q0.a(ih.d.f(sVar2).E, ih.d.a(sVar2).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, null, 0L, ih.d.a(sVar2).e0, ih.d.a(sVar2).g0, null, 0.0f, sVar2, i3 & 112, 0, 1653);
                p5.a(z3.C(2131231116, 0, sVar2), i4.p0(2131953818, sVar2), androidx.compose.foundation.layout.b.z(rVar4, ih.a.l, 0.0f, 2), ih.d.b(sVar2).A, sVar2, 392, 0);
                sVar2 = sVar;
                p0.a(null, str2, 0, q0.a(ih.d.f(sVar).E, ih.d.a(sVar).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, null, 0L, ih.d.a(sVar).e0, ih.d.a(sVar).g0, null, 0.0f, sVar2, (i3 >> 3) & 112, 0, 1653);
                androidx.compose.foundation.layout.b.g(sVar2, p2.s(rVar4, f5));
                sVar2.q(true);
                f3 = f5;
                rVar3 = rVar5;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new f0(rVar3, str, str2, f3, i, i2, 0);
                return;
            }
            return;
        }
        f2 = f;
        if (sVar2.S(i3 & 1, (i3 & 1171) == 1170)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }

    public static final void b(w1.r rVar, String str, String str2, float f, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(1647553864);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.c(f) ? 2048 : 1024;
        }
        if (sVar2.S(i3 & 1, (i3 & 1171) != 1170)) {
            w1.r rVar3 = w1.o.a;
            if (i4 != 0) {
                rVar2 = rVar3;
            }
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, rVar2);
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
            androidx.compose.foundation.layout.b.g(sVar2, p2.s(rVar3, f));
            p0.a(null, str2, 0, q0.a(ih.d.f(sVar2).E, ih.d.a(sVar2).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, null, 0L, ih.d.a(sVar2).e0, ih.d.a(sVar2).g0, null, 0.0f, sVar, (i3 >> 3) & 112, 0, 1653);
            p5.a(z3.C(2131231114, 0, sVar), i4.p0(2131953818, sVar), androidx.compose.foundation.layout.b.z(rVar3, ih.a.l, 0.0f, 2), ih.d.b(sVar).A, sVar, 392, 0);
            p0.a(null, str, 0, q0.a(ih.d.f(sVar).E, ih.d.a(sVar).f0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, null, 0L, ih.d.a(sVar).e0, ih.d.a(sVar).g0, null, 0.0f, sVar, i3 & 112, 0, 1653);
            sVar2 = sVar;
            androidx.compose.foundation.layout.b.g(sVar2, p2.s(rVar3, f));
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        w1.r rVar4 = rVar2;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new f0(rVar4, str, str2, f, i, i2, 1);
        }
    }
}
