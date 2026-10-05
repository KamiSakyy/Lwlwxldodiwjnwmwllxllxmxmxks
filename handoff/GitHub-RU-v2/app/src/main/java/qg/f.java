package qg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import f0.v;
import f1.e8;
import f1.o0;
import f1.p0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, o0 o0Var, boolean z, boolean z2, j71.a aVar, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        r1.d dVar2;
        boolean z5;
        w1.r rVar3;
        o0 o0Var2;
        b2 t;
        boolean z6;
        w1.r rVar4;
        o0 o0Var3;
        int i5;
        boolean z7;
        k71.k.g(aVar, "onClick");
        sVar.e0(-1669768449);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        }
        int i7 = i3 | 16;
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 = i3 | 400;
        } else if ((i & 384) == 0) {
            z3 = z;
            i7 |= sVar.g(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i7 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i7 |= sVar.g(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i7 |= sVar.h(aVar) ? 16384 : 8192;
                }
                if (sVar.S(i7 & 1, (74899 & i7) != 74898)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        w1.r rVar5 = i6 != 0 ? w1.o.a : rVar2;
                        f2 f2Var = p0.a;
                        o0 e = p0.e(d2.t.j, ih.d.b(sVar).F, ih.d.b(sVar).H, sVar, 4);
                        int i9 = i7 & (-113);
                        boolean z8 = i8 == 0 ? z3 : false;
                        if (i4 != 0) {
                            rVar4 = rVar5;
                            o0Var3 = e;
                            i5 = i9;
                            z7 = z8;
                            z6 = true;
                        } else {
                            z6 = z2;
                            rVar4 = rVar5;
                            o0Var3 = e;
                            i5 = i9;
                            z7 = z8;
                        }
                    } else {
                        sVar.V();
                        i5 = i7 & (-113);
                        o0Var3 = o0Var;
                        rVar4 = rVar2;
                        z7 = z3;
                        z6 = z4;
                    }
                    sVar.r();
                    dVar2 = dVar;
                    e8.s(((i5 >> 3) & 896) | ((i5 >> 12) & 14) | 805306368 | ((i5 << 3) & 112), 488, (d2) null, sVar, (d2.p0) null, (v) null, o0Var3, aVar, r1.i.d(-2077412318, new com.github.rudroid.discussions.ui.g(z7, z6, o0Var3, dVar2), sVar), rVar4, z6);
                    o0Var2 = o0Var3;
                    rVar3 = rVar4;
                    z5 = z6;
                    z3 = z7;
                } else {
                    dVar2 = dVar;
                    sVar.V();
                    z5 = z2;
                    rVar3 = rVar2;
                    o0Var2 = o0Var;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new ag.a(rVar3, o0Var2, z3, z5, aVar, dVar2, i, i2, 3);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if (sVar.S(i7 & 1, (74899 & i7) != 74898)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if (sVar.S(i7 & 1, (74899 & i7) != 74898)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
