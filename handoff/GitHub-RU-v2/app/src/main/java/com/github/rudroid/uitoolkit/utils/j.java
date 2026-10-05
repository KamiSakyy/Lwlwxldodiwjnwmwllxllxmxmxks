package com.github.rudroid.uitoolkit.utils;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import com.github.rudroid.starredreposandlists.u0;
import d2.o0;
import f1.ub;
import g3.h0;
import g3.q0;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final h0 a = new h0(0, 0, (k3.s) null, (k3.o) null, (k3.p) null, lh.d.a, (String) null, 0, (r3.a) null, (r3.p) null, (n3.b) null, 0, (r3.l) null, (o0) null, 65503);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, g3.g gVar, q0 q0Var, int i, int i2, Map map, long j, androidx.compose.runtime.s sVar, int i3, int i4) {
        w1.r rVar2;
        int i5;
        q0 q0Var2;
        int i6;
        int i7;
        int i8;
        long j2;
        w1.r rVar3;
        q0 q0Var3;
        int i9;
        int i11;
        b2 t;
        w1.r rVar4;
        int i12;
        long j3;
        int i13;
        long j4;
        Object obj;
        int i14;
        sVar.e0(1662511123);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            rVar2 = rVar;
        } else if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i5 = (sVar.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar.f(gVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                q0Var2 = q0Var;
                if (sVar.f(q0Var2)) {
                    i14 = 256;
                    i5 |= i14;
                }
            } else {
                q0Var2 = q0Var;
            }
            i14 = 128;
            i5 |= i14;
        } else {
            q0Var2 = q0Var;
        }
        int i16 = i4 & 8;
        if (i16 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 = i;
            i5 |= sVar.d(i6) ? 2048 : 1024;
            i7 = i4 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i8 = i2;
                i5 |= sVar.d(i8) ? 16384 : 8192;
                if ((196608 & i3) == 0) {
                    i5 |= sVar.h(map) ? 131072 : 65536;
                }
                if ((1572864 & i3) == 0) {
                    i5 |= 524288;
                }
                if (sVar.S(i5 & 1, (599187 & i5) != 599186)) {
                    sVar.X();
                    if ((i3 & 1) == 0 || sVar.A()) {
                        rVar4 = i15 != 0 ? w1.o.a : rVar2;
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            q0Var2 = (q0) sVar.j(ub.a);
                        }
                        if (i16 != 0) {
                            i6 = Integer.MAX_VALUE;
                        }
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        i12 = i6;
                        j3 = ih.d.a(sVar).j0;
                        i13 = i5 & (-3670017);
                    } else {
                        sVar.V();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        i13 = i5 & (-3670017);
                        rVar4 = rVar2;
                        i12 = i6;
                        j3 = j;
                    }
                    q0 q0Var4 = q0Var2;
                    int i17 = i8;
                    sVar.r();
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                    if (N == iVar) {
                        N = androidx.compose.runtime.t.B(new u0(22));
                        sVar.n0(N);
                    }
                    f1 f1Var = (f1) N;
                    Object N2 = sVar.N();
                    if (N2 == iVar) {
                        N2 = new ab.e(f1Var, 12);
                        sVar.n0(N2);
                    }
                    w1.r d = a2.i.d(rVar4, (j71.c) N2);
                    boolean e = sVar.e(j3) | ((i13 & 112) == 32);
                    Object N3 = sVar.N();
                    if (e || N3 == iVar) {
                        ab.f fVar = new ab.f(gVar, j3, f1Var, 1);
                        j4 = j3;
                        sVar.n0(fVar);
                        obj = fVar;
                    } else {
                        j4 = j3;
                        obj = N3;
                    }
                    int i18 = i13 << 3;
                    ub.c(gVar, d, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, i17, false, i12, 0, map, (j71.c) obj, q0Var4, sVar, (i13 >> 3) & 14, ((i13 >> 6) & 896) | (57344 & i18) | (i18 & 3670016) | ((i13 << 18) & 234881024), 45052);
                    i11 = i17;
                    i9 = i12;
                    q0Var3 = q0Var4;
                    j2 = j4;
                    rVar3 = rVar4;
                } else {
                    sVar.V();
                    j2 = j;
                    rVar3 = rVar2;
                    q0Var3 = q0Var2;
                    i9 = i6;
                    i11 = i8;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new i(rVar3, gVar, q0Var3, i9, i11, map, j2, i3, i4);
                    return;
                }
                return;
            }
            i8 = i2;
            if ((196608 & i3) == 0) {
            }
            if ((1572864 & i3) == 0) {
            }
            if (sVar.S(i5 & 1, (599187 & i5) != 599186)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        i6 = i;
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        i8 = i2;
        if ((196608 & i3) == 0) {
        }
        if ((1572864 & i3) == 0) {
        }
        if (sVar.S(i5 & 1, (599187 & i5) != 599186)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }


}
