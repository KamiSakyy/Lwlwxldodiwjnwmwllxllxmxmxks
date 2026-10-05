package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, final q0 q0Var, long j, int i, int i2, androidx.compose.runtime.s sVar, final int i3, final int i4) {
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        final w1.r rVar2;
        final long j3;
        final int i12;
        final int i13;
        b2 t;
        int i14;
        int i15;
        w1.r rVar3;
        int i16;
        k71.k.g(str, "text");
        sVar.e0(-1058219509);
        int i17 = i3 | 6 | (sVar.f(str) ? 32 : 16) | (sVar.f(q0Var) ? 256 : 128);
        if ((i4 & 8) == 0) {
            j2 = j;
            if (sVar.e(j2)) {
                i5 = 2048;
                i6 = i17 | i5;
                i7 = i4 & 16;
                if (i7 == 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i8 = i;
                    i6 |= sVar.d(i8) ? 16384 : 8192;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                        i6 |= 196608;
                    } else if ((196608 & i3) == 0) {
                        i11 = i2;
                        i6 |= sVar.d(i11) ? 131072 : 65536;
                        if (sVar.S(i6 & 1, (74899 & i6) == 74898)) {
                            sVar.V();
                            rVar2 = rVar;
                            j3 = j2;
                            i12 = i8;
                            i13 = i11;
                        } else {
                            sVar.X();
                            if ((i3 & 1) == 0 || sVar.A()) {
                                if ((i4 & 8) != 0) {
                                    j2 = ih.d.b(sVar).v;
                                    i6 &= -7169;
                                }
                                i14 = i6;
                                i15 = i7 != 0 ? Integer.MAX_VALUE : i8;
                                rVar3 = w1.o.a;
                                i16 = i9 != 0 ? 1 : i11;
                            } else {
                                sVar.V();
                                if ((i4 & 8) != 0) {
                                    i6 &= -7169;
                                }
                                i14 = i6;
                                i15 = i8;
                                i16 = i11;
                                rVar3 = rVar;
                            }
                            sVar.r();
                            int i18 = i16;
                            rVar2 = rVar3;
                            int i19 = i15;
                            ub.b(str, rVar2, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, i18, false, i19, 0, (j71.c) null, q0.a(q0Var, j2, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, ((i14 >> 3) & 14) | 48, ((i14 >> 9) & 896) | (i14 & 57344), 110588);
                            i13 = i18;
                            i12 = i19;
                            j3 = j2;
                        }
                        t = sVar.t();
                        if (t == null) {
                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.t
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    u.a(rVar2, str, q0Var, j3, i12, i13, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i11 = i2;
                    if (sVar.S(i6 & 1, (74899 & i6) == 74898)) {
                    }
                    t = sVar.t();
                    if (t == null) {
                    }
                }
                i8 = i;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i11 = i2;
                if (sVar.S(i6 & 1, (74899 & i6) == 74898)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
        } else {
            j2 = j;
        }
        i5 = 1024;
        i6 = i17 | i5;
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i11 = i2;
        if (sVar.S(i6 & 1, (74899 & i6) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

}
