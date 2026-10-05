package com.github.rudroid.uitoolkit.text;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import f1.g2;
import f1.p5;
import f1.ub;
import g3.q0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.r rVar, final l lVar, final f2 f2Var, final d2.t tVar, w1.i iVar, androidx.compose.foundation.layout.i iVar2, final g3.g gVar, Map map, String str, long j, int i, int i2, final q0 q0Var, boolean z, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5) {
        Map map2;
        int i6;
        String str2;
        int i7;
        int i8;
        long j2;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final androidx.compose.foundation.layout.i iVar3;
        final int i18;
        final int i19;
        final boolean z2;
        final Map map3;
        final long j3;
        final w1.i iVar4;
        final String str3;
        b2 t;
        androidx.compose.foundation.layout.i iVar5;
        Map map4;
        int i21;
        String str4;
        long j4;
        int i22;
        final Map map5;
        int i23;
        int i24;
        String str5;
        boolean z3;
        k71.k.g(lVar, "compoundDrawable");
        sVar.e0(-315559811);
        int i25 = (sVar.f(rVar) ? 4 : 2) | i3 | (sVar.f(lVar) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i25 |= sVar.f(f2Var) ? 256 : 128;
        }
        int i26 = i25 | (sVar.f(tVar) ? 2048 : 1024);
        int i27 = i26 | 24576;
        int i28 = i5 & 32;
        if (i28 != 0) {
            i27 = 221184 | i26;
        } else if ((196608 & i3) == 0) {
            i27 |= sVar.f(iVar2) ? 131072 : 65536;
            int i29 = i27 | (!sVar.f(gVar) ? 1048576 : 524288);
            if ((i5 & 128) != 0) {
                map2 = map;
                if (sVar.h(map2)) {
                    i6 = 8388608;
                    int i31 = i29 | i6;
                    if ((i5 & 256) == 0) {
                        str2 = str;
                        if (sVar.f(str2)) {
                            i7 = 67108864;
                            int i32 = i31 | i7;
                            i8 = i5 & 512;
                            if (i8 == 0) {
                                i9 = i32 | 805306368;
                                j2 = j;
                            } else {
                                j2 = j;
                                i9 = i32 | (sVar.e(j2) ? 536870912 : 268435456);
                            }
                            i11 = i5 & 1024;
                            if (i11 == 0) {
                                i13 = i4 | 6;
                                i12 = i11;
                            } else if ((i4 & 6) == 0) {
                                i12 = i11;
                                i13 = i4 | (sVar.d(i) ? 4 : 2);
                            } else {
                                i12 = i11;
                                i13 = i4;
                            }
                            i14 = i5 & 2048;
                            if (i14 == 0) {
                                i13 |= 48;
                            } else if ((i4 & 48) == 0) {
                                i15 = i14;
                                i13 |= sVar.d(i2) ? 32 : 16;
                                i16 = i13 | (sVar.f(q0Var) ? 256 : 128) | 27648;
                                i17 = i9;
                                if (sVar.S(i17 & 1, (i9 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                                    sVar.X();
                                    if ((i3 & 1) == 0 || sVar.A()) {
                                        w1.i iVar6 = w1.c.B;
                                        iVar5 = i28 != 0 ? androidx.compose.foundation.layout.l.a : iVar2;
                                        if ((i5 & 128) != 0) {
                                            map4 = new LinkedHashMap();
                                            i21 = i17 & (-29360129);
                                        } else {
                                            map4 = map2;
                                            i21 = i17;
                                        }
                                        if ((i5 & 256) != 0) {
                                            str4 = gVar.s;
                                            i21 &= -234881025;
                                        } else {
                                            str4 = str2;
                                        }
                                        j4 = i8 != 0 ? d2.t.k : j2;
                                        int i33 = i12 != 0 ? Integer.MAX_VALUE : i;
                                        i22 = i15 != 0 ? 1 : i2;
                                        int i34 = i33;
                                        map5 = map4;
                                        i23 = i34;
                                        iVar = iVar6;
                                        i24 = i21;
                                        str5 = str4;
                                        z3 = true;
                                    } else {
                                        sVar.V();
                                        int i35 = (i5 & 128) != 0 ? i17 & (-29360129) : i17;
                                        if ((i5 & 256) != 0) {
                                            i35 &= -234881025;
                                        }
                                        iVar5 = iVar2;
                                        i23 = i;
                                        i24 = i35;
                                        str5 = str2;
                                        j4 = j2;
                                        i22 = i2;
                                        map5 = map2;
                                        z3 = z;
                                    }
                                    sVar.r();
                                    final int i36 = i23;
                                    boolean z4 = z3;
                                    final long d = d(j4, q0Var, z4, sVar);
                                    final String str6 = str5;
                                    long j5 = tVar != null ? tVar.a : d;
                                    long j6 = j4;
                                    final int i37 = i22;
                                    Map map6 = map5;
                                    iVar4 = iVar;
                                    iVar3 = iVar5;
                                    b(rVar, lVar, f2Var, j5, iVar4, iVar3, r1.i.d(2079890732, new j71.f() { // from class: com.github.rudroid.uitoolkit.text.i
                                        public final Object f(Object obj, Object obj2, Object obj3) {
                                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            k71.k.g((m2) obj, "$this$CompoundDrawableText");
                                            if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                                String str7 = str6;
                                                boolean f = sVar2.f(str7) | sVar2.g(false);
                                                Object N = sVar2.N();
                                                if (f || N == androidx.compose.runtime.n.a) {
                                                    N = new com.github.rudroid.uitoolkit.listitems.z(str7, 3);
                                                    sVar2.n0(N);
                                                }
                                                ub.c(gVar, d3.q.b(w1.o.a, false, (j71.c) N), d, 0L, (k3.i) null, 0L, (r3.k) null, 0L, i37, false, i36, 0, map5, (j71.c) null, q0Var, sVar2, 0, 0, 176120);
                                            } else {
                                                sVar2.V();
                                            }
                                            return w61.a0.a;
                                        }
                                    }, sVar), sVar, (i24 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | 24576 | (i24 & 458752), 0);
                                    str3 = str6;
                                    z2 = z4;
                                    j3 = j6;
                                    i19 = i37;
                                    i18 = i36;
                                    map3 = map6;
                                } else {
                                    sVar.V();
                                    iVar3 = iVar2;
                                    i18 = i;
                                    i19 = i2;
                                    z2 = z;
                                    map3 = map2;
                                    j3 = j2;
                                    iVar4 = iVar;
                                    str3 = str2;
                                }
                                t = sVar.t();
                                if (t != null) {
                                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.j
                                        public final Object s(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int L = androidx.compose.runtime.t.L(i3 | 1);
                                            int L2 = androidx.compose.runtime.t.L(i4);
                                            k.a(rVar, lVar, f2Var, tVar, iVar4, iVar3, gVar, map3, str3, j3, i18, i19, q0Var, z2, (androidx.compose.runtime.s) obj, L, L2, i5);
                                            return w61.a0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i15 = i14;
                            i16 = i13 | (sVar.f(q0Var) ? 256 : 128) | 27648;
                            i17 = i9;
                            if (sVar.S(i17 & 1, (i9 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                            }
                            t = sVar.t();
                            if (t != null) {
                            }
                        }
                    } else {
                        str2 = str;
                    }
                    i7 = 33554432;
                    int i322 = i31 | i7;
                    i8 = i5 & 512;
                    if (i8 == 0) {
                    }
                    i11 = i5 & 1024;
                    if (i11 == 0) {
                    }
                    i14 = i5 & 2048;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i13 | (sVar.f(q0Var) ? 256 : 128) | 27648;
                    i17 = i9;
                    if (sVar.S(i17 & 1, (i9 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
            } else {
                map2 = map;
            }
            i6 = 4194304;
            int i312 = i29 | i6;
            if ((i5 & 256) == 0) {
            }
            i7 = 33554432;
            int i3222 = i312 | i7;
            i8 = i5 & 512;
            if (i8 == 0) {
            }
            i11 = i5 & 1024;
            if (i11 == 0) {
            }
            i14 = i5 & 2048;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i13 | (sVar.f(q0Var) ? 256 : 128) | 27648;
            i17 = i9;
            if (sVar.S(i17 & 1, (i9 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        int i292 = i27 | (!sVar.f(gVar) ? 1048576 : 524288);
        if ((i5 & 128) != 0) {
        }
        i6 = 4194304;
        int i3122 = i292 | i6;
        if ((i5 & 256) == 0) {
        }
        i7 = 33554432;
        int i32222 = i3122 | i7;
        i8 = i5 & 512;
        if (i8 == 0) {
        }
        i11 = i5 & 1024;
        if (i11 == 0) {
        }
        i14 = i5 & 2048;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i13 | (sVar.f(q0Var) ? 256 : 128) | 27648;
        i17 = i9;
        if (sVar.S(i17 & 1, (i9 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, l lVar, d2 d2Var, long j, w1.i iVar, androidx.compose.foundation.layout.i iVar2, j71.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        d2 d2Var2;
        int i4;
        w1.i iVar3;
        int i5;
        androidx.compose.foundation.layout.i iVar4;
        long j2;
        w1.r rVar3;
        d2 d2Var3;
        w1.i iVar5;
        androidx.compose.foundation.layout.i iVar6;
        b2 t;
        long j3;
        w1.i iVar7;
        long j4;
        boolean z;
        w1.r rVar4;
        int i6;
        boolean z2;
        k71.k.g(lVar, "compoundDrawable");
        k71.k.g(fVar, "textContent");
        sVar.e0(370310748);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= (i & 64) == 0 ? sVar.f(lVar) : sVar.h(lVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            d2Var2 = d2Var;
            i3 |= sVar.f(d2Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= ((i2 & 8) == 0 && sVar.e(j)) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                iVar3 = iVar;
                i3 |= sVar.f(iVar3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    iVar4 = iVar2;
                    i3 |= sVar.f(iVar4) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= sVar.h(fVar) ? 1048576 : 524288;
                    }
                    if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
                        sVar.V();
                        j2 = j;
                        rVar3 = rVar2;
                        d2Var3 = d2Var2;
                        iVar5 = iVar3;
                        iVar6 = iVar4;
                    } else {
                        sVar.X();
                        int i9 = i & 1;
                        w1.r rVar5 = w1.o.a;
                        if (i9 == 0 || sVar.A()) {
                            if (i7 != 0) {
                                rVar2 = rVar5;
                            }
                            if (i8 != 0) {
                                d2Var2 = androidx.compose.foundation.layout.b.d(3, 0.0f);
                            }
                            if ((i2 & 8) != 0) {
                                j3 = ((d2.t) sVar.j(g2.a)).a;
                                i3 &= -7169;
                            } else {
                                j3 = j;
                            }
                            iVar7 = i4 != 0 ? w1.c.B : iVar3;
                            iVar6 = i5 != 0 ? androidx.compose.foundation.layout.l.a : iVar4;
                            j4 = j3;
                        } else {
                            sVar.V();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            iVar7 = iVar3;
                            iVar6 = iVar4;
                            j4 = j;
                        }
                        sVar.r();
                        l2 a = j2.a(iVar6, iVar7, sVar, ((((i3 & 14) | ((i3 >> 12) & 112)) | ((i3 >> 6) & 896)) >> 3) & 126);
                        int hashCode = Long.hashCode(sVar.T);
                        v1 l = sVar.l();
                        w1.r c = w1.a.c(sVar, rVar2);
                        v2.h.o.getClass();
                        v2.f fVar2 = v2.g.b;
                        sVar.g0();
                        w1.r rVar6 = rVar2;
                        if (sVar.S) {
                            sVar.k(fVar2);
                        } else {
                            sVar.q0();
                        }
                        androidx.compose.runtime.t.I(sVar, v2.g.f, a);
                        androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar, v2.g.h);
                        androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                        i2.b c2 = lVar.c(sVar);
                        if (c2 == null) {
                            sVar.c0(1970741418);
                            sVar.q(false);
                            i6 = 56;
                            z = false;
                            rVar4 = rVar5;
                            z2 = true;
                        } else {
                            sVar.c0(1970741419);
                            z = false;
                            rVar4 = rVar5;
                            i6 = 56;
                            z2 = true;
                            p5.a(c2, (String) null, androidx.compose.foundation.layout.b.B(lVar.a(), 0.0f, d2Var2.d(), 0.0f, d2Var2.a(), 5), j4, sVar, (i3 & 7168) | 56, 0);
                            androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.b.w(rVar4, d2Var2));
                            sVar.q(false);
                        }
                        fVar.f(n2.a, sVar, Integer.valueOf(((i3 >> 15) & 112) | 6));
                        i2.b b = lVar.b(sVar);
                        if (b == null) {
                            sVar.c0(1971289932);
                        } else {
                            sVar.c0(1971289933);
                            androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.b.w(rVar4, d2Var2));
                            p5.a(b, (String) null, androidx.compose.foundation.layout.b.B(lVar.d(), 0.0f, d2Var2.d(), 0.0f, d2Var2.a(), 5), j4, sVar, i6 | (i3 & 7168), 0);
                        }
                        sVar.q(z);
                        sVar.q(z2);
                        d2Var3 = d2Var2;
                        rVar3 = rVar6;
                        iVar5 = iVar7;
                        j2 = j4;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new h(rVar3, lVar, d2Var3, j2, iVar5, iVar6, fVar, i, i2);
                        return;
                    }
                    return;
                }
                iVar4 = iVar2;
                if ((1572864 & i) == 0) {
                }
                if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            iVar3 = iVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            iVar4 = iVar2;
            if ((1572864 & i) == 0) {
            }
            if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        d2Var2 = d2Var;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        iVar3 = iVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        iVar4 = iVar2;
        if ((1572864 & i) == 0) {
        }
        if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, final l lVar, d2 d2Var, d2.t tVar, w1.i iVar, androidx.compose.foundation.layout.i iVar2, final String str, String str2, long j, int i, int i2, q0 q0Var, boolean z, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5) {
        w1.r rVar2;
        int i6;
        d2 d2Var2;
        int i7;
        d2.t tVar2;
        int i8;
        int i9;
        androidx.compose.foundation.layout.i iVar3;
        String str3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final long j2;
        final int i18;
        final q0 q0Var2;
        final String str4;
        final w1.r rVar3;
        final androidx.compose.foundation.layout.i iVar4;
        final d2 d2Var3;
        final d2.t tVar3;
        final w1.i iVar5;
        final int i19;
        final boolean z2;
        b2 t;
        w1.r rVar4;
        androidx.compose.foundation.layout.i iVar6;
        final int i21;
        int i22;
        w1.i iVar7;
        final int i23;
        final q0 q0Var3;
        boolean z3;
        String str5;
        long j3;
        int i24;
        int i25;
        k71.k.g(lVar, "compoundDrawable");
        k71.k.g(str, "text");
        sVar.e0(2030676861);
        int i26 = i5 & 1;
        if (i26 != 0) {
            i6 = i3 | 6;
            rVar2 = rVar;
        } else if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i6 = (sVar.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= (i3 & 64) == 0 ? sVar.f(lVar) : sVar.h(lVar) ? 32 : 16;
        }
        int i27 = i5 & 4;
        if (i27 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            d2Var2 = d2Var;
            i6 |= sVar.f(d2Var2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                tVar2 = tVar;
                i6 |= sVar.f(tVar2) ? 2048 : 1024;
                i8 = i6 | 24576;
                i9 = i5 & 32;
                if (i9 != 0) {
                    i8 = 221184 | i6;
                } else if ((196608 & i3) == 0) {
                    iVar3 = iVar2;
                    i8 |= sVar.f(iVar3) ? 131072 : 65536;
                    if ((i3 & 1572864) == 0) {
                        i8 |= sVar.f(str) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            str3 = str2;
                            if (sVar.f(str3)) {
                                i25 = 8388608;
                                i8 |= i25;
                            }
                        } else {
                            str3 = str2;
                        }
                        i25 = 4194304;
                        i8 |= i25;
                    } else {
                        str3 = str2;
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                        i8 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i8 |= sVar.e(j) ? 67108864 : 33554432;
                    }
                    i12 = i5 & 512;
                    if (i12 == 0) {
                        i8 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i8 |= sVar.d(i) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (sVar.d(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        if ((i5 & 2048) == 0 && sVar.f(q0Var)) {
                            i24 = 32;
                            i15 |= i24;
                        }
                        i24 = 16;
                        i15 |= i24;
                    }
                    i16 = i15 | 3456;
                    i17 = i8;
                    if (sVar.S(i17 & 1, (i8 & 306783379) == 306783378 || (i16 & 1171) != 1170)) {
                        sVar.V();
                        j2 = j;
                        i18 = i;
                        q0Var2 = q0Var;
                        str4 = str3;
                        rVar3 = rVar2;
                        iVar4 = iVar3;
                        d2Var3 = d2Var2;
                        tVar3 = tVar2;
                        iVar5 = iVar;
                        i19 = i2;
                        z2 = z;
                    } else {
                        sVar.X();
                        if ((i3 & 1) == 0 || sVar.A()) {
                            w1.r rVar5 = i26 != 0 ? w1.o.a : rVar2;
                            d2 d = i27 != 0 ? androidx.compose.foundation.layout.b.d(3, 0.0f) : d2Var2;
                            if (i7 != 0) {
                                tVar2 = null;
                            }
                            w1.i iVar8 = w1.c.B;
                            if (i9 != 0) {
                                iVar3 = androidx.compose.foundation.layout.l.a;
                            }
                            if ((i5 & 128) != 0) {
                                i17 &= -29360129;
                                str3 = str;
                            }
                            long j4 = i11 != 0 ? d2.t.k : j;
                            int i28 = i12 != 0 ? Integer.MAX_VALUE : i;
                            rVar4 = rVar5;
                            iVar6 = iVar3;
                            i21 = i14 != 0 ? 1 : i2;
                            i22 = i17;
                            iVar7 = iVar8;
                            long j5 = j4;
                            i23 = i28;
                            q0Var3 = (i5 & 2048) != 0 ? (q0) sVar.j(ub.a) : q0Var;
                            z3 = true;
                            d2Var2 = d;
                            str5 = str3;
                            j3 = j5;
                        } else {
                            sVar.V();
                            iVar7 = iVar;
                            i23 = i;
                            q0Var3 = q0Var;
                            z3 = z;
                            i22 = (i5 & 128) != 0 ? i17 & (-29360129) : i17;
                            str5 = str3;
                            rVar4 = rVar2;
                            iVar6 = iVar3;
                            j3 = j;
                            i21 = i2;
                        }
                        sVar.r();
                        final String str6 = str5;
                        long j6 = j3;
                        final long d2 = d(j6, q0Var3, z3, sVar);
                        boolean z4 = z3;
                        long j7 = tVar2 != null ? tVar2.a : d2;
                        int i29 = i23;
                        iVar5 = iVar7;
                        d2 d2Var4 = d2Var2;
                        iVar4 = iVar6;
                        w1.r rVar6 = rVar4;
                        b(rVar6, lVar, d2Var4, j7, iVar5, iVar4, r1.i.d(477892206, new j71.f() { // from class: com.github.rudroid.uitoolkit.text.f
                            public final Object f(Object obj, Object obj2, Object obj3) {
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                k71.k.g((m2) obj, "$this$CompoundDrawableText");
                                if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                    String str7 = str6;
                                    boolean f = sVar2.f(str7) | sVar2.g(false);
                                    Object N = sVar2.N();
                                    if (f || N == androidx.compose.runtime.n.a) {
                                        N = new com.github.rudroid.uitoolkit.listitems.z(str7, 2);
                                        sVar2.n0(N);
                                    }
                                    ub.b(str, d3.q.b(w1.o.a, false, (j71.c) N), d2, 0L, (k3.s) null, 0L, (r3.k) null, 0L, i21, false, i23, 0, (j71.c) null, q0Var3, sVar2, 0, 0, 110584);
                                } else {
                                    sVar2.V();
                                }
                                return w61.a0.a;
                            }
                        }, sVar), sVar, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (57344 & i22) | (i22 & 458752), 0);
                        rVar3 = rVar6;
                        d2Var3 = d2Var4;
                        tVar3 = tVar2;
                        z2 = z4;
                        q0Var2 = q0Var3;
                        j2 = j6;
                        str4 = str6;
                        i19 = i21;
                        i18 = i29;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.g
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int L = androidx.compose.runtime.t.L(i3 | 1);
                                int L2 = androidx.compose.runtime.t.L(i4);
                                k.c(rVar3, lVar, d2Var3, tVar3, iVar5, iVar4, str, str4, j2, i18, i19, q0Var2, z2, (androidx.compose.runtime.s) obj, L, L2, i5);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                iVar3 = iVar2;
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) != 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i5 & 512;
                if (i12 == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                i16 = i15 | 3456;
                i17 = i8;
                if (sVar.S(i17 & 1, (i8 & 306783379) == 306783378 || (i16 & 1171) != 1170)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            tVar2 = tVar;
            i8 = i6 | 24576;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            iVar3 = iVar2;
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) != 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i5 & 512;
            if (i12 == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            i16 = i15 | 3456;
            i17 = i8;
            if (sVar.S(i17 & 1, (i8 & 306783379) == 306783378 || (i16 & 1171) != 1170)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        d2Var2 = d2Var;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        tVar2 = tVar;
        i8 = i6 | 24576;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        iVar3 = iVar2;
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) != 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i5 & 512;
        if (i12 == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i16 = i15 | 3456;
        i17 = i8;
        if (sVar.S(i17 & 1, (i8 & 306783379) == 306783378 || (i16 & 1171) != 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final long d(long j, q0 q0Var, boolean z, androidx.compose.runtime.s sVar) {
        k71.k.g(q0Var, "style");
        sVar.c0(692535470);
        if (j == 16) {
            sVar.c0(692536487);
            j = q0Var.b();
            if (j == 16) {
                j = ((d2.t) sVar.j(g2.a)).a;
            }
            sVar.q(false);
        }
        sVar.q(false);
        return !z ? d2.t.b(0.38f, j) : j;
    }


}
