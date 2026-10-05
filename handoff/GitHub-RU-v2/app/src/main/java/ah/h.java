package ah;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.n;
import androidx.compose.runtime.t;
import f0.j;
import h0.h1;
import k71.k;
import m0.s;
import m0.u;
import v2.i0;
import w1.o;
import w1.r;
import w61.a0;
import z.n0;
import z.x;
import z.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, long j, float f, boolean z, i iVar, s sVar, final j71.c cVar, androidx.compose.runtime.s sVar2, int i, int i2) {
        int i3;
        final long j2;
        float f2;
        int i4;
        boolean z2;
        int i5;
        i iVar2;
        s sVar3;
        r rVar2;
        long j3;
        float f3;
        boolean z3;
        i iVar3;
        s sVar4;
        b2 t;
        final i iVar4;
        final r rVar3;
        int i6;
        final float f4;
        final s a;
        int i7;
        int i8;
        k.g(cVar, "content");
        sVar2.e0(1399201845);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (sVar2.e(j2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j2 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j2 = j;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= sVar2.c(f2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= sVar2.g(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    iVar2 = iVar;
                    i3 |= sVar2.f(iVar2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            sVar3 = sVar;
                            if (sVar2.f(sVar3)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            sVar3 = sVar;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        sVar3 = sVar;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= sVar2.h(cVar) ? 1048576 : 524288;
                    }
                    if (sVar2.S(i3 & 1, (599187 & i3) == 599186)) {
                        sVar2.V();
                        rVar2 = rVar;
                        j3 = j2;
                        f3 = f2;
                        z3 = z2;
                        iVar3 = iVar2;
                        sVar4 = sVar3;
                    } else {
                        sVar2.X();
                        if ((i & 1) == 0 || sVar2.A()) {
                            r rVar4 = i9 != 0 ? o.a : rVar;
                            if ((i2 & 2) != 0) {
                                j2 = ih.d.b(sVar2).k0;
                                i3 &= -113;
                            }
                            float f5 = i11 != 0 ? ih.a.l : f2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            iVar4 = i5 != 0 ? l.a : iVar2;
                            if ((i2 & 32) != 0) {
                                i6 = i3 & (-458753);
                                f4 = f5;
                                a = u.a(0, 3, sVar2);
                                rVar3 = rVar4;
                                sVar2.r();
                                float f6 = f4;
                                s sVar5 = a;
                                boolean z4 = z2;
                                x.e(z4, (r) null, n0.m(), n0.o(), (String) null, r1.i.d(1885752925, new j71.f() { // from class: ah.d
                                    public final Object f(Object obj, Object obj2, Object obj3) {
                                        androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                                        ((Integer) obj3).getClass();
                                        k.g((y) obj, "$this$AnimatedVisibility");
                                        Object N = sVar6.N();
                                        s sVar7 = a;
                                        androidx.compose.runtime.i iVar5 = n.a;
                                        if (N == iVar5) {
                                            N = t.s(new f(sVar7, 0));
                                            sVar6.n0(N);
                                        }
                                        final i3 i3Var = (i3) N;
                                        final float f7 = f4;
                                        boolean c = sVar6.c(f7);
                                        final long j4 = j2;
                                        boolean e = c | sVar6.e(j4);
                                        Object N2 = sVar6.N();
                                        if (e || N2 == iVar5) {
                                            N2 = new j71.c() { // from class: ah.g
                                                public final Object k(Object obj4) {
                                                    i0 i0Var = (i0) obj4;
                                                    k.g(i0Var, "$this$drawWithContent");
                                                    i0Var.c();
                                                    i3 i3Var2 = i3Var;
                                                    og.b.a(i0Var, !((Boolean) ((w61.k) i3Var2.getValue()).r).booleanValue(), !((Boolean) ((w61.k) i3Var2.getValue()).s).booleanValue(), f7, j4);
                                                    return a0.a;
                                                }
                                            };
                                            sVar6.n0(N2);
                                        }
                                        com.google.common.util.concurrent.a.c(a2.i.f(rVar3, (j71.c) N2), sVar7, (d2) null, iVar4, w1.c.B, (h1) null, false, (j) null, cVar, sVar6, 196608, 460);
                                        return a0.a;
                                    }
                                }, sVar2), sVar2, ((i6 >> 9) & 14) | 200064, 18);
                                z3 = z4;
                                rVar2 = rVar3;
                                j3 = j2;
                                f3 = f6;
                                iVar3 = iVar4;
                                sVar4 = sVar5;
                            } else {
                                rVar3 = rVar4;
                                i6 = i3;
                                f4 = f5;
                            }
                        } else {
                            sVar2.V();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            rVar3 = rVar;
                            i6 = i3;
                            f4 = f2;
                            iVar4 = iVar2;
                        }
                        a = sVar3;
                        sVar2.r();
                        float f62 = f4;
                        s sVar52 = a;
                        boolean z42 = z2;
                        x.e(z42, (r) null, n0.m(), n0.o(), (String) null, r1.i.d(1885752925, new j71.f() { // from class: ah.d
                            public final Object f(Object obj, Object obj2, Object obj3) {
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                                ((Integer) obj3).getClass();
                                k.g((y) obj, "$this$AnimatedVisibility");
                                Object N = sVar6.N();
                                s sVar7 = a;
                                androidx.compose.runtime.i iVar5 = n.a;
                                if (N == iVar5) {
                                    N = t.s(new f(sVar7, 0));
                                    sVar6.n0(N);
                                }
                                final i3 i3Var = (i3) N;
                                final float f7 = f4;
                                boolean c = sVar6.c(f7);
                                final long j4 = j2;
                                boolean e = c | sVar6.e(j4);
                                Object N2 = sVar6.N();
                                if (e || N2 == iVar5) {
                                    N2 = new j71.c() { // from class: ah.g
                                        public final Object k(Object obj4) {
                                            i0 i0Var = (i0) obj4;
                                            k.g(i0Var, "$this$drawWithContent");
                                            i0Var.c();
                                            i3 i3Var2 = i3Var;
                                            og.b.a(i0Var, !((Boolean) ((w61.k) i3Var2.getValue()).r).booleanValue(), !((Boolean) ((w61.k) i3Var2.getValue()).s).booleanValue(), f7, j4);
                                            return a0.a;
                                        }
                                    };
                                    sVar6.n0(N2);
                                }
                                com.google.common.util.concurrent.a.c(a2.i.f(rVar3, (j71.c) N2), sVar7, (d2) null, iVar4, w1.c.B, (h1) null, false, (j) null, cVar, sVar6, 196608, 460);
                                return a0.a;
                            }
                        }, sVar2), sVar2, ((i6 >> 9) & 14) | 200064, 18);
                        z3 = z42;
                        rVar2 = rVar3;
                        j3 = j2;
                        f3 = f62;
                        iVar3 = iVar4;
                        sVar4 = sVar52;
                    }
                    t = sVar2.t();
                    if (t == null) {
                        t.d = new e(rVar2, j3, f3, z3, iVar3, sVar4, cVar, i, i2, 0);
                        return;
                    }
                    return;
                }
                iVar2 = iVar;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (sVar2.S(i3 & 1, (599187 & i3) == 599186)) {
                }
                t = sVar2.t();
                if (t == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            iVar2 = iVar;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (sVar2.S(i3 & 1, (599187 & i3) == 599186)) {
            }
            t = sVar2.t();
            if (t == null) {
            }
        }
        f2 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        iVar2 = iVar;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (sVar2.S(i3 & 1, (599187 & i3) == 599186)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
