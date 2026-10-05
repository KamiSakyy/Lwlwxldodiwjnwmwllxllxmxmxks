package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import com.github.rudroid.starredreposandlists.u0;
import f1.g2;
import f1.ub;
import g3.q0;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, w1.r rVar, long j, long j2, long j3, r3.k kVar, long j4, int i, boolean z, int i2, j71.c cVar, q0 q0Var, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5) {
        int i6;
        w1.r rVar2;
        long j5;
        int i7;
        int i8;
        r3.k kVar2;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final r3.k kVar3;
        final long j6;
        final long j7;
        final long j8;
        final q0 q0Var2;
        final w1.r rVar3;
        final int i16;
        final int i17;
        final long j9;
        final boolean z2;
        final j71.c cVar2;
        b2 t;
        long j11;
        w1.r rVar4;
        int i18;
        int i19;
        int i21;
        boolean z3;
        long j12;
        long j13;
        q0 q0Var3;
        j71.c cVar3;
        r3.k kVar4;
        long j14;
        int i22;
        long j15;
        k71.k.g(str, "text");
        sVar.e0(189644478);
        if ((i3 & 6) == 0) {
            i6 = i3 | (sVar.f(str) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            rVar2 = rVar;
            i6 |= sVar.f(rVar2) ? 32 : 16;
            if ((i5 & 4) != 0) {
                j5 = j;
                if (sVar.e(j5)) {
                    i7 = 256;
                    int i24 = i6 | i7;
                    int i25 = 115043328 | i24;
                    i8 = i5 & 512;
                    if (i8 != 0) {
                        i9 = i24 | 920349696;
                        kVar2 = kVar;
                    } else {
                        kVar2 = kVar;
                        i9 = i25 | (sVar.f(kVar2) ? 536870912 : 268435456);
                    }
                    int i26 = i4 | 6;
                    i11 = i5 & 2048;
                    if (i11 != 0) {
                        i26 = i4 | 54;
                    } else if ((i4 & 48) == 0) {
                        i12 = i;
                        i26 |= sVar.d(i12) ? 32 : 16;
                        int i27 = i26 | 384;
                        i13 = i5 & 8192;
                        if (i13 == 0) {
                            i27 = i26 | 3456;
                        } else if ((i4 & 3072) == 0) {
                            i14 = i2;
                            i27 |= sVar.d(i14) ? 2048 : 1024;
                            i15 = i27 | 24576 | (((i5 & 32768) == 0 || !sVar.f(q0Var)) ? 65536 : 131072);
                            if (sVar.S(i9 & 1, (i9 & 306783379) == 306783378 || (74899 & i15) != 74898)) {
                                sVar.X();
                                if ((i3 & 1) == 0 || sVar.A()) {
                                    w1.r rVar5 = i23 != 0 ? w1.o.a : rVar2;
                                    if ((i5 & 4) != 0) {
                                        j11 = ((d2.t) sVar.j(g2.a)).a;
                                        i9 &= -897;
                                    } else {
                                        j11 = j5;
                                    }
                                    long j16 = s3.o.c;
                                    if (i8 != 0) {
                                        kVar2 = null;
                                    }
                                    if (i11 != 0) {
                                        i12 = 1;
                                    }
                                    if (i13 != 0) {
                                        i14 = Integer.MAX_VALUE;
                                    }
                                    Object N = sVar.N();
                                    if (N == androidx.compose.runtime.n.a) {
                                        N = new u0(21);
                                        sVar.n0(N);
                                    }
                                    j71.c cVar4 = (j71.c) N;
                                    if ((i5 & 32768) != 0) {
                                        rVar4 = rVar5;
                                        i18 = i15 & (-458753);
                                        i19 = i14;
                                        i21 = i12;
                                        z3 = true;
                                        j13 = j16;
                                        cVar3 = cVar4;
                                        q0Var3 = (q0) sVar.j(ub.a);
                                        j12 = j13;
                                        int i28 = i9;
                                        kVar4 = kVar2;
                                        j14 = j11;
                                        i22 = i28;
                                        j15 = j12;
                                    } else {
                                        rVar4 = rVar5;
                                        i18 = i15;
                                        i19 = i14;
                                        i21 = i12;
                                        z3 = true;
                                        j12 = j16;
                                        j13 = j12;
                                        q0Var3 = q0Var;
                                        cVar3 = cVar4;
                                        int i29 = i9;
                                        kVar4 = kVar2;
                                        j14 = j11;
                                        i22 = i29;
                                        j15 = j13;
                                    }
                                } else {
                                    sVar.V();
                                    if ((i5 & 4) != 0) {
                                        i9 &= -897;
                                    }
                                    if ((i5 & 32768) != 0) {
                                        i15 &= -458753;
                                    }
                                    cVar3 = cVar;
                                    q0Var3 = q0Var;
                                    i18 = i15;
                                    rVar4 = rVar2;
                                    i22 = i9;
                                    i19 = i14;
                                    i21 = i12;
                                    j12 = j2;
                                    j13 = j4;
                                    z3 = z;
                                    kVar4 = kVar2;
                                    j14 = j5;
                                    j15 = j3;
                                }
                                sVar.r();
                                String upperCase = str.toUpperCase(Locale.ROOT);
                                k71.k.f(upperCase, "toUpperCase(...)");
                                int i31 = (i22 & 1008) | 920346624;
                                int i32 = (i22 >> 27) & 14;
                                int i33 = i18 << 3;
                                ub.b(upperCase, rVar4, j14, j12, (k3.s) null, j15, kVar4, j13, i21, z3, i19, 0, cVar3, q0Var3, sVar, i31, (i33 & 896) | i32 | 48 | 3072 | (57344 & i33) | 1572864 | ((i18 << 6) & 29360128), 32776);
                                rVar3 = rVar4;
                                j6 = j14;
                                j7 = j12;
                                j9 = j15;
                                kVar3 = kVar4;
                                j8 = j13;
                                i17 = i21;
                                z2 = z3;
                                i16 = i19;
                                cVar2 = cVar3;
                                q0Var2 = q0Var3;
                            } else {
                                sVar.V();
                                long j17 = j5;
                                kVar3 = kVar2;
                                j6 = j17;
                                j7 = j2;
                                j8 = j4;
                                q0Var2 = q0Var;
                                rVar3 = rVar2;
                                i16 = i14;
                                i17 = i12;
                                j9 = j3;
                                z2 = z;
                                cVar2 = cVar;
                            }
                            t = sVar.t();
                            if (t != null) {
                                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.m0
                                    public final Object s(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int L = androidx.compose.runtime.t.L(i3 | 1);
                                        int L2 = androidx.compose.runtime.t.L(i4);
                                        n0.a(str, rVar3, j6, j7, j9, kVar3, j8, i17, z2, i16, cVar2, q0Var2, (androidx.compose.runtime.s) obj, L, L2, i5);
                                        return w61.a0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i14 = i2;
                        i15 = i27 | 24576 | (((i5 & 32768) == 0 || !sVar.f(q0Var)) ? 65536 : 131072);
                        if (sVar.S(i9 & 1, (i9 & 306783379) == 306783378 || (74899 & i15) != 74898)) {
                        }
                        t = sVar.t();
                        if (t != null) {
                        }
                    }
                    i12 = i;
                    int i272 = i26 | 384;
                    i13 = i5 & 8192;
                    if (i13 == 0) {
                    }
                    i14 = i2;
                    i15 = i272 | 24576 | (((i5 & 32768) == 0 || !sVar.f(q0Var)) ? 65536 : 131072);
                    if (sVar.S(i9 & 1, (i9 & 306783379) == 306783378 || (74899 & i15) != 74898)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
            } else {
                j5 = j;
            }
            i7 = 128;
            int i242 = i6 | i7;
            int i252 = 115043328 | i242;
            i8 = i5 & 512;
            if (i8 != 0) {
            }
            int i262 = i4 | 6;
            i11 = i5 & 2048;
            if (i11 != 0) {
            }
            i12 = i;
            int i2722 = i262 | 384;
            i13 = i5 & 8192;
            if (i13 == 0) {
            }
            i14 = i2;
            i15 = i2722 | 24576 | (((i5 & 32768) == 0 || !sVar.f(q0Var)) ? 65536 : 131072);
            if (sVar.S(i9 & 1, (i9 & 306783379) == 306783378 || (74899 & i15) != 74898)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        rVar2 = rVar;
        if ((i5 & 4) != 0) {
        }
        i7 = 128;
        int i2422 = i6 | i7;
        int i2522 = 115043328 | i2422;
        i8 = i5 & 512;
        if (i8 != 0) {
        }
        int i2622 = i4 | 6;
        i11 = i5 & 2048;
        if (i11 != 0) {
        }
        i12 = i;
        int i27222 = i2622 | 384;
        i13 = i5 & 8192;
        if (i13 == 0) {
        }
        i14 = i2;
        i15 = i27222 | 24576 | (((i5 & 32768) == 0 || !sVar.f(q0Var)) ? 65536 : 131072);
        if (sVar.S(i9 & 1, (i9 & 306783379) == 306783378 || (74899 & i15) != 74898)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
