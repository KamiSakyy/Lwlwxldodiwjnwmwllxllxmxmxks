package com.github.rudroid.uitoolkit.text;

import a0.n1;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.starredreposandlists.u0;
import com.google.android.gms.internal.measurement.i4;
import f1.gb;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0366, code lost:
    
        if (r6 == r2) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.r rVar, final String str, String str2, String str3, String str4, final int i, int i2, final boolean z, final j71.c cVar, int i3, j71.e eVar, float f, s0.m0 m0Var, s0.l0 l0Var, androidx.compose.runtime.s sVar, final int i4, final int i5, final int i6) {
        int i7;
        String str5;
        int i8;
        int i9;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        final String str7;
        final j71.e eVar2;
        final s0.l0 l0Var2;
        final String str8;
        final int i23;
        final String str9;
        final int i24;
        final float f2;
        final s0.m0 m0Var2;
        b2 t;
        float f3;
        int i25;
        String str10;
        int i26;
        s0.m0 m0Var3;
        String str11;
        s0.l0 l0Var3;
        j71.e eVar3;
        String str12;
        boolean z2;
        w1.r b;
        androidx.compose.runtime.i iVar;
        Object obj;
        w1.r rVar2;
        boolean z3;
        long j;
        int i27;
        k71.k.g(str, "text");
        k71.k.g(cVar, "onTextChange");
        sVar.e0(1063612982);
        if ((i4 & 6) == 0) {
            i7 = (sVar.f(rVar) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= sVar.f(str) ? 32 : 16;
        }
        int i28 = i6 & 4;
        if (i28 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            str5 = str2;
            i7 |= sVar.f(str5) ? 256 : 128;
            i8 = i7 | 3072;
            i9 = i6 & 16;
            if (i9 == 0) {
                i8 = i7 | 27648;
            } else if ((i4 & 24576) == 0) {
                i8 |= sVar.f(str3) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i8 |= 196608;
                    str6 = str4;
                } else {
                    str6 = str4;
                    if ((i4 & 196608) == 0) {
                        i8 |= sVar.f(str6) ? 131072 : 65536;
                    }
                }
                if ((i4 & 1572864) == 0) {
                    i8 |= sVar.d(i) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    if ((i6 & 128) == 0) {
                        i12 = i2;
                        if (sVar.d(i12)) {
                            i27 = 8388608;
                            i8 |= i27;
                        }
                    } else {
                        i12 = i2;
                    }
                    i27 = 4194304;
                    i8 |= i27;
                } else {
                    i12 = i2;
                }
                if ((i4 & 100663296) == 0) {
                    i8 |= sVar.g(z) ? 67108864 : 33554432;
                }
                if ((i4 & 805306368) == 0) {
                    i8 |= sVar.h(cVar) ? 536870912 : 268435456;
                }
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i15 = i5 | 6;
                    i14 = i3;
                } else {
                    i14 = i3;
                    if ((i5 & 6) == 0) {
                        i15 = i5 | (sVar.d(i14) ? 4 : 2);
                    } else {
                        i15 = i5;
                    }
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i5 & 48) == 0) {
                    i15 |= sVar.h(eVar) ? 32 : 16;
                }
                int i29 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i18 = i29 | 384;
                } else {
                    i18 = i29 | (sVar.c(f) ? 256 : 128);
                }
                i19 = i6 & 8192;
                if (i19 != 0) {
                    i21 = i18 | 3072;
                } else {
                    int i31 = i18;
                    if ((i5 & 3072) == 0) {
                        i31 |= sVar.f(m0Var) ? 2048 : 1024;
                    }
                    i21 = i31;
                }
                i22 = i21 | 24576;
                if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
                    sVar.X();
                    if ((i4 & 1) == 0 || sVar.A()) {
                        if (i28 != 0) {
                            str5 = null;
                        }
                        String str13 = i9 != 0 ? null : str3;
                        if (i11 != 0) {
                            str6 = null;
                        }
                        if ((i6 & 128) != 0) {
                            i8 &= -29360129;
                            i12 = str.length();
                        }
                        int i32 = i13 != 0 ? Integer.MAX_VALUE : i14;
                        j71.e eVar4 = i16 != 0 ? null : eVar;
                        f3 = i17 != 0 ? 0 : f;
                        s0.m0 m0Var4 = i19 != 0 ? s0.m0.e : m0Var;
                        i25 = i32;
                        str10 = str5;
                        i26 = i8;
                        m0Var3 = m0Var4;
                        str11 = str6;
                        l0Var3 = s0.l0.d;
                        eVar3 = eVar4;
                        str12 = str13;
                    } else {
                        sVar.V();
                        if ((i6 & 128) != 0) {
                            i8 &= -29360129;
                        }
                        str12 = str3;
                        f3 = f;
                        m0Var3 = m0Var;
                        l0Var3 = l0Var;
                        str10 = str5;
                        i26 = i8;
                        i25 = i14;
                        str11 = str6;
                        eVar3 = eVar;
                    }
                    sVar.r();
                    Object[] objArr = new Object[0];
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
                    Object obj2 = N;
                    if (N == iVar2) {
                        com.github.rudroid.searchandfilter.complexfilter.user.assignee.l lVar = new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(12);
                        sVar.n0(lVar);
                        obj2 = lVar;
                    }
                    f1 f1Var = (f1) u1.j.c(objArr, (j71.a) obj2, sVar, 48);
                    int i33 = i - i12;
                    androidx.compose.foundation.layout.g gVar = androidx.compose.foundation.layout.l.c;
                    w1.h hVar = w1.c.D;
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    String str14 = str10;
                    w1.r c = w1.a.c(sVar, rVar);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    v2.eShadow eVar5 = v2.g.f;
                    androidx.compose.runtime.t.I(sVar, eVar5, a);
                    v2.eShadow eVar6 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar, eVar6, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    v2.eShadow eVar7 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar, valueOf, eVar7);
                    v2.d dVar = v2.g.h;
                    androidx.compose.runtime.t.E(sVar, dVar);
                    v2.eShadow eVar8 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar, eVar8, c);
                    w1.r rVar3 = w1.o.a;
                    j71.e eVar9 = eVar3;
                    w1.r r = f0.o.r(p2.e(rVar3, 1.0f), false, 3);
                    boolean f4 = sVar.f(f1Var);
                    Object N2 = sVar.N();
                    Object obj3 = N2;
                    if (f4 || N2 == iVar2) {
                        ab.e eVar10 = new ab.e(f1Var, 11);
                        sVar.n0(eVar10);
                        obj3 = eVar10;
                    }
                    w1.r t2 = b2.d.t(r, (j71.c) obj3);
                    Object N3 = sVar.N();
                    Object obj4 = N3;
                    if (N3 == iVar2) {
                        k0 k0Var = k0.r;
                        sVar.n0(k0Var);
                        obj4 = k0Var;
                    }
                    w1.r e = o2.c.e(t2, (j71.c) obj4);
                    if (str12 == null && str11 == null) {
                        sVar.c0(-1468988502);
                        z2 = false;
                        sVar.q(false);
                        b = rVar3;
                    } else {
                        sVar.c0(-1469359448);
                        boolean z4 = ((i26 & 458752) == 131072) | ((i26 & 57344) == 16384);
                        Object N4 = sVar.N();
                        Object obj5 = N4;
                        if (z4 || N4 == iVar2) {
                            com.github.rudroid.actions.checkdetail.ui.n nVar = new com.github.rudroid.actions.checkdetail.ui.n(str12, 8, str11);
                            sVar.n0(nVar);
                            obj5 = nVar;
                        }
                        z2 = false;
                        b = d3.q.b(rVar3, false, (j71.c) obj5);
                        sVar.q(false);
                    }
                    w1.r f5 = e.f(b);
                    q0 q0Var = ih.d.f(sVar).l;
                    String str15 = str11;
                    boolean z5 = z2;
                    int i34 = i12;
                    String str16 = str12;
                    float f6 = f3;
                    gb a2 = q.a(0L, 0L, d2.t.j, 0L, 0L, sVar, 100663680, 251);
                    float f7 = z5 ? 1.0f : 0.0f;
                    f2 f8 = androidx.compose.foundation.layout.b.f(f7, 0.0f, f6, 0.0f, 10);
                    boolean z6 = (i26 & 1879048192) == 536870912 ? true : z5 ? 1 : 0;
                    Object N5 = sVar.N();
                    if (z6) {
                        iVar = iVar2;
                    } else {
                        iVar = iVar2;
                        obj = N5;
                    }
                    n1 n1Var = new n1(13, cVar);
                    sVar.n0(n1Var);
                    obj = n1Var;
                    int i35 = i26 << 6;
                    s0.m0 m0Var5 = m0Var3;
                    int i36 = i25;
                    s0.l0 l0Var4 = l0Var3;
                    androidx.compose.runtime.i iVar3 = iVar;
                    g0.c(f5, str, m0Var5, (j71.c) obj, str14, null, a2, 0, i36, z, false, false, q0Var, false, l0Var4, f8, null, new s3.f(f7), null, 0.0f, sVar, (i26 & 112) | ((i22 >> 3) & 896) | (i35 & 57344) | (i35 & 458752) | (1879048192 & (i22 << 27)), ((i26 >> 24) & 14) | 100859952, 0, 1724736);
                    if (eVar9 == null) {
                        sVar.c0(-1468206621);
                        sVar.q(z5);
                        rVar2 = rVar3;
                        z3 = true;
                    } else {
                        sVar.c0(-1468206620);
                        rVar2 = rVar3;
                        w1.r B = androidx.compose.foundation.layout.b.B(rVar2, 0.0f, ih.a.l, 0.0f, 0.0f, 13);
                        androidx.compose.foundation.layout.e0 a3 = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar, z5 ? 1 : 0);
                        int hashCode2 = Long.hashCode(sVar.T);
                        v1 l2 = sVar.l();
                        w1.r c2 = w1.a.c(sVar, B);
                        sVar.g0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.q0();
                        }
                        androidx.compose.runtime.t.I(sVar, eVar5, a3);
                        androidx.compose.runtime.t.I(sVar, eVar6, l2);
                        f1.e.t(hashCode2, sVar, eVar7, sVar, dVar);
                        androidx.compose.runtime.t.I(sVar, eVar8, c2);
                        eVar9.s(sVar, Integer.valueOf(z5 ? 1 : 0));
                        z3 = true;
                        sVar.q(true);
                        sVar.q(z5);
                    }
                    w1.r B2 = androidx.compose.foundation.layout.b.B(rVar2, 0.0f, eVar9 != null ? ih.a.m : ih.a.l, 0.0f, 0.0f, 13);
                    w1.r rVar4 = rVar2;
                    if (i33 <= 0) {
                        sVar.c0(-1467749959);
                        Object N6 = sVar.N();
                        Object obj6 = N6;
                        if (N6 == iVar3) {
                            u0 u0Var = new u0(20);
                            sVar.n0(u0Var);
                            obj6 = u0Var;
                        }
                        rVar4 = d3.q.b(rVar4, z5, (j71.c) obj6);
                        sVar.q(z5);
                    } else {
                        sVar.c0(-1467641366);
                        sVar.q(z5);
                    }
                    w1.r f9 = B2.f(rVar4);
                    String n0 = i4.n0(2131820562, i34, new Object[]{Integer.valueOf(i34), Integer.valueOf(i)}, sVar);
                    q0 q0Var2 = ih.d.f(sVar).x;
                    if (i33 <= 0) {
                        sVar.c0(-1467216139);
                        j = ih.d.b(sVar).s0;
                        sVar.q(z5);
                    } else {
                        sVar.c0(-1467133679);
                        j = ih.d.b(sVar).v;
                        sVar.q(z5);
                    }
                    ub.b(n0, f9, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(q0Var2, j, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131068);
                    sVar.q(z3);
                    i24 = i34;
                    f2 = f6;
                    m0Var2 = m0Var5;
                    str8 = str14;
                    i23 = i36;
                    str7 = str16;
                    str9 = str15;
                    l0Var2 = l0Var4;
                    eVar2 = eVar9;
                } else {
                    sVar.V();
                    str7 = str3;
                    eVar2 = eVar;
                    l0Var2 = l0Var;
                    str8 = str5;
                    i23 = i14;
                    str9 = str6;
                    i24 = i12;
                    f2 = f;
                    m0Var2 = m0Var;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.j0
                        public final Object s(Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            int L = androidx.compose.runtime.t.L(i4 | 1);
                            int L2 = androidx.compose.runtime.t.L(i5);
                            l0.a(rVar, str, str8, str7, str9, i, i24, z, cVar, i23, eVar2, f2, m0Var2, l0Var2, (androidx.compose.runtime.s) obj7, L, L2, i6);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i13 = i6 & 1024;
            if (i13 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i292 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 != 0) {
            }
            i22 = i21 | 24576;
            if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str5 = str2;
        i8 = i7 | 3072;
        i9 = i6 & 16;
        if (i9 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i13 = i6 & 1024;
        if (i13 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i2922 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 != 0) {
        }
        i22 = i21 | 24576;
        if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
