package eh;

import a0.n1;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import d1.e0;
import d2.a0;
import d3.q;
import d9.m;
import f0.o;
import f1.ub;
import g3.q0;
import java.util.Map;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final void a(r rVar, g3.g gVar, String str, String str2, String str3, q0 q0Var, q0 q0Var2, boolean z, j71.c cVar, d2 d2Var, long j, s sVar, int i, int i2) {
        int i3;
        int i4;
        s sVar2;
        k71.k.g(cVar, "onCheckedChange");
        sVar.e0(1961941821);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.f(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.f(q0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar.f(q0Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sVar.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar.h(cVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar.f(d2Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.e(j) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (sVar.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            sVar.X();
            if ((i & 1) != 0 && !sVar.A()) {
                sVar.V();
            }
            sVar.r();
            r b = p2.b(rVar, 0.0f, ih.a.F, 1);
            boolean z2 = (i3 & 7168) == 2048;
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = n.a;
            if (z2 || N == iVar) {
                N = new m(str2, 21);
                sVar.n0(N);
            }
            r b2 = q.b(b, false, (j71.c) N);
            d3.k kVar = new d3.k(2);
            boolean z3 = (i3 & 234881024) == 67108864;
            Object N2 = sVar.N();
            Object obj = N2;
            if (z3 || N2 == iVar) {
                n1 n1Var = new n1(19, cVar);
                sVar.n0(n1Var);
                obj = n1Var;
            }
            r e = q0.c.e(b2, z, false, kVar, (j71.c) obj, 10);
            boolean z4 = ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object N3 = sVar.N();
            if (z4 || N3 == iVar) {
                N3 = new e0(14, str3, gVar);
                sVar.n0(N3);
            }
            r e2 = p2.e(androidx.compose.foundation.layout.b.w(o.f(q.a(e, (j71.c) N3), j, a0.b), d2Var), 1.0f);
            l2 a = j2.a(l.g, w1.c.B, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, e2);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            v2.e eVar = v2.g.f;
            t.I(sVar, eVar, a);
            v2.e eVar2 = v2.g.e;
            t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            t.w(sVar, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            t.E(sVar, dVar);
            v2.e eVar4 = v2.g.d;
            t.I(sVar, eVar4, c);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            r B = androidx.compose.foundation.layout.b.B(new w1(1.0f, true), 0.0f, 0.0f, ih.a.n, 0.0f, 11);
            androidx.compose.foundation.layout.e0 a2 = c0.a(l.c, w1.c.D, sVar, 0);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            r c2 = w1.a.c(sVar, B);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, eVar, a2);
            t.I(sVar, eVar2, l2);
            f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
            t.I(sVar, eVar4, c2);
            int i5 = i3 << 6;
            int i6 = i3;
            ub.c(gVar, (r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (Map) null, (j71.c) null, q0Var2, sVar, (i3 >> 3) & 14, i5 & 234881024, 262142);
            sVar2 = sVar;
            if (str == null) {
                sVar2.c0(-1691853625);
            } else {
                sVar2.c0(-1691853624);
                ub.b(str, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var, sVar, 0, i5 & 29360128, 131070);
                sVar2 = sVar;
            }
            sVar2.q(false);
            sVar2.q(true);
            wg.c.a(null, z, null, null, sVar2, ((i6 >> 18) & 112) | 3072, 5);
            sVar2.q(true);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new h(rVar, gVar, str, str2, str3, q0Var, q0Var2, z, cVar, d2Var, j, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r rVar, final String str, String str2, String str3, String str4, q0 q0Var, q0 q0Var2, final boolean z, final j71.c cVar, d2 d2Var, long j, s sVar, final int i, final int i2, final int i3) {
        r rVar2;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        String str7;
        q0 q0Var3;
        int i7;
        int i8;
        int i9;
        int i11;
        q0 q0Var4;
        r rVar3;
        String str8;
        final String str9;
        String str10;
        final q0 q0Var5;
        final d2 d2Var2;
        final long j2;
        b2 t;
        q0 q0Var6;
        d2 d2Var3;
        long j3;
        int i12;
        String str11;
        d2 d2Var4;
        int i13;
        k71.k.g(str, "text");
        k71.k.g(cVar, "onCheckedChange");
        sVar.e0(722315413);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            str5 = str2;
            i4 |= sVar.f(str5) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                str6 = str3;
                i4 |= sVar.f(str6) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    str7 = str4;
                    i4 |= sVar.f(str7) ? 16384 : 8192;
                    if ((i & 196608) == 0) {
                        i4 |= ((i3 & 32) == 0 && sVar.f(q0Var)) ? 131072 : 65536;
                    }
                    if ((i & 1572864) != 0) {
                        q0Var3 = q0Var2;
                        i4 |= ((i3 & 64) == 0 && sVar.f(q0Var3)) ? 1048576 : 524288;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if ((i & 12582912) == 0) {
                        i4 |= sVar.g(z) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= sVar.h(cVar) ? 67108864 : 33554432;
                    }
                    i7 = i3 & 512;
                    if (i7 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 = i7;
                        i4 |= sVar.f(d2Var) ? 536870912 : 268435456;
                        if ((i2 & 6) == 0) {
                            if ((i3 & 1024) == 0) {
                                i9 = i14;
                                if (sVar.e(j)) {
                                    i13 = 4;
                                    i11 = i2 | i13;
                                }
                            } else {
                                i9 = i14;
                            }
                            i13 = 2;
                            i11 = i2 | i13;
                        } else {
                            i9 = i14;
                            i11 = i2;
                        }
                        int i16 = i9;
                        if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                            sVar.X();
                            if ((i & 1) == 0 || sVar.A()) {
                                r rVar4 = i16 != 0 ? w1.o.a : rVar2;
                                if (i15 != 0) {
                                    str5 = null;
                                }
                                if (i5 != 0) {
                                    str6 = null;
                                }
                                String str12 = i6 == 0 ? str7 : null;
                                if ((i3 & 32) != 0) {
                                    q0Var6 = ih.d.f(sVar).q;
                                    i4 &= -458753;
                                } else {
                                    q0Var6 = q0Var;
                                }
                                if ((i3 & 64) != 0) {
                                    q0Var3 = ih.d.f(sVar).l;
                                    i4 = (-3670017) & i4;
                                }
                                if (i8 != 0) {
                                    float f = ih.a.n;
                                    d2Var3 = new f2(f, f, f, f);
                                } else {
                                    d2Var3 = d2Var;
                                }
                                if ((i3 & 1024) != 0) {
                                    j3 = ih.d.b(sVar).b;
                                    rVar3 = rVar4;
                                    i11 = 0;
                                } else {
                                    j3 = j;
                                    rVar3 = rVar4;
                                }
                                q0Var4 = q0Var3;
                                i12 = i4;
                                str8 = str5;
                                str10 = str12;
                                str11 = str6;
                                d2Var4 = d2Var3;
                            } else {
                                sVar.V();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                q0Var6 = q0Var;
                                if ((i3 & 1024) != 0) {
                                    i11 = 0;
                                }
                                q0Var4 = q0Var3;
                                rVar3 = rVar2;
                                i12 = i4;
                                str8 = str5;
                                str11 = str6;
                                str10 = str7;
                                d2Var4 = d2Var;
                                j3 = j;
                            }
                            sVar.r();
                            a(rVar3, new g3.g(str), str8, str11, str10, q0Var6, q0Var4, z, cVar, d2Var4, j3, sVar, i12 & 2147483534, i11 & 14);
                            str9 = str11;
                            q0Var5 = q0Var6;
                            d2Var2 = d2Var4;
                            j2 = j3;
                        } else {
                            sVar.V();
                            q0Var4 = q0Var3;
                            rVar3 = rVar2;
                            str8 = str5;
                            str9 = str6;
                            str10 = str7;
                            q0Var5 = q0Var;
                            d2Var2 = d2Var;
                            j2 = j;
                        }
                        t = sVar.t();
                        if (t != null) {
                            final r rVar5 = rVar3;
                            final String str13 = str8;
                            final String str14 = str10;
                            final q0 q0Var7 = q0Var4;
                            t.d = new j71.e() { // from class: eh.g
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int L = t.L(i | 1);
                                    int L2 = t.L(i2);
                                    i.b(rVar5, str, str13, str9, str14, q0Var5, q0Var7, z, cVar, d2Var2, j2, (s) obj, L, L2, i3);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i2 & 6) == 0) {
                    }
                    int i162 = i9;
                    if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                str7 = str4;
                if ((i & 196608) == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 6) == 0) {
                }
                int i1622 = i9;
                if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            str6 = str3;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str7 = str4;
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 6) == 0) {
            }
            int i16222 = i9;
            if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 3) != 2)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str5 = str2;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str6 = str3;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str7 = str4;
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 6) == 0) {
        }
        int i162222 = i9;
        if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 3) != 2)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }


    public Object d(Object p1, Object p2, Object p3) { return null; }
}
