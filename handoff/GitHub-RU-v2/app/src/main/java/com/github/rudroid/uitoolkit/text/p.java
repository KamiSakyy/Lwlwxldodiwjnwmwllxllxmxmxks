package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.m1;
import com.github.rudroid.adapters.viewholders.c3;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, q0 q0Var, int i, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        q0 q0Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        w1.r rVar3;
        q0 q0Var3;
        int i9;
        b2 t;
        q0 q0Var4;
        q0 q0Var5;
        w1.r rVar4;
        int i11;
        Object N;
        androidx.compose.runtime.i iVar;
        boolean z;
        sVar.e0(-742797583);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        }
        int i13 = i4 | (sVar.f(str) ? 32 : 16);
        if ((i3 & 4) == 0) {
            q0Var2 = q0Var;
            if (sVar.f(q0Var2)) {
                i5 = 256;
                i6 = i13 | i5;
                i7 = i3 & 8;
                if (i7 == 0) {
                    i6 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i8 = i;
                    i6 |= sVar.d(i8) ? 2048 : 1024;
                    if (sVar.S(i6 & 1, (i6 & 1171) != 1170)) {
                        sVar.X();
                        int i14 = i2 & 1;
                        w1.r rVar5 = w1.o.a;
                        if (i14 == 0 || sVar.A()) {
                            if (i12 != 0) {
                                rVar2 = rVar5;
                            }
                            if ((i3 & 4) != 0) {
                                q0Var4 = ih.d.f(sVar).l;
                                i6 &= -897;
                            } else {
                                q0Var4 = q0Var2;
                            }
                            q0Var5 = q0Var4;
                            rVar4 = rVar2;
                            if (i7 != 0) {
                                i11 = 3;
                                sVar.r();
                                N = sVar.N();
                                iVar = androidx.compose.runtime.n.a;
                                if (N == iVar) {
                                    N = new m1(i11);
                                    sVar.n0(N);
                                }
                                m1 m1Var = (m1) N;
                                w1.r a = z.a0.a(rVar5, (j71.e) null, 3);
                                z = (i6 & 7168) == 2048;
                                Object N2 = sVar.N();
                                Object obj = N2;
                                if (!z || N2 == iVar) {
                                    c3 c3Var = new c3(m1Var, i11, 2);
                                    sVar.n0(c3Var);
                                    obj = c3Var;
                                }
                                int i15 = i11;
                                ub.b(str, f0.o.m(a, false, (String) null, (d3.k) null, (j71.a) obj, 15).f(rVar4), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, m1Var.y(), 0, (j71.c) null, q0Var5, sVar, (i6 >> 3) & 14, ((i6 << 15) & 29360128) | 384, 110588);
                                q0Var3 = q0Var5;
                                i9 = i15;
                                rVar3 = rVar4;
                            }
                        } else {
                            sVar.V();
                            if ((i3 & 4) != 0) {
                                i6 &= -897;
                            }
                            rVar4 = rVar2;
                            q0Var5 = q0Var2;
                        }
                        i11 = i8;
                        sVar.r();
                        N = sVar.N();
                        iVar = androidx.compose.runtime.n.a;
                        if (N == iVar) {
                        }
                        m1 m1Var2 = (m1) N;
                        w1.r a2 = z.a0.a(rVar5, (j71.e) null, 3);
                        if ((i6 & 7168) == 2048) {
                        }
                        Object N22 = sVar.N();
                        Object obj2 = N22;
                        if (!z) {
                        }
                        c3 c3Var2 = new c3(m1Var2, i11, 2);
                        sVar.n0(c3Var2);
                        obj2 = c3Var2;
                        int i152 = i11;
                        ub.b(str, f0.o.m(a2, false, (String) null, (d3.k) null, (j71.a) obj2, 15).f(rVar4), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, m1Var2.y(), 0, (j71.c) null, q0Var5, sVar, (i6 >> 3) & 14, ((i6 << 15) & 29360128) | 384, 110588);
                        q0Var3 = q0Var5;
                        i9 = i152;
                        rVar3 = rVar4;
                    } else {
                        sVar.V();
                        rVar3 = rVar2;
                        q0Var3 = q0Var2;
                        i9 = i8;
                    }
                    t = sVar.t();
                    if (t != null) {
                        t.d = new com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.ui.l(rVar3, str, q0Var3, i9, i2, i3, 2);
                        return;
                    }
                    return;
                }
                i8 = i;
                if (sVar.S(i6 & 1, (i6 & 1171) != 1170)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
        } else {
            q0Var2 = q0Var;
        }
        i5 = 128;
        i6 = i13 | i5;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        i8 = i;
        if (sVar.S(i6 & 1, (i6 & 1171) != 1170)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

}
