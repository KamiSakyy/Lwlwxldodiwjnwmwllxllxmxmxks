package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import c21.h0;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, k91.a aVar, int i, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        int i5;
        int i6;
        w1.r rVar3;
        int i7;
        b2 t;
        int i8;
        String str2 = str;
        h0 h0Var = j91.a.b;
        h0 h0Var2 = j91.a.c;
        k71.k.g(str2, "content");
        k71.k.g(aVar, "node");
        sVar.e0(1048341213);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.h(aVar) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= sVar.d(i5) ? 2048 : 1024;
            i6 = i4;
            if (sVar.S(i6 & 1, (i6 & 1171) == 1170)) {
                sVar.V();
                rVar3 = rVar2;
                i7 = i5;
            } else {
                w1.r rVar4 = i9 != 0 ? w1.o.a : rVar2;
                int i12 = i11 != 0 ? 0 : i5;
                e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                int hashCode = Long.hashCode(sVar.T);
                v1 l = sVar.l();
                w1.r c = w1.a.c(sVar, rVar4);
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
                sVar.c0(-2063223485);
                for (k91.a aVar2 : aVar.a()) {
                    h0 h0Var3 = aVar2.a;
                    if (k71.k.b(h0Var3, j91.a.d)) {
                        sVar.c0(1830276577);
                        b(str2, aVar2, i12, sVar, (i6 >> 3) & 910);
                        h0 h0Var4 = ((k91.a) x61.m.e0(aVar2.a())).a;
                        if (k71.k.b(h0Var4, h0Var2) || k71.k.b(h0Var4, h0Var)) {
                            sVar.c0(1830620336);
                            a(null, str2, aVar2, i12, sVar, i6 & 7280, 1);
                            i8 = i12;
                            sVar.q(false);
                        } else {
                            sVar.c0(1828779618);
                            sVar.q(false);
                            i8 = i12;
                        }
                        sVar.q(false);
                    } else {
                        i8 = i12;
                        if (k71.k.b(h0Var3, h0Var2) || k71.k.b(h0Var3, h0Var)) {
                            sVar.c0(1831005852);
                            a(null, str, aVar2, i8 + 1, sVar, i6 & 112, 1);
                        } else {
                            sVar.c0(1828779618);
                        }
                        sVar.q(false);
                    }
                    str2 = str;
                    i12 = i8;
                }
                sVar.q(false);
                sVar.q(true);
                rVar3 = rVar4;
                i7 = i12;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.ui.l(rVar3, str, aVar, i7, i2, i3, 1);
                return;
            }
            return;
        }
        i5 = i;
        i6 = i4;
        if (sVar.S(i6 & 1, (i6 & 1171) == 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(final String str, final k91.a aVar, final int i, androidx.compose.runtime.s sVar, final int i2) {
        int i3;
        String str2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(3955659);
        if ((i2 & 6) == 0) {
            i3 = (sVar2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar2.h(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar2.d(i) ? 256 : 128;
        }
        if (sVar2.S(i3 & 1, (i3 & 147) != 146)) {
            k91.b bVar = aVar.d;
            h0 h0Var = bVar != null ? ((k91.a) bVar).a : null;
            if (k71.k.b(h0Var, j91.a.c)) {
                k91.a n = k21.f.n(aVar, j91.a.g0);
                str2 = " ";
                if (n != null) {
                    String str3 = ((Object) k21.f.t(n, str)) + " ";
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            } else {
                k71.k.b(h0Var, j91.a.b);
                str2 = "• ";
            }
            sVar2.c0(-493564171);
            g3.d dVar = new g3.d();
            g.b(ih.d.d(sVar2), dVar, str, x61.s.r, aVar);
            g3.g k = dVar.k();
            sVar2.q(false);
            w1.o oVar = w1.o.a;
            w1.r B = androidx.compose.foundation.layout.b.B(p2.e(oVar, 1.0f), i * ih.a.n, 0.0f, 0.0f, 0.0f, 14);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, B);
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
            ub.b(str2, p2.s(oVar, ih.a.q), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.c(sVar2).i, sVar, 48, 0, 131068);
            sVar2 = sVar;
            a0.b(null, k, ih.d.c(sVar).i, sVar2, 0, 1);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.markdown.components.h
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i2 | 1);
                    i.b(str, aVar, i, (androidx.compose.runtime.s) obj, L);
                    return w61.a0.a;
                }
            };
        }
    }
    public r d(Object p1, Object p2) { return null; }
    public Object d(Object p1, Object p2, Object p3) { return null; }
}
