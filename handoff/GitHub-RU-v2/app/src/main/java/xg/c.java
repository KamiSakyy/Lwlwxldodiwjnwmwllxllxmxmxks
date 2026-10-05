package xg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.adapters.viewholders.d2;
import com.github.rudroid.agents.m4;
import com.github.rudroid.uitoolkit.d1;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(w1.r rVar, int i, int i2, j71.a aVar, j71.a aVar2, boolean z, androidx.compose.runtime.s sVar, int i3) {
        w1.r rVar2;
        sVar.e0(-301679211);
        int i4 = i3 | 6 | (sVar.d(i) ? 32 : 16) | (sVar.d(i2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar2) ? 16384 : 8192) | (sVar.g(z) ? 131072 : 65536);
        if (sVar.S(i4 & 1, (74899 & i4) != 74898)) {
            w1.r rVar3 = w1.o.a;
            w1.r e = p2.e(rVar3, 1.0f);
            float f = ih.a.l;
            w1.r f2 = androidx.compose.foundation.layout.b.A(e, f, ih.a.k, ih.a.m, f).f(rVar3);
            l2 a = j2.a(androidx.compose.foundation.layout.l.b, w1.c.B, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, f2);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            s sVar2 = s.r;
            n2 n2Var = n2.a;
            sVar2.k(n2Var);
            androidx.compose.foundation.layout.b.g(sVar, n2Var.a(rVar3, 1.0f, true));
            d1.a(null, aVar2, false, false, r1.i.d(-1433490434, new d2(i2, 9), sVar), sVar, ((i4 >> 9) & 112) | 24576, 13);
            int i5 = i4 >> 6;
            d1.a(null, aVar, false, z, r1.i.d(-2137353409, new d2(i, 10), sVar), sVar, (i5 & 112) | 24576 | (i5 & 7168), 5);
            sVar.q(true);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new m4(rVar2, i, i2, aVar, aVar2, z, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final w1.r rVar, final r1.d dVar, final r1.d dVar2, final int i, final int i2, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, boolean z, androidx.compose.runtime.s sVar, final int i3, final int i4) {
        int i5;
        final r1.d dVar3;
        final r1.d dVar4;
        int i6;
        boolean z2;
        int i7;
        final boolean z3;
        b2 t;
        k71.k.g(aVar, "onPrimaryButtonClick");
        k71.k.g(aVar2, "onSecondaryButtonClick");
        k71.k.g(aVar3, "onDialogDismiss");
        sVar.e0(-39953999);
        if ((i3 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            dVar3 = dVar;
            i5 |= sVar.h(dVar3) ? 32 : 16;
        } else {
            dVar3 = dVar;
        }
        if ((i3 & 384) == 0) {
            dVar4 = dVar2;
            i5 |= sVar.h(dVar4) ? 256 : 128;
        } else {
            dVar4 = dVar2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= sVar.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 = i2;
            i5 |= sVar.d(i6) ? 16384 : 8192;
        } else {
            i6 = i2;
        }
        if ((196608 & i3) == 0) {
            i5 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= sVar.h(aVar3) ? 8388608 : 4194304;
        }
        int i8 = i4 & 256;
        if (i8 != 0) {
            i5 |= 100663296;
        } else if ((100663296 & i3) == 0) {
            z2 = z;
            i5 |= sVar.g(z2) ? 67108864 : 33554432;
            i7 = i5;
            if (sVar.S(i7 & 1, (38347923 & i7) == 38347922)) {
                sVar.V();
                z3 = z2;
            } else {
                final boolean z4 = i8 != 0 ? false : z2;
                final int i9 = i6;
                t.a(rVar, aVar3, r1.i.d(1271996068, new j71.f() { // from class: xg.a
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        k71.k.g((f0) obj, "$this$PrimaryDialog");
                        if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                            e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
                            int hashCode = Long.hashCode(sVar2.T);
                            v1 l = sVar2.l();
                            w1.r c = w1.a.c(sVar2, w1.o.a);
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
                            r1.d dVar5 = dVar3;
                            f0 f0Var = f0.a;
                            dVar5.f(f0Var, sVar2, 6);
                            dVar4.f(f0Var, sVar2, 6);
                            c.a(null, i, i9, aVar, aVar2, z4, sVar2, 0);
                            sVar2.q(true);
                        } else {
                            sVar2.V();
                        }
                        return a0.a;
                    }
                }, sVar), sVar, (i7 & 14) | 384 | ((i7 >> 18) & 112), 0);
                z3 = z4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: xg.b
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c.b(rVar, dVar, dVar2, i, i2, aVar, aVar2, aVar3, z3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                        return a0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i7 = i5;
        if (sVar.S(i7 & 1, (38347923 & i7) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
