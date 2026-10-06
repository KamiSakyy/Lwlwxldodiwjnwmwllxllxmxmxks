package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.y1;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, String str2, float f, q0 q0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        q0 q0Var2;
        int i4;
        int i5;
        w1.r rVar3;
        q0 q0Var3;
        b2 t;
        q0 a;
        w1.r rVar4;
        int i6;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "login");
        k71.k.g(str2, "avatarURL");
        sVar2.e0(-966635674);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        if ((i2 & 16) == 0) {
            q0Var2 = q0Var;
            if (sVar2.f(q0Var2)) {
                i4 = 16384;
                i5 = i3 | i4;
                if (sVar2.S(i5 & 1, (i5 & 9363) == 9362)) {
                    sVar2.V();
                    rVar3 = rVar2;
                    q0Var3 = q0Var2;
                } else {
                    sVar2.X();
                    int i8 = i & 1;
                    w1.r rVar5 = w1.o.a;
                    if (i8 == 0 || sVar2.A()) {
                        if (i7 != 0) {
                            rVar2 = rVar5;
                        }
                        if ((i2 & 16) != 0) {
                            a = q0.a(ih.d.f(sVar2).j, ih.d.b(sVar2).s, 0L, k3.s.x, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777210);
                            rVar4 = rVar2;
                            i6 = i5 & (-57345);
                            sVar2.r();
                            l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                            int hashCode = Long.hashCode(sVar2.T);
                            v1 l = sVar2.l();
                            w1.r c = w1.a.c(sVar2, rVar4);
                            v2.h.o.getClass();
                            v2.f fVar = v2.g.b;
                            sVar2.g0();
                            if (sVar2.S) {
                                sVar2.q0();
                            } else {
                                sVar2.k(fVar);
                            }
                            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
                            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                            androidx.compose.runtime.t.E(sVar2, v2.g.h);
                            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                            int i9 = i6 >> 3;
                            y1.a(f0.o.g(p2.o(androidx.compose.foundation.layout.b.B(rVar5, 0.0f, 0.0f, ih.a.k, 0.0f, 11), f), 0.0f, ih.d.a(sVar2).E0, r0.e.a(f)), str2, null, sy.d0Shadow.n(new u9.a()), false, null, null, null, 2131231396, true, sVar2, i9 & 112, 6, 500);
                            q0 q0Var4 = a;
                            ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var4, sVar, i9 & 14, (i6 << 9) & 29360128, 131070);
                            sVar2 = sVar;
                            sVar2.q(true);
                            q0Var3 = q0Var4;
                            rVar3 = rVar4;
                        }
                    } else {
                        sVar2.V();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                    }
                    rVar4 = rVar2;
                    i6 = i5;
                    a = q0Var2;
                    sVar2.r();
                    l2 a22 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    v1 l2 = sVar2.l();
                    w1.r c2 = w1.a.c(sVar2, rVar4);
                    v2.h.o.getClass();
                    v2.f fVar2 = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, a22);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
                    int i92 = i6 >> 3;
                    y1.a(f0.o.g(p2.o(androidx.compose.foundation.layout.b.B(rVar5, 0.0f, 0.0f, ih.a.k, 0.0f, 11), f), 0.0f, ih.d.a(sVar2).E0, r0.e.a(f)), str2, null, sy.d0Shadow.n(new u9.a()), false, null, null, null, 2131231396, true, sVar2, i92 & 112, 6, 500);
                    q0 q0Var42 = a;
                    ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var42, sVar, i92 & 14, (i6 << 9) & 29360128, 131070);
                    sVar2 = sVar;
                    sVar2.q(true);
                    q0Var3 = q0Var42;
                    rVar3 = rVar4;
                }
                t = sVar2.t();
                if (t == null) {
                    t.d = new com.github.rudroid.fileschanged.ui.v(rVar3, str, str2, f, q0Var3, i, i2);
                    return;
                }
                return;
            }
        } else {
            q0Var2 = q0Var;
        }
        i4 = 8192;
        i5 = i3 | i4;
        if (sVar2.S(i5 & 1, (i5 & 9363) == 9362)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }

}
