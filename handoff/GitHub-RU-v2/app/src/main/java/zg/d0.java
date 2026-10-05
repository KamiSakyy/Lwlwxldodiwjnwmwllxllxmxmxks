package zg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.m1;
import com.github.rudroid.uitoolkit.text.p0;
import com.google.android.gms.internal.measurement.i4;
import g3.q0;
import kotlin.NoWhenBranchMatchedException;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e0 e0Var = e0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, int i, int i2, long j, e0 e0Var, k3.s sVar, com.github.rudroid.uitoolkit.text.l lVar, androidx.compose.runtime.s sVar2, int i3, int i4) {
        w1.r rVar2;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        k3.s sVar3;
        com.github.rudroid.uitoolkit.text.l lVar2;
        int i9;
        int i11;
        long j3;
        k3.s sVar4;
        com.github.rudroid.uitoolkit.text.l lVar3;
        e0 e0Var2;
        b2 t;
        long j4;
        e0 e0Var3;
        k3.s sVar5;
        com.github.rudroid.uitoolkit.text.l b;
        long j5;
        sVar2.e0(1276891655);
        if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i5 = (sVar2.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar2.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar2.d(i2) ? 256 : 128;
        }
        if ((i4 & 8) == 0) {
            j2 = j;
            if (sVar2.e(j2)) {
                i6 = 2048;
                int i12 = i5 | i6;
                i7 = i4 & 16;
                if (i7 == 0) {
                    i12 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i12 |= sVar2.d(e0Var == null ? -1 : e0Var.ordinal()) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 == 0) {
                    i12 |= 196608;
                } else if ((196608 & i3) == 0) {
                    sVar3 = sVar;
                    i12 |= sVar2.f(sVar3) ? 131072 : 65536;
                    if ((i4 & 64) == 0) {
                        lVar2 = lVar;
                        if (sVar2.f(lVar2)) {
                            i9 = 1048576;
                            i11 = i12 | i9;
                            if (sVar2.S(i11 & 1, (599187 & i11) == 599186)) {
                                sVar2.V();
                                j3 = j2;
                                sVar4 = sVar3;
                                lVar3 = lVar2;
                                e0Var2 = e0Var;
                            } else {
                                sVar2.X();
                                if ((i3 & 1) == 0 || sVar2.A()) {
                                    if ((i4 & 8) != 0) {
                                        j2 = ih.d.b(sVar2).t;
                                        i11 &= -7169;
                                    }
                                    e0 e0Var4 = i7 != 0 ? e0.s : e0Var;
                                    k3.s sVar6 = i8 != 0 ? k3.s.x : sVar3;
                                    if ((i4 & 64) != 0) {
                                        i11 &= -3670017;
                                        j4 = j2;
                                        e0Var3 = e0Var4;
                                        sVar5 = sVar6;
                                        b = com.github.rudroid.uitoolkit.text.m.b(null, null, null, 15);
                                        sVar2.r();
                                        String q0 = i4.q0(2131954758, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, sVar2);
                                        q0 a2 = q0.a(ih.d.f(sVar2).d, j4, c(e0Var3), sVar5, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777208);
                                        long j6 = j4;
                                        k3.s sVar7 = sVar5;
                                        r0.d dVar = ih.d.e(sVar2).f;
                                        if (i != i2) {
                                            sVar2.c0(-645166847);
                                            j5 = ih.d.a(sVar2).T;
                                            sVar2.q(false);
                                        } else {
                                            sVar2.c0(-645103886);
                                            sVar2.q(false);
                                            j5 = d2.t.k;
                                        }
                                        p0.a(rVar2, q0, 0, a2, dVar, b, j5, ih.d.b(sVar2).f, ih.d.a(sVar2).l0, null, 1, sVar2, (i11 & 14) | ((i11 >> 3) & 458752), 6, 516);
                                        lVar3 = b;
                                        j3 = j6;
                                        sVar4 = sVar7;
                                        e0Var2 = e0Var3;
                                    } else {
                                        j4 = j2;
                                        e0Var3 = e0Var4;
                                        sVar5 = sVar6;
                                    }
                                } else {
                                    sVar2.V();
                                    if ((i4 & 8) != 0) {
                                        i11 &= -7169;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    e0Var3 = e0Var;
                                    j4 = j2;
                                    sVar5 = sVar3;
                                }
                                b = lVar2;
                                sVar2.r();
                                String q02 = i4.q0(2131954758, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, sVar2);
                                q0 a22 = q0.a(ih.d.f(sVar2).d, j4, c(e0Var3), sVar5, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777208);
                                long j62 = j4;
                                k3.s sVar72 = sVar5;
                                r0.d dVar2 = ih.d.e(sVar2).f;
                                if (i != i2) {
                                }
                                p0.a(rVar2, q02, 0, a22, dVar2, b, j5, ih.d.b(sVar2).f, ih.d.a(sVar2).l0, null, 1, sVar2, (i11 & 14) | ((i11 >> 3) & 458752), 6, 516);
                                lVar3 = b;
                                j3 = j62;
                                sVar4 = sVar72;
                                e0Var2 = e0Var3;
                            }
                            t = sVar2.t();
                            if (t == null) {
                                t.d = new com.github.rudroid.uitoolkit.utils.i(rVar, i, i2, j3, e0Var2, sVar4, lVar3, i3, i4);
                                return;
                            }
                            return;
                        }
                    } else {
                        lVar2 = lVar;
                    }
                    i9 = 524288;
                    i11 = i12 | i9;
                    if (sVar2.S(i11 & 1, (599187 & i11) == 599186)) {
                    }
                    t = sVar2.t();
                    if (t == null) {
                    }
                }
                sVar3 = sVar;
                if ((i4 & 64) == 0) {
                }
                i9 = 524288;
                i11 = i12 | i9;
                if (sVar2.S(i11 & 1, (599187 & i11) == 599186)) {
                }
                t = sVar2.t();
                if (t == null) {
                }
            }
        } else {
            j2 = j;
        }
        i6 = 1024;
        int i122 = i5 | i6;
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        sVar3 = sVar;
        if ((i4 & 64) == 0) {
        }
        i9 = 524288;
        i11 = i122 | i9;
        if (sVar2.S(i11 & 1, (599187 & i11) == 599186)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }

    public static final void b(w1.r rVar, final int i, final int i2, long j, long j2, e0 e0Var, k3.s sVar, androidx.compose.runtime.s sVar2, final int i3, final int i4) {
        w1.r rVar2;
        int i5;
        long j3;
        final long j4;
        final e0 e0Var2;
        final k3.s sVar3;
        w1.r rVar3;
        long j5;
        int i6;
        int i7;
        long j6;
        e0 e0Var3;
        k3.s sVar4;
        float f;
        sVar2.e0(1290430441);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
            rVar2 = rVar;
        } else if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i5 = (sVar2.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar2.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar2.d(i2) ? 256 : 128;
        }
        int i9 = i5 | 9216;
        int i11 = i4 & 32;
        if (i11 != 0) {
            i9 = 205824 | i5;
        } else if ((196608 & i3) == 0) {
            i9 |= sVar2.d(e0Var == null ? -1 : e0Var.ordinal()) ? 131072 : 65536;
        }
        int i12 = i9 | 1572864;
        if (sVar2.S(i12 & 1, (599187 & i12) != 599186)) {
            sVar2.X();
            int i13 = i3 & 1;
            w1.r rVar4 = w1.o.a;
            if (i13 == 0 || sVar2.A()) {
                if (i8 != 0) {
                    rVar2 = rVar4;
                }
                j5 = ih.d.b(sVar2).F;
                i6 = 1572864;
                w1.r rVar5 = rVar2;
                i7 = i12 & (-64513);
                rVar3 = rVar5;
                j6 = ih.d.a(sVar2).k0;
                e0Var3 = i11 != 0 ? e0.s : e0Var;
                sVar4 = k3.s.x;
            } else {
                sVar2.V();
                w1.r rVar6 = rVar2;
                i7 = i12 & (-64513);
                rVar3 = rVar6;
                j5 = j;
                j6 = j2;
                e0Var3 = e0Var;
                sVar4 = sVar;
                i6 = 1572864;
            }
            sVar2.r();
            String q0 = i4.q0(2131954758, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, sVar2);
            q0 a2 = q0.a(ih.d.f(sVar2).d, j6, c(e0Var3), sVar4, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777208);
            long j7 = j6;
            k3.s sVar5 = sVar4;
            r0.d dVar = ih.d.e(sVar2).f;
            int i14 = i6;
            long j8 = j5;
            m1 m1Var = new m1(i / i2, ih.d.a(sVar2).i, j8);
            j3 = j8;
            int ordinal = e0Var3.ordinal();
            if (ordinal == 0) {
                f = 12;
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 14;
            }
            p0.a(rVar3, q0, 0, a2, dVar, com.github.rudroid.uitoolkit.text.m.a(m1Var, p2.o(rVar4, f), 10), d2.t.k, ih.d.a(sVar2).j0, ih.d.a(sVar2).l0, null, 0.0f, sVar2, (i7 & 14) | i14, 0, 1540);
            j4 = j7;
            sVar3 = sVar5;
            e0Var2 = e0Var3;
        } else {
            sVar2.V();
            j3 = j;
            j4 = j2;
            e0Var2 = e0Var;
            sVar3 = sVar;
            rVar3 = rVar2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            final w1.r rVar7 = rVar3;
            final long j9 = j3;
            t.d = new j71.e() { // from class: zg.c0
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0.b(rVar7, i, i2, j9, j4, e0Var2, sVar3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                    return w61.a0.a;
                }
            };
        }
    }

    public static final long c(e0 e0Var) {
        k71.k.g(e0Var, "<this>");
        int ordinal = e0Var.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return t1.C(14);
    }
}
