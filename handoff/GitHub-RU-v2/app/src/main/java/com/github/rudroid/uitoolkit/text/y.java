package com.github.rudroid.uitoolkit.text;

import a0.n1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import com.github.rudroid.copilot.ui.r0;
import f1.gb;
import f1.r7;
import g3.q0;
import w2.g1;
import w2.i2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public static final void a(w1.r rVar, l3.v vVar, s0.m0 m0Var, s0.l0 l0Var, j71.c cVar, boolean z, d2.p0 p0Var, String str, String str2, q0 q0Var, gb gbVar, boolean z2, int i, j71.e eVar, boolean z3, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        l3.v vVar2;
        s0.m0 m0Var2;
        boolean z4;
        int i5;
        k71.k.g(cVar, "onValueChange");
        sVar.e0(-1073067105);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            vVar2 = vVar;
            i4 |= sVar.f(vVar2) ? 32 : 16;
        } else {
            vVar2 = vVar;
        }
        if ((i2 & 384) == 0) {
            m0Var2 = m0Var;
            i4 |= sVar.f(m0Var2) ? 256 : 128;
        } else {
            m0Var2 = m0Var;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(l0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= sVar.h(cVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z4 = z;
            i4 |= sVar.g(z4) ? 131072 : 65536;
        } else {
            z4 = z;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= sVar.f(p0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= sVar.f(str) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= sVar.f(str2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= sVar.f(q0Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (sVar.f(gbVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar.g(z2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar.d(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= sVar.h(eVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= sVar.g(z3) ? 16384 : 8192;
        }
        int i6 = i5;
        int i7 = i4;
        if (sVar.S(i7 & 1, ((i4 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            sVar.X();
            if ((i2 & 1) != 0 && !sVar.A()) {
                sVar.V();
            }
            sVar.r();
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = no.a.f(sVar);
            }
            b2.a0 a0Var = (b2.a0) N;
            i2 i2Var = (i2) sVar.j(g1.p);
            w1.r k = b2.d.k(rVar, a0Var);
            boolean z5 = (i7 & 57344) == 16384;
            Object N2 = sVar.N();
            if (z5 || N2 == iVar) {
                N2 = new n1(12, cVar);
                sVar.n0(N2);
            }
            int i8 = i6 << 18;
            r7.a(vVar2, (j71.c) N2, k, false, z2, q0Var, r1.i.d(1823400517, new r0(str, q0Var, 1), sVar), r1.i.d(1669627462, new r0(str2, q0Var, 2), sVar), eVar, (j71.e) null, false, (l3.e0) null, m0Var2, l0Var, z4, i, 0, p0Var, gbVar, sVar, ((i7 >> 3) & 14) | 14155776 | ((i6 << 9) & 57344) | ((i7 >> 12) & 458752) | (i8 & 1879048192), ((i7 << 9) & 4128768) | ((i7 << 6) & 29360128) | (i8 & 234881024), ((i7 >> 15) & 112) | ((i6 << 6) & 896), 1604872);
            boolean f = ((i6 & 57344) == 16384) | sVar.f(i2Var);
            Object N3 = sVar.N();
            if (f || N3 == iVar) {
                N3 = new x(z3, a0Var, i2Var, null);
                sVar.n0(N3);
            }
            androidx.compose.runtime.t.f(sVar, (j71.e) N3, a0Var);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.feed.ui.p(rVar, vVar, m0Var, l0Var, cVar, z, p0Var, str, str2, q0Var, gbVar, z2, i, eVar, z3, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final w1.r rVar, final String str, s0.m0 m0Var, s0.l0 l0Var, final j71.c cVar, boolean z, d2.p0 p0Var, final String str2, final String str3, boolean z2, q0 q0Var, long j, gb gbVar, int i, j71.e eVar, boolean z3, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        int i5;
        s0.m0 m0Var2;
        int i6;
        int i7;
        d2.p0 p0Var2;
        int i8;
        boolean z4;
        q0 q0Var2;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z5;
        final s0.l0 l0Var2;
        final boolean z6;
        final j71.e eVar2;
        final boolean z7;
        final d2.p0 p0Var3;
        final boolean z8;
        final q0 q0Var3;
        final s0.m0 m0Var3;
        final long j2;
        final gb gbVar2;
        final int i15;
        b2 t;
        d2.p0 p0Var4;
        int i16;
        q0 q0Var4;
        long j3;
        s0.m0 m0Var4;
        int i17;
        int i18;
        androidx.compose.runtime.s sVar2;
        int i19;
        gb gbVar3;
        int i21;
        boolean z9;
        d2.p0 p0Var5;
        gb gbVar4;
        int i22;
        boolean z11;
        boolean z12;
        q0 q0Var5;
        long j4;
        s0.m0 m0Var5;
        j71.e eVar3;
        s0.l0 l0Var3;
        k71.k.g(str, "value");
        k71.k.g(cVar, "onValueChange");
        sVar.e0(-1215321136);
        if ((i2 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= sVar.f(str) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            m0Var2 = m0Var;
            i5 |= sVar.f(m0Var2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= sVar.f(l0Var) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i5 |= sVar.h(cVar) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= sVar.g(z) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    p0Var2 = p0Var;
                    i5 |= ((i4 & 64) == 0 && sVar.f(p0Var2)) ? 1048576 : 524288;
                } else {
                    p0Var2 = p0Var;
                }
                if ((i2 & 12582912) == 0) {
                    i5 |= sVar.f(str2) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i5 |= sVar.f(str3) ? 67108864 : 33554432;
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 805306368) == 0) {
                        i5 |= sVar.g(z4) ? 536870912 : 268435456;
                    }
                }
                if ((i4 & 1024) == 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i9 = 4;
                        int i24 = i3 | i9 | (((i4 & 2048) == 0 || !sVar.e(j)) ? 16 : 32);
                        if ((i4 & 4096) == 0 && sVar.f(gbVar)) {
                            i11 = 256;
                            int i25 = i24 | i11;
                            i12 = i25 | 1024;
                            i13 = i4 & 16384;
                            if (i13 == 0) {
                                i12 = i25 | 25600;
                            } else if ((i3 & 24576) == 0) {
                                i12 |= sVar.h(eVar) ? 16384 : 8192;
                                i14 = i4 & 32768;
                                if (i14 != 0) {
                                    i12 |= 196608;
                                    z5 = z3;
                                } else {
                                    z5 = z3;
                                    if ((i3 & 196608) == 0) {
                                        i12 |= sVar.g(z5) ? 131072 : 65536;
                                    }
                                }
                                if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
                                    sVar.X();
                                    if ((i2 & 1) == 0 || sVar.A()) {
                                        s0.m0 m0Var6 = i23 != 0 ? s0.m0.e : m0Var2;
                                        s0.l0 l0Var4 = i6 != 0 ? s0.l0.d : l0Var;
                                        boolean z13 = i7 != 0 ? false : z;
                                        if ((i4 & 64) != 0) {
                                            i5 &= -3670017;
                                            p0Var4 = ih.d.e(sVar).a;
                                        } else {
                                            p0Var4 = p0Var2;
                                        }
                                        i16 = i5;
                                        boolean z14 = i8 != 0 ? false : z4;
                                        if ((i4 & 1024) != 0) {
                                            i12 &= -15;
                                            q0Var4 = ih.d.f(sVar).D;
                                        } else {
                                            q0Var4 = q0Var2;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            int length = str.length();
                                            i12 &= -113;
                                            j3 = g3.g0.b(length, length);
                                        } else {
                                            j3 = j;
                                        }
                                        if ((i4 & 4096) != 0) {
                                            int i26 = i12;
                                            i17 = i13;
                                            m0Var4 = m0Var6;
                                            i18 = 4;
                                            gbVar3 = q.a(ih.d.b(sVar).L, 0L, ih.d.b(sVar).p, ih.d.b(sVar).x, 0L, sVar, 100663296, 218);
                                            sVar2 = sVar;
                                            i19 = i26 & (-897);
                                        } else {
                                            m0Var4 = m0Var6;
                                            i17 = i13;
                                            i18 = 4;
                                            sVar2 = sVar;
                                            i19 = i12;
                                            gbVar3 = gbVar;
                                        }
                                        int i27 = z13 ? 1 : Integer.MAX_VALUE;
                                        i21 = i19 & (-7169);
                                        j71.e eVar4 = i17 != 0 ? null : eVar;
                                        if (i14 != 0) {
                                            p0Var5 = p0Var4;
                                            gbVar4 = gbVar3;
                                            i22 = i27;
                                            z11 = z13;
                                            z9 = true;
                                        } else {
                                            z9 = z3;
                                            p0Var5 = p0Var4;
                                            gbVar4 = gbVar3;
                                            i22 = i27;
                                            z11 = z13;
                                        }
                                        z12 = z14;
                                        q0Var5 = q0Var4;
                                        j4 = j3;
                                        m0Var5 = m0Var4;
                                        eVar3 = eVar4;
                                        l0Var3 = l0Var4;
                                    } else {
                                        sVar.V();
                                        if ((i4 & 64) != 0) {
                                            i5 &= -3670017;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i12 &= -15;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            i12 &= -113;
                                        }
                                        if ((i4 & 4096) != 0) {
                                            i12 &= -897;
                                        }
                                        gbVar4 = gbVar;
                                        i22 = i;
                                        eVar3 = eVar;
                                        sVar2 = sVar;
                                        i21 = i12 & (-7169);
                                        z9 = z5;
                                        i16 = i5;
                                        p0Var5 = p0Var2;
                                        z12 = z4;
                                        m0Var5 = m0Var2;
                                        i18 = 4;
                                        l0Var3 = l0Var;
                                        z11 = z;
                                        q0Var5 = q0Var2;
                                        j4 = j;
                                    }
                                    sVar2.r();
                                    Object N = sVar2.N();
                                    Object obj = androidx.compose.runtime.n.a;
                                    if (N == obj) {
                                        N = androidx.compose.runtime.t.B(new l3.v(i18, j4, str));
                                        sVar2.n0(N);
                                    }
                                    f1 f1Var = (f1) N;
                                    s0.m0 m0Var7 = m0Var5;
                                    s0.l0 l0Var5 = l0Var3;
                                    l3.v b = l3.v.b((l3.v) f1Var.getValue(), str, 0L, 6);
                                    boolean z15 = ((i16 & 112) == 32) | ((i16 & 57344) == 16384);
                                    Object N2 = sVar2.N();
                                    if (z15 || N2 == obj) {
                                        N2 = new v(str, cVar, f1Var, 0);
                                        sVar2.n0(N2);
                                    }
                                    int i28 = (i16 & 268377998) | ((i21 << 27) & 1879048192);
                                    int i29 = ((i21 >> 6) & 14) | ((i16 >> 24) & 112);
                                    int i31 = i21 >> 3;
                                    a(rVar, b, m0Var7, l0Var5, (j71.c) N2, z11, p0Var5, str2, str3, q0Var5, gbVar4, z12, i22, eVar3, z9, sVar2, i28, i29 | (i31 & 7168) | (i31 & 57344));
                                    m0Var3 = m0Var7;
                                    l0Var2 = l0Var5;
                                    z6 = z11;
                                    p0Var3 = p0Var5;
                                    q0Var3 = q0Var5;
                                    gbVar2 = gbVar4;
                                    z8 = z12;
                                    i15 = i22;
                                    eVar2 = eVar3;
                                    z7 = z9;
                                    j2 = j4;
                                } else {
                                    sVar.V();
                                    l0Var2 = l0Var;
                                    z6 = z;
                                    eVar2 = eVar;
                                    z7 = z3;
                                    p0Var3 = p0Var2;
                                    z8 = z4;
                                    q0Var3 = q0Var2;
                                    m0Var3 = m0Var2;
                                    j2 = j;
                                    gbVar2 = gbVar;
                                    i15 = i;
                                }
                                t = sVar.t();
                                if (t != null) {
                                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.w
                                        public final Object s(Object obj2, Object obj3) {
                                            ((Integer) obj3).getClass();
                                            int L = androidx.compose.runtime.t.L(i2 | 1);
                                            int L2 = androidx.compose.runtime.t.L(i3);
                                            y.b(rVar, str, m0Var3, l0Var2, cVar, z6, p0Var3, str2, str3, z8, q0Var3, j2, gbVar2, i15, eVar2, z7, (androidx.compose.runtime.s) obj2, L, L2, i4);
                                            return w61.a0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i14 = i4 & 32768;
                            if (i14 != 0) {
                            }
                            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
                            }
                            t = sVar.t();
                            if (t != null) {
                            }
                        }
                        i11 = 128;
                        int i252 = i24 | i11;
                        i12 = i252 | 1024;
                        i13 = i4 & 16384;
                        if (i13 == 0) {
                        }
                        i14 = i4 & 32768;
                        if (i14 != 0) {
                        }
                        if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
                        }
                        t = sVar.t();
                        if (t != null) {
                        }
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i9 = 2;
                int i242 = i3 | i9 | (((i4 & 2048) == 0 || !sVar.e(j)) ? 16 : 32);
                if ((i4 & 4096) == 0) {
                    i11 = 256;
                    int i2522 = i242 | i11;
                    i12 = i2522 | 1024;
                    i13 = i4 & 16384;
                    if (i13 == 0) {
                    }
                    i14 = i4 & 32768;
                    if (i14 != 0) {
                    }
                    if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                i11 = 128;
                int i25222 = i242 | i11;
                i12 = i25222 | 1024;
                i13 = i4 & 16384;
                if (i13 == 0) {
                }
                i14 = i4 & 32768;
                if (i14 != 0) {
                }
                if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            if ((i4 & 1024) == 0) {
            }
            i9 = 2;
            int i2422 = i3 | i9 | (((i4 & 2048) == 0 || !sVar.e(j)) ? 16 : 32);
            if ((i4 & 4096) == 0) {
            }
            i11 = 128;
            int i252222 = i2422 | i11;
            i12 = i252222 | 1024;
            i13 = i4 & 16384;
            if (i13 == 0) {
            }
            i14 = i4 & 32768;
            if (i14 != 0) {
            }
            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        m0Var2 = m0Var;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        i9 = 2;
        int i24222 = i3 | i9 | (((i4 & 2048) == 0 || !sVar.e(j)) ? 16 : 32);
        if ((i4 & 4096) == 0) {
        }
        i11 = 128;
        int i2522222 = i24222 | i11;
        i12 = i2522222 | 1024;
        i13 = i4 & 16384;
        if (i13 == 0) {
        }
        i14 = i4 & 32768;
        if (i14 != 0) {
        }
        if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (74899 & i12) != 74898)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class gb<T1,T2,T3,T4> {
        public gb() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}
