package sg;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.r1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, f1.o0 o0Var, boolean z, boolean z2, j71.a aVar, j71.a aVar2, r1.d dVar, r1.d dVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        f1.o0 o0Var2;
        boolean z3;
        boolean z4;
        r1.d dVar3;
        boolean z5;
        f1.o0 o0Var3;
        boolean z6;
        b2 t;
        boolean z7;
        boolean z8;
        boolean z9;
        int i4;
        int i5;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onPrimaryButtonClick");
        k71.k.g(aVar2, "onSecondaryButtonClick");
        sVar2.e0(1491112555);
        if ((i & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                o0Var2 = o0Var;
                if (sVar2.f(o0Var2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                o0Var2 = o0Var;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            o0Var2 = o0Var;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 384) == 0) {
                i3 |= sVar2.g(z3) ? 256 : 128;
            }
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            i3 |= sVar2.g(z4) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= sVar2.h(aVar) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= sVar2.h(aVar2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= sVar2.h(dVar) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= sVar2.h(dVar2) ? 8388608 : 4194304;
            }
            if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
                dVar3 = dVar2;
                sVar2.V();
                z5 = z2;
                o0Var3 = o0Var2;
                z6 = z3;
            } else {
                sVar2.X();
                if ((i & 1) == 0 || sVar2.A()) {
                    if ((i2 & 2) != 0) {
                        z8 = true;
                        z7 = false;
                        o0Var2 = v.e(0L, 0L, sVar, 3072, 7);
                        sVar2 = sVar;
                        i3 &= -113;
                    } else {
                        z7 = false;
                        z8 = true;
                    }
                    if (i6 != 0) {
                        z3 = z8;
                    }
                    z9 = i7 != 0 ? z7 : z2;
                    i4 = i3;
                } else {
                    sVar2.V();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    i4 = i3;
                    z9 = z4;
                    z8 = true;
                }
                boolean z11 = z3;
                sVar2.r();
                r1 r1Var = r1.r;
                w1.o oVar = w1.o.a;
                w1.r f = androidx.compose.foundation.layout.b.q(oVar, r1Var).f(rVar);
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, f);
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
                if (1.0f <= 0.0d) {
                    l0.a.a("invalid weight; must be greater than zero");
                }
                float f2 = 0;
                int i8 = (i4 << 12) & 3670016;
                f1.o0 o0Var4 = o0Var2;
                e0.b(p2.c(new w1(1.0f, z8), 1.0f), null, aVar, o0Var4, null, null, z11, r0.d.b(ih.d.e(sVar2).b, (r0.a) null, new r0.b(f2), new r0.b(f2), (r0.a) null, 9), z9, r1.i.d(-1826575791, new w0(dVar, 8), sVar2), sVar, ((i4 << 6) & 7168) | ((i4 >> 6) & 896) | 805306368 | i8 | ((i4 << 15) & 234881024), 50);
                com.github.rudroid.uitoolkit.k0.b(androidx.compose.foundation.layout.b.q(oVar, r1Var), 0L, 0.0f, 0.0f, 0.0f, sVar, 6, 30);
                dVar3 = dVar2;
                y.a(((i4 >> 9) & 896) | 100663350 | (57344 & (i4 << 9)) | i8, 40, new f2(f2, f2, f2, f2), sVar, r0.d.b(ih.d.e(sVar).b, new r0.b(f2), (r0.a) null, (r0.a) null, new r0.b(f2), 6), null, o0Var4, null, aVar2, r1.i.d(-1765085304, new z0(dVar3, 9), sVar), p2.c(p2.s(oVar, ih.a.K), 1.0f), z11);
                sVar2 = sVar;
                sVar2.q(true);
                o0Var3 = o0Var4;
                z6 = z11;
                z5 = z9;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new com.github.rudroid.issueorpullrequest.mergebox.ui.s(rVar, o0Var3, z6, z5, aVar, aVar2, dVar, dVar3, i, i2);
                return;
            }
            return;
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
