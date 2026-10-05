package com.github.rudroid.uitoolkit;

import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, long j, long j2, float f, boolean z, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        boolean z2;
        final w1.r rVar3;
        androidx.compose.runtime.b2 t;
        sVar.e0(2246300);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            j3 = j;
            i3 |= ((i2 & 2) == 0 && sVar.e(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && sVar.e(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= sVar.c(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= sVar.g(z2) ? 16384 : 8192;
                if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        rVar3 = i5 != 0 ? w1.o.a : rVar2;
                        if ((i2 & 2) != 0) {
                            j3 = ih.d.b(sVar).d;
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ih.d.b(sVar).p;
                            i3 &= -897;
                        }
                        if (i6 != 0) {
                            f2 = 0.0f;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                    } else {
                        sVar.V();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        rVar3 = rVar2;
                    }
                    sVar.r();
                    int a = (int) (((w2.s2) sVar.j(w2.g1.t)).a() >> 32);
                    w1.r f3 = f0.o.f(rVar3, j3, d2.a0.b);
                    boolean d = sVar.d(a);
                    Object N = sVar.N();
                    if (d || N == androidx.compose.runtime.n.a) {
                        N = new com.github.rudroid.createrepository.f(a, 2);
                        sVar.n0(N);
                    }
                    e8.g(com.github.rudroid.uitoolkit.extensions.d.a(f3, z2, (j71.c) N), f2, j4, sVar, (i3 & 896) | ((i3 >> 6) & 112), 0);
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                }
                final long j5 = j3;
                final long j6 = j4;
                final float f4 = f2;
                final boolean z3 = z2;
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.j0
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k0.a(rVar3, j5, j6, f4, z3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            }
            final long j52 = j3;
            final long j62 = j4;
            final float f42 = f2;
            final boolean z32 = z2;
            t = sVar.t();
            if (t != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
        }
        final long j522 = j3;
        final long j622 = j4;
        final float f422 = f2;
        final boolean z322 = z2;
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, long j, float f, float f2, float f3, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        int i6;
        float f6;
        int i7;
        final float f7;
        final w1.r rVar3;
        final float f8;
        final long j2;
        androidx.compose.runtime.b2 t;
        long j3;
        int i8;
        float f9;
        float f11;
        sVar.e0(-1938667763);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i11 = i3 | 16;
        int i12 = i2 & 4;
        if (i12 != 0) {
            i11 = i3 | 400;
        } else if ((i & 384) == 0) {
            f4 = f;
            i11 |= sVar.c(f4) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i5 = i11 | 3072;
                f5 = f2;
            } else {
                f5 = f2;
                i5 = i11 | (sVar.c(f5) ? 2048 : 1024);
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i7 = i5 | 24576;
                f6 = f3;
            } else {
                f6 = f3;
                i7 = i5 | (sVar.c(f6) ? 16384 : 8192);
            }
            if (sVar.S(i7 & 1, (i7 & 9363) == 9362)) {
                sVar.V();
                f7 = f3;
                rVar3 = rVar2;
                f8 = f4;
                j2 = j;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    rVar3 = i9 != 0 ? w1.o.a : rVar2;
                    j3 = ih.d.b(sVar).p;
                    i8 = i7 & (-113);
                    if (i12 != 0) {
                        f4 = 0.0f;
                    }
                    if (i4 != 0) {
                        f5 = 0;
                    }
                    f9 = i6 != 0 ? 0 : f3;
                } else {
                    sVar.V();
                    int i13 = i7 & (-113);
                    w1.r rVar4 = rVar2;
                    i8 = i13;
                    rVar3 = rVar4;
                    f9 = f6;
                    j3 = j;
                }
                sVar.r();
                boolean z = !(f5 == 0.0f);
                boolean z2 = (i8 & 7168) == 2048;
                Object N = sVar.N();
                androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                if (z2 || N == iVar) {
                    N = new com.github.rudroid.agents.sessionevents.ui.i0(1, f5);
                    sVar.n0(N);
                }
                w1.r a = com.github.rudroid.uitoolkit.extensions.d.a(rVar3, z, (j71.c) N);
                boolean z3 = !(f9 == 0.0f);
                boolean z4 = (i8 & 57344) == 16384;
                Object N2 = sVar.N();
                if (z4 || N2 == iVar) {
                    N2 = new com.github.rudroid.agents.sessionevents.ui.i0(2, f9);
                    sVar.n0(N2);
                }
                w1.r c = androidx.compose.foundation.layout.p2.c(com.github.rudroid.uitoolkit.extensions.d.a(a, z3, (j71.c) N2), 1.0f);
                if (s3.f.b(f4, 0.0f)) {
                    sVar.c0(-425472825);
                    f11 = 1.0f / ((s3.c) sVar.j(w2.g1.h)).b();
                    sVar.q(false);
                } else {
                    sVar.c0(-425390396);
                    sVar.q(false);
                    f11 = f4;
                }
                androidx.compose.foundation.layout.t.a(f0.o.f(androidx.compose.foundation.layout.p2.s(c, f11), j3, d2.a0.b), sVar, 0);
                f7 = f9;
                f8 = f4;
                j2 = j3;
            }
            final float f12 = f5;
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.i0
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k0.b(rVar3, j2, f8, f12, f7, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        f4 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if (sVar.S(i7 & 1, (i7 & 9363) == 9362)) {
        }
        final float f122 = f5;
        t = sVar.t();
        if (t == null) {
        }
    }
}
