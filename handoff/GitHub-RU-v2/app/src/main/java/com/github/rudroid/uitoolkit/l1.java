package com.github.rudroid.uitoolkit;

import f1.bb;
import f1.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 {
    public static final void a(boolean z, j71.a aVar, String str, w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        w1.r rVar2;
        k71.k.g(aVar, "onClick");
        k71.k.g(str, "text");
        sVar.e0(1187698133);
        if ((i & 6) == 0) {
            i2 = (sVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(str) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            w1.r rVar3 = w1.o.a;
            bb.a(z, aVar, androidx.compose.foundation.layout.p2.f(rVar3, 48), false, ih.d.b(sVar).s, ih.d.b(sVar).t, r1.i.d(-2125624318, new ab.m(str, 10), sVar), sVar, (i3 & 14) | 12582912 | (i3 & 112));
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.k(z, aVar, str, rVar2, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, w1.r rVar, float f, final r1.d dVar, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        w1.r rVar2;
        int i5;
        float f2;
        int i6;
        final w1.r rVar3;
        final float f3;
        androidx.compose.runtime.b2 t;
        sVar.e0(-140351338);
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.d(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            rVar2 = rVar;
            i4 |= sVar.f(rVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i6 = i4 | 384;
                f2 = f;
            } else {
                f2 = f;
                i6 = i4 | (sVar.c(f2) ? 256 : 128);
            }
            if (sVar.S(i6 & 1, (i6 & 1171) == 1170)) {
                sVar.V();
                rVar3 = rVar2;
                f3 = f2;
            } else {
                w1.r rVar4 = i7 != 0 ? w1.o.a : rVar2;
                float f4 = i5 != 0 ? 0 : f2;
                qa.a(w1.a.d(rVar4, 1.0f), d2.a0.b, ih.d.b(sVar).d, ih.d.b(sVar).s, 0.0f, f4, (f0.v) null, r1.i.d(2068271281, new com.github.rudroid.copilot.ui.v0(i, dVar, 6), sVar), sVar, ((i6 << 9) & 458752) | 12582960, 80);
                f3 = f4;
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.k1
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l1.b(i, rVar3, f3, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        rVar2 = rVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if (sVar.S(i6 & 1, (i6 & 1171) == 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
