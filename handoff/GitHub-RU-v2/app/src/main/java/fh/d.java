package fh;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.s;
import com.github.rudroid.feed.ui.h0;
import com.github.rudroid.starredreposandlists.t;
import com.github.rudroid.uitoolkit.text.q;
import com.github.rudroid.widget.p;
import d2.p0;
import f1.e8;
import f1.gb;
import f1.jb;
import f1.o5;
import f1.q6;
import g3.g0;
import l3.d0;
import l3.e0;
import l3.v;
import s0.l0;
import s0.m0;
import w1.o;
import w1.r;
import w2.g1;
import w2.i2;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final void a(int i, int i2, s sVar, j71.a aVar, r rVar, boolean z) {
        int i3;
        s sVar2;
        r rVar2;
        sVar.e0(638461);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (sVar.h(aVar) ? 256 : 128);
        }
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            Object obj = n.a;
            if (i5 != 0) {
                Object N = sVar.N();
                if (N == obj) {
                    N = new p(15);
                    sVar.n0(N);
                }
                aVar = (j71.a) N;
            }
            boolean z2 = (i3 & 896) == 256;
            Object N2 = sVar.N();
            if (z2 || N2 == obj) {
                N2 = new com.github.rudroid.uitoolkit.markdown.components.c(14, aVar);
                sVar.n0(N2);
            }
            r1.d d = r1.i.d(289269147, new t(z, 1), sVar);
            r rVar3 = o.a;
            sVar2 = sVar;
            e8.h((j71.a) N2, rVar3, false, (o5) null, (p0) null, d, sVar2, 1572912, 60);
            rVar2 = rVar3;
        } else {
            sVar2 = sVar;
            sVar2.V();
            rVar2 = rVar;
        }
        j71.a aVar2 = aVar;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new h0(rVar2, z, aVar2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r rVar, final String str, final String str2, j71.e eVar, j71.c cVar, j71.a aVar, j71.a aVar2, boolean z, gb gbVar, d2 d2Var, e0 e0Var, boolean z2, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        j71.e eVar2;
        int i4;
        j71.c cVar2;
        int i5;
        final j71.a aVar3;
        int i6;
        boolean z3;
        gb gbVar2;
        int i7;
        d2 d2Var2;
        int i8;
        int i9;
        final e0 e0Var2;
        final boolean z4;
        final boolean z5;
        final gb gbVar3;
        final r rVar3;
        final j71.e eVar3;
        final j71.c cVar3;
        final j71.a aVar4;
        final d2 d2Var3;
        b2 t;
        j71.c cVar4;
        j71.a aVar5;
        r rVar4;
        Object obj;
        int i11;
        boolean z6;
        int i12;
        gb gbVar4;
        d2 d2Var4;
        gb gbVar5;
        e0 e0Var3;
        j71.a aVar6;
        j71.e eVar4;
        boolean z7;
        int i13;
        boolean z8;
        j71.c cVar5;
        j71.a aVar7;
        r rVar5;
        boolean z9;
        j71.e eVar5;
        int i14;
        k71.k.g(str, "text");
        sVar.e0(-101952106);
        int i15 = i2 & 1;
        if (i15 != 0) {
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
            i3 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(str2) ? 256 : 128;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            eVar2 = eVar;
            i3 |= sVar.h(eVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                cVar2 = cVar;
                i3 |= sVar.h(cVar2) ? 16384 : 8192;
                int i17 = 196608 | i3;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i17 = 1769472 | i3;
                } else if ((1572864 & i) == 0) {
                    aVar3 = aVar2;
                    i17 |= sVar.h(aVar3) ? 1048576 : 524288;
                    if ((i & 12582912) == 0) {
                        i17 |= sVar.g(false) ? 8388608 : 4194304;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i17 |= 100663296;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i & 100663296) == 0) {
                            i17 |= sVar.g(z3) ? 67108864 : 33554432;
                        }
                    }
                    if ((i & 805306368) != 0) {
                        if ((i2 & 512) == 0) {
                            gbVar2 = gbVar;
                            if (sVar.f(gbVar2)) {
                                i14 = 536870912;
                                i17 |= i14;
                            }
                        } else {
                            gbVar2 = gbVar;
                        }
                        i14 = 268435456;
                        i17 |= i14;
                    } else {
                        gbVar2 = gbVar;
                    }
                    i7 = i17;
                    if ((i2 & 1024) != 0) {
                        d2Var2 = d2Var;
                        if (sVar.f(d2Var2)) {
                            i8 = 4;
                            i9 = i8 | 432;
                            if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i9 & 147) != 146)) {
                                sVar.X();
                                int i18 = i & 1;
                                Object obj2 = n.a;
                                if (i18 == 0 || sVar.A()) {
                                    r rVar6 = i15 != 0 ? o.a : rVar2;
                                    j71.e eVar6 = i16 != 0 ? null : eVar2;
                                    if (i4 != 0) {
                                        Object N = sVar.N();
                                        if (N == obj2) {
                                            N = new q6(9);
                                            sVar.n0(N);
                                        }
                                        cVar4 = (j71.c) N;
                                    } else {
                                        cVar4 = cVar2;
                                    }
                                    Object N2 = sVar.N();
                                    if (N2 == obj2) {
                                        N2 = new p(15);
                                        sVar.n0(N2);
                                    }
                                    j71.a aVar8 = (j71.a) N2;
                                    if (i5 != 0) {
                                        Object N3 = sVar.N();
                                        if (N3 == obj2) {
                                            N3 = new p(15);
                                            sVar.n0(N3);
                                        }
                                        aVar5 = (j71.a) N3;
                                    } else {
                                        aVar5 = aVar3;
                                    }
                                    boolean z11 = i6 != 0 ? true : z3;
                                    if ((i2 & 512) != 0) {
                                        i11 = i9;
                                        rVar4 = rVar6;
                                        obj = obj2;
                                        z6 = false;
                                        i12 = 432;
                                        gbVar4 = q.a(0L, 0L, d2.t.j, 0L, 0L, sVar, 100663680, 251);
                                        i7 &= -1879048193;
                                    } else {
                                        rVar4 = rVar6;
                                        obj = obj2;
                                        i11 = i9;
                                        z6 = false;
                                        i12 = 432;
                                        gbVar4 = gbVar2;
                                    }
                                    if ((i2 & 1024) != 0) {
                                        d2Var4 = jb.e(jb.a, 0.0f, 0.0f, 15);
                                    } else {
                                        d2Var4 = d2Var;
                                        i12 = i11;
                                    }
                                    gbVar5 = gbVar4;
                                    d2Var2 = d2Var4;
                                    e0Var3 = d0.r;
                                    aVar6 = aVar5;
                                    eVar4 = eVar6;
                                    z7 = z11;
                                    i13 = i12;
                                    z8 = true;
                                    cVar5 = cVar4;
                                    aVar7 = aVar8;
                                    rVar5 = rVar4;
                                } else {
                                    sVar.V();
                                    if ((i2 & 512) != 0) {
                                        i7 &= -1879048193;
                                    }
                                    aVar7 = aVar;
                                    if ((i2 & 1024) != 0) {
                                        obj = obj2;
                                        z7 = z3;
                                        gbVar5 = gbVar2;
                                        rVar5 = rVar2;
                                        aVar6 = aVar3;
                                        eVar4 = eVar2;
                                        cVar5 = cVar2;
                                        i13 = 432;
                                        z6 = false;
                                        e0Var3 = e0Var;
                                    } else {
                                        obj = obj2;
                                        z7 = z3;
                                        rVar5 = rVar2;
                                        aVar6 = aVar3;
                                        eVar4 = eVar2;
                                        i13 = i9;
                                        cVar5 = cVar2;
                                        z6 = false;
                                        e0Var3 = e0Var;
                                        gbVar5 = gbVar2;
                                    }
                                    z8 = z2;
                                }
                                sVar.r();
                                Object N4 = sVar.N();
                                if (N4 == obj) {
                                    int length = str.length();
                                    z9 = z8;
                                    eVar5 = eVar4;
                                    N4 = androidx.compose.runtime.t.B(new v(4, g0.b(length, length), str));
                                    sVar.n0(N4);
                                } else {
                                    z9 = z8;
                                    eVar5 = eVar4;
                                }
                                f1 f1Var = (f1) N4;
                                r rVar7 = rVar5;
                                v b = v.b((v) f1Var.getValue(), str, 0L, 6);
                                boolean z12 = (i7 & 57344) == 16384;
                                Object N5 = sVar.N();
                                if (z12 || N5 == obj) {
                                    N5 = new com.github.rudroid.copilot.ui.f(cVar5, f1Var, 11);
                                    sVar.n0(N5);
                                }
                                j71.e eVar7 = eVar5;
                                j71.c cVar6 = cVar5;
                                d2 d2Var5 = d2Var2;
                                boolean z13 = z9;
                                c(rVar7, b, str2, eVar7, (j71.c) N5, aVar7, aVar6, z6, z7, gbVar5, d2Var5, e0Var3, z13, sVar, i7 & 2147426190, i13 & 1022, 0);
                                rVar3 = rVar7;
                                eVar3 = eVar7;
                                aVar4 = aVar7;
                                aVar3 = aVar6;
                                z5 = z7;
                                gbVar3 = gbVar5;
                                d2Var3 = d2Var5;
                                e0Var2 = e0Var3;
                                z4 = z13;
                                cVar3 = cVar6;
                            } else {
                                sVar.V();
                                e0Var2 = e0Var;
                                z4 = z2;
                                z5 = z3;
                                gbVar3 = gbVar2;
                                rVar3 = rVar2;
                                eVar3 = eVar2;
                                cVar3 = cVar2;
                                aVar4 = aVar;
                                d2Var3 = d2Var;
                            }
                            t = sVar.t();
                            if (t != null) {
                                t.d = new j71.e() { // from class: fh.b
                                    public final Object s(Object obj3, Object obj4) {
                                        ((Integer) obj4).getClass();
                                        int L = androidx.compose.runtime.t.L(i | 1);
                                        d.b(rVar3, str, str2, eVar3, cVar3, aVar4, aVar3, z5, gbVar3, d2Var3, e0Var2, z4, (s) obj3, L, i2);
                                        return a0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        d2Var2 = d2Var;
                    }
                    i8 = 2;
                    i9 = i8 | 432;
                    if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i9 & 147) != 146)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                aVar3 = aVar2;
                if ((i & 12582912) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i & 805306368) != 0) {
                }
                i7 = i17;
                if ((i2 & 1024) != 0) {
                }
                i8 = 2;
                i9 = i8 | 432;
                if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i9 & 147) != 146)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            cVar2 = cVar;
            int i172 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            aVar3 = aVar2;
            if ((i & 12582912) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i & 805306368) != 0) {
            }
            i7 = i172;
            if ((i2 & 1024) != 0) {
            }
            i8 = 2;
            i9 = i8 | 432;
            if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i9 & 147) != 146)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        eVar2 = eVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        cVar2 = cVar;
        int i1722 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        aVar3 = aVar2;
        if ((i & 12582912) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i7 = i1722;
        if ((i2 & 1024) != 0) {
        }
        i8 = 2;
        i9 = i8 | 432;
        if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i9 & 147) != 146)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(r rVar, final v vVar, final String str, j71.e eVar, final j71.c cVar, final j71.a aVar, final j71.a aVar2, final boolean z, final boolean z2, gb gbVar, final d2 d2Var, final e0 e0Var, final boolean z3, s sVar, final int i, final int i2, final int i3) {
        int i4;
        j71.e eVar2;
        gb gbVar2;
        int i5;
        int i6;
        int i7;
        final r rVar2;
        final gb gbVar3;
        b2 t;
        int i8;
        int i9;
        gb gbVar4;
        gb gbVar5;
        r rVar3;
        int i11;
        k71.k.g(vVar, "value");
        sVar.e0(2000410281);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar.f(vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar.f(str) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            eVar2 = eVar;
            i4 |= sVar.h(eVar2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i4 |= sVar.h(cVar) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                i4 |= sVar.h(aVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i4 |= sVar.h(aVar2) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i4 |= sVar.g(z) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i4 |= sVar.g(z2) ? 67108864 : 33554432;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    gbVar2 = gbVar;
                    if (sVar.f(gbVar2)) {
                        i11 = 536870912;
                        i4 |= i11;
                    }
                } else {
                    gbVar2 = gbVar;
                }
                i11 = 268435456;
                i4 |= i11;
            } else {
                gbVar2 = gbVar;
            }
            i5 = i4;
            if ((i2 & 6) != 0) {
                i6 = i2 | (sVar.f(d2Var) ? 4 : 2);
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                i6 |= sVar.f(e0Var) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i6 |= sVar.g(z3) ? 256 : 128;
            }
            i7 = i6;
            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 147) != 146)) {
                sVar.V();
                rVar2 = rVar;
                gbVar3 = gbVar2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    r rVar4 = i12 != 0 ? o.a : rVar;
                    j71.e eVar3 = i13 != 0 ? null : eVar2;
                    if ((i3 & 512) != 0) {
                        i8 = i7;
                        i9 = 0;
                        gbVar4 = q.a(0L, 0L, d2.t.j, 0L, 0L, sVar, 100663680, 251);
                        i5 &= -1879048193;
                    } else {
                        i8 = i7;
                        i9 = 0;
                        gbVar4 = gbVar2;
                    }
                    gbVar5 = gbVar4;
                    eVar2 = eVar3;
                    rVar3 = rVar4;
                } else {
                    sVar.V();
                    if ((i3 & 512) != 0) {
                        i5 &= -1879048193;
                    }
                    i8 = i7;
                    gbVar5 = gbVar2;
                    i9 = 0;
                    rVar3 = rVar;
                }
                sVar.r();
                Object N = sVar.N();
                androidx.compose.runtime.i iVar = n.a;
                Object obj = N;
                if (N == iVar) {
                    p1 B = androidx.compose.runtime.t.B(Boolean.FALSE);
                    sVar.n0(B);
                    obj = B;
                }
                f1 f1Var = (f1) obj;
                i2 i2Var = (i2) sVar.j(g1.p);
                r e = p2.e(rVar3, 1.0f);
                Object N2 = sVar.N();
                Object obj2 = N2;
                if (N2 == iVar) {
                    ab.e eVar4 = new ab.e(f1Var, 17);
                    sVar.n0(eVar4);
                    obj2 = eVar4;
                }
                r t2 = b2.d.t(e, (j71.c) obj2);
                m0 m0Var = m0.e;
                m0 a = m0.a(i9, 3, 117, Boolean.valueOf(z3));
                if ((i5 & 458752) == 131072) {
                    i9 = 1;
                }
                int i14 = i9 | (sVar.f(i2Var) ? 1 : 0);
                Object N3 = sVar.N();
                Object obj3 = N3;
                if (i14 != 0 || N3 == iVar) {
                    fg.d dVar = new fg.d(1, aVar, i2Var);
                    sVar.n0(dVar);
                    obj3 = dVar;
                }
                com.github.rudroid.uitoolkit.text.g0.b(t2, vVar, a, cVar, null, str, null, r1.i.d(-738394230, new com.github.rudroid.actions.checkssummary.ui.p(vVar, z, aVar2, 14), sVar), eVar2, gbVar5, 0, 1, true, z2, false, null, new l0((j71.c) null, (j71.c) obj3, (j71.c) null, 47), d2Var, null, null, e0Var, 0.0f, sVar, ((i5 >> 3) & 7168) | (i5 & 112) | 12582912 | (458752 & (i5 << 9)) | ((i5 << 15) & 234881024) | (i5 & 1879048192), ((i5 >> 15) & 7168) | 432 | ((i8 << 21) & 29360128), (i8 >> 3) & 14, 2933840);
                gbVar3 = gbVar5;
                rVar2 = rVar3;
            }
            final j71.e eVar5 = eVar2;
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: fh.c
                    public final Object s(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        int L = androidx.compose.runtime.t.L(i | 1);
                        int L2 = androidx.compose.runtime.t.L(i2);
                        d.c(rVar2, vVar, str, eVar5, cVar, aVar, aVar2, z, z2, gbVar3, d2Var, e0Var, z3, (s) obj4, L, L2, i3);
                        return a0.a;
                    }
                };
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i5 = i4;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i7 = i6;
        if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 147) != 146)) {
        }
        final j71.e eVar52 = eVar2;
        t = sVar.t();
        if (t == null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e0<T1,T2,T3,T4> {
        public e0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class gb<T1,T2,T3,T4> {
        public gb() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v<T1,T2,T3,T4> {
        public v() {
        }
    }
}
