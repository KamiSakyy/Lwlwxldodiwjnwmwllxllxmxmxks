package com.github.rudroid.uitoolkit.avatar;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
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
import g3.z;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, String str2, String str3, boolean z, com.github.rudroid.uitoolkit.a aVar, boolean z2, q0 q0Var, s sVar, int i, int i2) {
        String str4;
        boolean z3;
        int i3;
        r rVar2;
        com.github.rudroid.uitoolkit.a aVar2;
        q0 q0Var2;
        boolean z4;
        b2 t;
        int i4;
        q0 q0Var3;
        com.github.rudroid.uitoolkit.a aVar3;
        boolean z5;
        r rVar3;
        s sVar2 = sVar;
        k.g(str, "login");
        k.g(str2, "name");
        sVar2.e0(-1854580928);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= sVar2.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str3;
            i5 |= sVar2.f(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        if ((i & 24576) == 0) {
            i5 |= sVar2.g(z) ? 16384 : 8192;
        }
        int i6 = 196608 | i5;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i6 = 1769472 | i5;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i6 |= sVar2.g(z3) ? 1048576 : 524288;
            i3 = i6 | 4194304;
            if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
                sVar2.V();
                rVar2 = rVar;
                aVar2 = aVar;
                q0Var2 = q0Var;
                z4 = z3;
            } else {
                sVar2.X();
                int i8 = i & 1;
                r rVar4 = o.a;
                if (i8 == 0 || sVar2.A()) {
                    com.github.rudroid.uitoolkit.a aVar4 = com.github.rudroid.uitoolkit.a.y;
                    boolean z6 = i7 == 0 ? z3 : false;
                    i4 = i3 & (-29360129);
                    q0Var3 = ih.d.f(sVar2).v;
                    aVar3 = aVar4;
                    z5 = z6;
                    rVar3 = rVar4;
                } else {
                    sVar2.V();
                    i4 = i3 & (-29360129);
                    aVar3 = aVar;
                    q0Var3 = q0Var;
                    z5 = z3;
                    rVar3 = rVar;
                }
                int i9 = i4;
                sVar2.r();
                l2 a = j2.a(l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                r c = w1.a.c(sVar2, rVar3);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                v2.e eVar = v2.g.f;
                t.I(sVar2, eVar, a);
                v2.e eVar2 = v2.g.e;
                t.I(sVar2, eVar2, l);
                Integer valueOf = Integer.valueOf(hashCode);
                v2.e eVar3 = v2.g.g;
                t.w(sVar2, valueOf, eVar3);
                v2.d dVar = v2.g.h;
                t.E(sVar2, dVar);
                v2.e eVar4 = v2.g.d;
                t.I(sVar2, eVar4, c);
                int i11 = i9 >> 6;
                r rVar5 = rVar3;
                f3.a(androidx.compose.foundation.layout.b.B(rVar4, 0.0f, 0.0f, ih.a.k, 0.0f, 11), str4, z, aVar3, z5, null, null, null, sVar2, (i11 & 112) | 6 | (i11 & 896) | 3072 | (i11 & 57344), 224);
                com.github.rudroid.uitoolkit.a aVar5 = aVar3;
                boolean z7 = z5;
                r B = androidx.compose.foundation.layout.b.B(rVar4, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                e0 a2 = c0.a(l.e, w1.c.D, sVar2, 6);
                int hashCode2 = Long.hashCode(sVar2.T);
                v1 l2 = sVar2.l();
                r c2 = w1.a.c(sVar2, B);
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                t.I(sVar2, eVar, a2);
                t.I(sVar2, eVar2, l2);
                f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
                t.I(sVar2, eVar4, c2);
                q0 q0Var4 = q0Var3;
                ub.b(str, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, q0Var4, sVar, (i9 >> 3) & 14, 24960, 110590);
                ub.b(str2, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, q0.a(ih.d.f(sVar).b, ih.d.b(sVar).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar, i11 & 14, 24960, 110590);
                sVar2 = sVar;
                sVar2.q(true);
                sVar2.q(true);
                q0Var2 = q0Var4;
                rVar2 = rVar5;
                aVar2 = aVar5;
                z4 = z7;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new com.github.rudroid.issueorpullrequest.mergebox.ui.s(rVar2, str, str2, str3, z, aVar2, z4, q0Var2, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        i3 = i6 | 4194304;
        if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
