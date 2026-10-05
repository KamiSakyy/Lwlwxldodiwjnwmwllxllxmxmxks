package qg;

import androidx.compose.runtime.b2;
import com.github.rudroid.main.v1;
import d2.p0;
import f1.e8;
import f1.o5;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final int i, final String str, long j, long j2, boolean z, boolean z2, j71.a aVar, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        boolean z3;
        int i6;
        int i7;
        j71.a aVar2;
        final w1.r rVar2;
        final boolean z4;
        final long j4;
        final j71.a aVar3;
        final boolean z5;
        final long j5;
        b2 t;
        long j6;
        long j7;
        w1.r rVar3;
        boolean z6;
        boolean z7;
        int i8;
        boolean z8;
        long j8;
        long j9;
        j71.a aVar4;
        boolean z9;
        int i9;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "contentDescription");
        sVar2.e0(-764049440);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (sVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j;
                if (sVar2.e(j3)) {
                    i9 = 2048;
                    i4 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            j3 = j;
        }
        if ((i2 & 24576) == 0) {
            i4 |= 8192;
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            i4 |= sVar2.g(z) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                z3 = z2;
                i4 |= sVar2.g(z3) ? 1048576 : 524288;
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 = 1572864;
                    aVar2 = aVar;
                    i4 |= sVar2.h(aVar2) ? 8388608 : 4194304;
                    if (sVar2.S(i4 & 1, (i4 & 4793491) == 4793490)) {
                        sVar2.V();
                        rVar2 = rVar;
                        z4 = z;
                        j4 = j3;
                        aVar3 = aVar2;
                        z5 = z3;
                        j5 = j2;
                    } else {
                        sVar2.X();
                        if ((i2 & 1) == 0 || sVar2.A()) {
                            w1.r rVar4 = i11 != 0 ? w1.o.a : rVar;
                            if ((i3 & 8) != 0) {
                                j3 = ih.d.b(sVar2).F;
                                i4 &= -7169;
                            }
                            long j11 = ih.d.b(sVar2).A;
                            int i13 = i4 & (-57345);
                            boolean z11 = i12 != 0 ? true : z;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                Object N = sVar2.N();
                                if (N == androidx.compose.runtime.n.a) {
                                    N = new com.github.rudroid.widget.p(15);
                                    sVar2.n0(N);
                                }
                                j6 = j3;
                                aVar2 = (j71.a) N;
                            } else {
                                j6 = j3;
                            }
                            j7 = j11;
                            rVar3 = rVar4;
                            z6 = z11;
                            z7 = z3;
                            i8 = i13;
                        } else {
                            sVar2.V();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            int i14 = i4 & (-57345);
                            rVar3 = rVar;
                            z6 = z;
                            j6 = j3;
                            z7 = z3;
                            j7 = j2;
                            i8 = i14;
                        }
                        sVar2.r();
                        if (z6) {
                            sVar2.c0(1530164524);
                            boolean z12 = z7;
                            j8 = j6;
                            j9 = j7;
                            rVar2 = rVar3;
                            aVar4 = aVar2;
                            e8.h(aVar4, rVar2, z12, (o5) null, (p0) null, r1.i.d(1503729095, new v1(i, str, z12, j6, j7), sVar2), sVar, ((i8 >> 21) & 14) | i7 | ((i8 << 3) & 112) | ((i8 >> 12) & 896), 56);
                            z8 = z12;
                            sVar2 = sVar;
                            z9 = false;
                        } else {
                            z8 = z7;
                            j8 = j6;
                            j9 = j7;
                            rVar2 = rVar3;
                            aVar4 = aVar2;
                            z9 = false;
                            sVar2.c0(1529308738);
                        }
                        sVar2.q(z9);
                        z5 = z8;
                        z4 = z6;
                        j4 = j8;
                        j5 = j9;
                        aVar3 = aVar4;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new j71.e() { // from class: qg.t
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                u.a(rVar2, i, str, j4, j5, z4, z5, aVar3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                                return a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i7 = 1572864;
                aVar2 = aVar;
                if (sVar2.S(i4 & 1, (i4 & 4793491) == 4793490)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = 1572864;
            aVar2 = aVar;
            if (sVar2.S(i4 & 1, (i4 & 4793491) == 4793490)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = 1572864;
        aVar2 = aVar;
        if (sVar2.S(i4 & 1, (i4 & 4793491) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
