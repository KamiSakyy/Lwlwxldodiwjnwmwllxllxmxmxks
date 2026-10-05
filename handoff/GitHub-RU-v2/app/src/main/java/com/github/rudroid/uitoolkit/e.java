package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, boolean z, boolean z2, j71.c cVar, f1.c1 c1Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z3;
        f1.c1 c1Var2;
        int i4;
        boolean z4;
        androidx.compose.runtime.b2 t;
        f1.c1 c1Var3;
        w1.r rVar3;
        int i5;
        sVar.e0(-1135013712);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.g(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z2;
            i3 |= sVar.g(z3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= sVar.h(cVar) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    c1Var2 = c1Var;
                    if (sVar.f(c1Var2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    c1Var2 = c1Var;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                c1Var2 = c1Var;
            }
            i4 = i3;
            if (sVar.S(i4 & 1, (i4 & 9363) == 9362)) {
                sVar.V();
                z4 = z3;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    w1.r rVar4 = i6 != 0 ? w1.o.a : rVar2;
                    boolean z5 = i7 != 0 ? true : z3;
                    if ((i2 & 16) != 0) {
                        float f = f1.d1.a;
                        i4 &= -57345;
                        c1Var3 = f1.d1.a(ih.d.b(sVar).r1, ih.d.b(sVar).s1, 0L, 0L, 0L, sVar, 60);
                    } else {
                        c1Var3 = c1Var2;
                    }
                    rVar3 = rVar4;
                    z4 = z5;
                } else {
                    sVar.V();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    rVar3 = rVar2;
                    z4 = z3;
                    c1Var3 = c1Var2;
                }
                sVar.r();
                f1.f1.a(z, cVar, rVar3, z4, c1Var3, sVar, ((i4 >> 3) & 14) | ((i4 >> 6) & 112) | ((i4 << 6) & 896) | ((i4 << 3) & 7168) | (57344 & i4));
                rVar2 = rVar3;
                c1Var2 = c1Var3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new d(rVar2, z, z4, cVar, c1Var2, i, i2, 0);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if (sVar.S(i4 & 1, (i4 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
