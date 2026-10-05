package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.runtime.b2;
import f1.g2;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, long j, q0 q0Var, long j2, long j3, com.github.rudroid.uitoolkit.text.l lVar, long j4, androidx.compose.runtime.s sVar, final int i, final int i2) {
        long j5;
        int i3;
        q0 q0Var2;
        int i4;
        long j6;
        int i5;
        long j7;
        int i6;
        com.github.rudroid.uitoolkit.text.l lVar2;
        int i7;
        long j8;
        int i8;
        int i9;
        final w1.r rVar2;
        final long j9;
        final q0 q0Var3;
        final long j11;
        final long j12;
        final com.github.rudroid.uitoolkit.text.l lVar3;
        final long j13;
        b2 t;
        int i11;
        long j14;
        q0 q0Var4;
        long j15;
        long j16;
        com.github.rudroid.uitoolkit.text.l lVar4;
        long j17;
        w1.r rVar3;
        k71.k.g(str, "text");
        sVar.e0(664297512);
        int i12 = i | 6;
        if ((i & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            j5 = j;
            if (sVar.e(j5)) {
                i3 = 256;
                int i13 = i12 | i3;
                if ((i2 & 8) != 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i4 = 2048;
                        int i14 = i13 | i4;
                        if ((i2 & 16) == 0) {
                            j6 = j2;
                            if (sVar.e(j6)) {
                                i5 = 16384;
                                int i15 = i14 | i5;
                                if ((i2 & 32) != 0) {
                                    j7 = j3;
                                    if (sVar.e(j7)) {
                                        i6 = 131072;
                                        int i16 = i15 | i6;
                                        if ((i2 & 64) == 0) {
                                            lVar2 = lVar;
                                            if (sVar.f(lVar2)) {
                                                i7 = 1048576;
                                                int i17 = i16 | i7;
                                                if ((i2 & 128) != 0) {
                                                    j8 = j4;
                                                    if (sVar.e(j8)) {
                                                        i8 = 8388608;
                                                        i9 = i17 | i8;
                                                        if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                                                            sVar.X();
                                                            if ((i & 1) == 0 || sVar.A()) {
                                                                if ((i2 & 4) != 0) {
                                                                    j5 = ih.d.b(sVar).v;
                                                                    i9 &= -897;
                                                                }
                                                                if ((i2 & 8) != 0) {
                                                                    q0Var2 = ih.d.f(sVar).G;
                                                                    i9 &= -7169;
                                                                }
                                                                if ((i2 & 16) != 0) {
                                                                    j6 = ih.d.b(sVar).d;
                                                                    i9 &= -57345;
                                                                }
                                                                if ((i2 & 32) != 0) {
                                                                    j7 = ih.d.b(sVar).p;
                                                                    i9 &= -458753;
                                                                }
                                                                if ((i2 & 64) != 0) {
                                                                    lVar2 = com.github.rudroid.uitoolkit.text.m.b(null, null, null, 15);
                                                                    i9 &= -3670017;
                                                                }
                                                                int i18 = i2 & 128;
                                                                w1.r rVar4 = w1.o.a;
                                                                if (i18 != 0) {
                                                                    j8 = ((d2.t) sVar.j(g2.a)).a;
                                                                    i9 &= -29360129;
                                                                }
                                                                i11 = i9;
                                                                j14 = j5;
                                                                q0Var4 = q0Var2;
                                                                j15 = j6;
                                                                j16 = j7;
                                                                lVar4 = lVar2;
                                                                j17 = j8;
                                                                rVar3 = rVar4;
                                                            } else {
                                                                sVar.V();
                                                                if ((i2 & 4) != 0) {
                                                                    i9 &= -897;
                                                                }
                                                                if ((i2 & 8) != 0) {
                                                                    i9 &= -7169;
                                                                }
                                                                if ((i2 & 16) != 0) {
                                                                    i9 &= -57345;
                                                                }
                                                                if ((i2 & 32) != 0) {
                                                                    i9 &= -458753;
                                                                }
                                                                if ((i2 & 64) != 0) {
                                                                    i9 &= -3670017;
                                                                }
                                                                if ((i2 & 128) != 0) {
                                                                    i9 &= -29360129;
                                                                }
                                                                i11 = i9;
                                                                j14 = j5;
                                                                q0Var4 = q0Var2;
                                                                j15 = j6;
                                                                j16 = j7;
                                                                lVar4 = lVar2;
                                                                j17 = j8;
                                                                rVar3 = rVar;
                                                            }
                                                            sVar.r();
                                                            long b = q0Var4.b();
                                                            if (b == 16) {
                                                                b = j14;
                                                            }
                                                            int i19 = i11 << 9;
                                                            int i21 = i11 >> 18;
                                                            w1.r rVar5 = rVar3;
                                                            long j18 = j15;
                                                            long j19 = j16;
                                                            com.github.rudroid.uitoolkit.text.l lVar5 = lVar4;
                                                            long j21 = j17;
                                                            com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.y(rVar3, ih.a.l, ih.a.k), null, str, 0.0f, q0.a(q0Var4, b, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), ih.d.e(sVar).c, 0, j18, j19, 0.0f, lVar5, j21, null, sVar, ((i11 << 3) & 896) | 805306368 | (29360128 & i19) | (i19 & 234881024), (i21 & 14) | 384 | (i21 & 112), 74);
                                                            j11 = j18;
                                                            j12 = j19;
                                                            lVar3 = lVar5;
                                                            j13 = j21;
                                                            j9 = j14;
                                                            rVar2 = rVar5;
                                                            q0Var3 = q0Var4;
                                                        } else {
                                                            sVar.V();
                                                            rVar2 = rVar;
                                                            j9 = j5;
                                                            q0Var3 = q0Var2;
                                                            j11 = j6;
                                                            j12 = j7;
                                                            lVar3 = lVar2;
                                                            j13 = j8;
                                                        }
                                                        t = sVar.t();
                                                        if (t != null) {
                                                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.listitems.c0
                                                                public final Object s(Object obj, Object obj2) {
                                                                    ((Integer) obj2).getClass();
                                                                    int L = androidx.compose.runtime.t.L(i | 1);
                                                                    d0.a(rVar2, str, j9, q0Var3, j11, j12, lVar3, j13, (androidx.compose.runtime.s) obj, L, i2);
                                                                    return w61.a0.a;
                                                                }
                                                            };
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                } else {
                                                    j8 = j4;
                                                }
                                                i8 = 4194304;
                                                i9 = i17 | i8;
                                                if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                                                }
                                                t = sVar.t();
                                                if (t != null) {
                                                }
                                            }
                                        } else {
                                            lVar2 = lVar;
                                        }
                                        i7 = 524288;
                                        int i172 = i16 | i7;
                                        if ((i2 & 128) != 0) {
                                        }
                                        i8 = 4194304;
                                        i9 = i172 | i8;
                                        if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                                        }
                                        t = sVar.t();
                                        if (t != null) {
                                        }
                                    }
                                } else {
                                    j7 = j3;
                                }
                                i6 = 65536;
                                int i162 = i15 | i6;
                                if ((i2 & 64) == 0) {
                                }
                                i7 = 524288;
                                int i1722 = i162 | i7;
                                if ((i2 & 128) != 0) {
                                }
                                i8 = 4194304;
                                i9 = i1722 | i8;
                                if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                                }
                                t = sVar.t();
                                if (t != null) {
                                }
                            }
                        } else {
                            j6 = j2;
                        }
                        i5 = 8192;
                        int i152 = i14 | i5;
                        if ((i2 & 32) != 0) {
                        }
                        i6 = 65536;
                        int i1622 = i152 | i6;
                        if ((i2 & 64) == 0) {
                        }
                        i7 = 524288;
                        int i17222 = i1622 | i7;
                        if ((i2 & 128) != 0) {
                        }
                        i8 = 4194304;
                        i9 = i17222 | i8;
                        if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                        }
                        t = sVar.t();
                        if (t != null) {
                        }
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i4 = 1024;
                int i142 = i13 | i4;
                if ((i2 & 16) == 0) {
                }
                i5 = 8192;
                int i1522 = i142 | i5;
                if ((i2 & 32) != 0) {
                }
                i6 = 65536;
                int i16222 = i1522 | i6;
                if ((i2 & 64) == 0) {
                }
                i7 = 524288;
                int i172222 = i16222 | i7;
                if ((i2 & 128) != 0) {
                }
                i8 = 4194304;
                i9 = i172222 | i8;
                if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
        } else {
            j5 = j;
        }
        i3 = 128;
        int i132 = i12 | i3;
        if ((i2 & 8) != 0) {
        }
        i4 = 1024;
        int i1422 = i132 | i4;
        if ((i2 & 16) == 0) {
        }
        i5 = 8192;
        int i15222 = i1422 | i5;
        if ((i2 & 32) != 0) {
        }
        i6 = 65536;
        int i162222 = i15222 | i6;
        if ((i2 & 64) == 0) {
        }
        i7 = 524288;
        int i1722222 = i162222 | i7;
        if ((i2 & 128) != 0) {
        }
        i8 = 4194304;
        i9 = i1722222 | i8;
        if (sVar.S(i9 & 1, (4793491 & i9) != 4793490)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}
