package sg;

import androidx.compose.runtime.b2;
import f1.a8;
import f1.b8;
import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, boolean z, boolean z2, a8 a8Var, j71.a aVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z3;
        a8 a8Var2;
        int i4;
        j71.a aVar2;
        int i5;
        boolean z4;
        a8 a8Var3;
        j71.a aVar3;
        b2 t;
        a8 a8Var4;
        j71.a aVar4;
        w1.r rVar3;
        int i6;
        sVar.e0(214505964);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= sVar.g(zShadow) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z2;
            i3 |= sVar.g(z3) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    a8Var2 = a8Var;
                    if (sVar.f(a8Var2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    a8Var2 = a8Var;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                a8Var2 = a8Var;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i & 24576) == 0) {
                    i3 |= sVar.h(aVar2) ? 16384 : 8192;
                }
            }
            i5 = i3;
            if (sVar.S(i5 & 1, (i5 & 9363) == 9362)) {
                sVar.V();
                z4 = z3;
                a8Var3 = a8Var2;
                aVar3 = aVar2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    w1.r rVar4 = i7 != 0 ? w1.o.a : rVar2;
                    boolean z5 = i8 != 0 ? true : z3;
                    if ((i2 & 8) != 0) {
                        long j = ih.d.b(sVar).F;
                        long j2 = ih.d.b(sVar).A;
                        a8Var4 = e8.w(j, j2, j2, j2, sVar);
                        i5 &= -7169;
                    } else {
                        a8Var4 = a8Var2;
                    }
                    if (i4 != 0) {
                        aVar4 = null;
                        a8Var3 = a8Var4;
                    } else {
                        a8Var3 = a8Var4;
                        aVar4 = aVar2;
                    }
                    rVar3 = rVar4;
                    z4 = z5;
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    rVar3 = rVar2;
                    z4 = z3;
                    a8Var3 = a8Var2;
                    aVar4 = aVar2;
                }
                sVar.r();
                int i9 = i5 << 3;
                b8.a(z, aVar4, rVar3, z4, a8Var3, sVar, ((i5 >> 3) & 14) | ((i5 >> 9) & 112) | ((i5 << 6) & 896) | (i9 & 7168) | (i9 & 57344));
                aVar3 = aVar4;
                rVar2 = rVar3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.uitoolkit.d(rVar2, z, z4, a8Var3, aVar3, i, i2, 3);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i3;
        if (sVar.S(i5 & 1, (i5 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
