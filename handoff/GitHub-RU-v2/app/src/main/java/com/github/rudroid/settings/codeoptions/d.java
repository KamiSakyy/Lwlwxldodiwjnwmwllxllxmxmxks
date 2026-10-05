package com.github.rudroid.settings.codeoptions;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.r1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.service.models.response.type.DiffLineType;
import com.google.android.gms.internal.measurement.b4;
import f1.ub;
import g3.q0;
import java.util.Map;
import y41.t1;
import z.s0;
import z.t0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final float f, final int i, final g3.g gVar, final f fVar, DiffLineType diffLineType, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        w1.r rVar2;
        int i4;
        int i5;
        w1.r rVar3;
        final DiffLineType diffLineType2;
        b2 t;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(gVar, "line");
        k71.k.g(fVar, "codeOptions");
        sVar2.e0(972735974);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar2.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar2.c(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar2.f(gVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? sVar2.f(fVar) : sVar2.h(fVar) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        int i8 = 196608;
        if (i7 == 0) {
            if ((196608 & i2) == 0) {
                i8 = sVar2.d(diffLineType == null ? -1 : diffLineType.ordinal()) ? 131072 : 65536;
            }
            i5 = i4;
            if (sVar2.S(i5 & 1, (74899 & i5) == 74898)) {
                sVar2.V();
                rVar3 = rVar2;
                diffLineType2 = diffLineType;
            } else {
                w1.r rVar4 = w1.o.a;
                w1.r rVar5 = i6 != 0 ? rVar4 : rVar2;
                final DiffLineType diffLineType3 = i7 != 0 ? DiffLineType.CONTEXT : diffLineType;
                w1.r q = androidx.compose.foundation.layout.b.q(rVar5, r1.s);
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar2, 0);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, q);
                v2.h.o.getClass();
                v2.f fVar2 = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar2);
                } else {
                    sVar2.q0();
                }
                androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                androidx.compose.runtime.t.E(sVar2, v2.g.h);
                androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                rVar3 = rVar5;
                z.x.d(n2.a, fVar.c(), (w1.r) null, (s0) null, (t0) null, (String) null, r1.i.d(-2093570014, new j71.f() { // from class: com.github.rudroid.settings.codeoptions.a
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        k71.k.g((z.y) obj, "$this$AnimatedVisibility");
                        w1.r q2 = androidx.compose.foundation.layout.b.q(p2.c(p2.s(w1.o.a, f), 1.0f), r1.s);
                        e.a(i, fVar, q2, diffLineType3, (androidx.compose.runtime.s) obj2, 0, 0);
                        return w61.a0.a;
                    }
                }, sVar2), sVar2, 1572870);
                ub.c(gVar, androidx.compose.foundation.layout.b.B(rVar4, ih.a.l, 0.0f, 0.0f, 0.0f, 14), 0L, t1.E(b4.H(u.b(fVar), sVar2), 4294967296L), ih.d.f(sVar2).E.a.f, 0L, (r3.k) null, 0L, 0, false, 0, 0, (Map) null, (j71.c) null, (q0) null, sVar, (i5 >> 9) & 14, 0, 524140);
                sVar2 = sVar;
                sVar2.q(true);
                diffLineType2 = diffLineType3;
            }
            t = sVar2.t();
            if (t == null) {
                final w1.r rVar6 = rVar3;
                t.d = new j71.e() { // from class: com.github.rudroid.settings.codeoptions.b
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.a(rVar6, f, i, gVar, fVar, diffLineType2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        i4 |= i8;
        i5 = i4;
        if (sVar2.S(i5 & 1, (74899 & i5) == 74898)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }


}
