package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, j71.a aVar, boolean z, boolean z2, j71.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        w1.r rVar2;
        boolean z5;
        boolean z6;
        androidx.compose.runtime.b2 t;
        long j;
        long j2;
        k71.k.g(aVar, "onClick");
        k71.k.g(fVar, "content");
        sVar.e0(498793602);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= sVar.h(aVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i4 |= sVar.g(z3) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i4 |= sVar.g(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i4 |= sVar.h(fVar) ? 16384 : 8192;
                }
                if (sVar.S(i4 & 1, (i4 & 9363) != 9362)) {
                    if (i5 != 0) {
                        z3 = true;
                    }
                    boolean z7 = i3 != 0 ? false : z4;
                    androidx.compose.foundation.layout.f2 f2Var = f1.p0.a;
                    if (z7) {
                        sVar.c0(-1026219765);
                        j = ih.d.b(sVar).D;
                        sVar.q(false);
                    } else {
                        sVar.c0(-1026130113);
                        j = ih.d.b(sVar).F;
                        sVar.q(false);
                    }
                    long j3 = j;
                    if (z7) {
                        sVar.c0(-1026009430);
                        j2 = ih.d.b(sVar).C;
                        sVar.q(false);
                    } else {
                        sVar.c0(-1025918569);
                        j2 = ih.d.b(sVar).H;
                        sVar.q(false);
                    }
                    boolean z8 = z3;
                    w1.r rVar3 = w1.o.a;
                    sg.k0.a(((i4 << 9) & 29360128) | (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896), 112, null, sVar, null, null, f1.p0.e(0L, j3, j2, sVar, 5), aVar, fVar, rVar3, z8);
                    rVar2 = rVar3;
                    z5 = z8;
                    z6 = z7;
                } else {
                    sVar.V();
                    rVar2 = rVar;
                    z5 = z3;
                    z6 = z4;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new d(rVar2, aVar, z5, z6, fVar, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if (sVar.S(i4 & 1, (i4 & 9363) != 9362)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        z3 = z;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if (sVar.S(i4 & 1, (i4 & 9363) != 9362)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
