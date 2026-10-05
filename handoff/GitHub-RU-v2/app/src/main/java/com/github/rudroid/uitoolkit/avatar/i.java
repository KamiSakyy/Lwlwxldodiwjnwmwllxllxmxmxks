package com.github.rudroid.uitoolkit.avatar;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.f3;
import f1.ub;
import g3.q0;
import k71.k;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, final String str, final String str2, final boolean z, com.github.rudroid.uitoolkit.a aVar, q0 q0Var, float f, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        q0 q0Var2;
        int i4;
        int i5;
        float f2;
        int i6;
        final com.github.rudroid.uitoolkit.a aVar2;
        final r rVar3;
        final q0 q0Var3;
        final float f3;
        b2 t;
        q0 q0Var4;
        r rVar4;
        int i7;
        q0 q0Var5;
        float f4;
        com.github.rudroid.uitoolkit.a aVar3;
        s sVar2 = sVar;
        k.g(str, "login");
        k.g(str2, "avatarURL");
        sVar2.e0(-169186621);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
            i3 |= sVar2.g(z) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= sVar2.d(aVar == null ? -1 : aVar.ordinal()) ? 16384 : 8192;
        }
        int i11 = i3 | 196608;
        if ((i2 & 64) == 0) {
            q0Var2 = q0Var;
            if (sVar2.f(q0Var2)) {
                i4 = 1048576;
                int i12 = i11 | i4;
                i5 = i2 & 128;
                if (i5 == 0) {
                    i6 = i12 | 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    i6 = i12 | (sVar2.c(f2) ? 8388608 : 4194304);
                }
                if (sVar2.S(i6 & 1, (4793491 & i6) == 4793490)) {
                    sVar2.V();
                    aVar2 = aVar;
                    rVar3 = rVar2;
                    q0Var3 = q0Var2;
                    f3 = f2;
                } else {
                    sVar2.X();
                    int i13 = i & 1;
                    r rVar5 = o.a;
                    if (i13 == 0 || sVar2.A()) {
                        if (i8 != 0) {
                            rVar2 = rVar5;
                        }
                        com.github.rudroid.uitoolkit.a aVar4 = i9 != 0 ? com.github.rudroid.uitoolkit.a.u : aVar;
                        if ((i2 & 64) != 0) {
                            q0Var4 = ih.d.f(sVar2).v;
                            i6 &= -3670017;
                        } else {
                            q0Var4 = q0Var2;
                        }
                        if (i5 != 0) {
                            rVar4 = rVar2;
                            i7 = i6;
                            q0Var5 = q0Var4;
                            f4 = ih.a.k;
                        } else {
                            rVar4 = rVar2;
                            i7 = i6;
                            q0Var5 = q0Var4;
                            f4 = f2;
                        }
                        aVar3 = aVar4;
                    } else {
                        sVar2.V();
                        if ((i2 & 64) != 0) {
                            i6 &= -3670017;
                        }
                        rVar4 = rVar2;
                        i7 = i6;
                        q0Var5 = q0Var2;
                        f4 = f2;
                        aVar3 = aVar;
                    }
                    sVar2.r();
                    l2 a = j2.a(l.a, w1.c.B, sVar2, 48);
                    int hashCode = Long.hashCode(sVar2.T);
                    v1 l = sVar2.l();
                    r c = w1.a.c(sVar2, rVar4);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.q0();
                    }
                    t.I(sVar2, v2.g.f, a);
                    t.I(sVar2, v2.g.e, l);
                    t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                    t.E(sVar2, v2.g.h);
                    t.I(sVar2, v2.g.d, c);
                    r B = androidx.compose.foundation.layout.b.B(rVar5, 0.0f, 0.0f, f4, 0.0f, 11);
                    int i14 = i7 >> 3;
                    f3.a(B, str2, z, aVar3, false, null, null, null, sVar2, i14 & 65520, 224);
                    q0 q0Var6 = q0Var5;
                    ub.b(str, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var6, sVar, i14 & 14, (i7 << 3) & 29360128, 131070);
                    sVar2 = sVar;
                    sVar2.q(true);
                    q0Var3 = q0Var6;
                    rVar3 = rVar4;
                    f3 = f4;
                    aVar2 = aVar3;
                }
                t = sVar2.t();
                if (t == null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.avatar.h
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i.a(rVar3, str, str2, z, aVar2, q0Var3, f3, (s) obj, t.L(i | 1), i2);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            q0Var2 = q0Var;
        }
        i4 = 524288;
        int i122 = i11 | i4;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        if (sVar2.S(i6 & 1, (4793491 & i6) == 4793490)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }


}
