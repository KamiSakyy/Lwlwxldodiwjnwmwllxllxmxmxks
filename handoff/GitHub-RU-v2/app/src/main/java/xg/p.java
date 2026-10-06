package xg;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.adapters.viewholders.d2;
import com.github.rudroid.uitoolkit.d1;
import f1.gb;
import s0.m0;
import w61.a0;
import wy0.p4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, boolean z, boolean z2, boolean z3, String str2, String str3, int i, int i2, j71.f fVar, j71.f fVar2, gb gbVar, j71.e eVar, j71.cShadow cVar, j71.a aVar, final j71.a aVar2, final j71.a aVar3, m0 m0Var, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5) {
        w1.r rVar2;
        int i6;
        boolean z4;
        int i7;
        int i8;
        final String str4;
        int i9;
        String str5;
        int i11;
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
        int i23;
        int i24;
        int i25;
        m0 m0Var2;
        final boolean z5;
        final boolean z6;
        final gb gbVar2;
        final j71.e eVar2;
        final j71.a aVar4;
        final m0 m0Var3;
        final w1.r rVar3;
        final boolean z7;
        final String str6;
        final int i26;
        final int i27;
        final j71.f fVar3;
        final j71.f fVar4;
        final j71.cShadow cVar2;
        b2 t;
        int i28;
        int i29;
        int i31;
        androidx.compose.runtime.s sVar2;
        gb gbVar3;
        j71.cShadow cVar3;
        j71.a aVar5;
        w1.r rVar4;
        int i32;
        gb gbVar4;
        j71.a aVar6;
        j71.cShadow cVar4;
        boolean z8;
        int i33;
        boolean z9;
        j71.f fVar5;
        j71.f fVar6;
        m0 m0Var4;
        j71.e eVar3;
        boolean z11;
        int i34;
        int i35;
        int i36;
        k71.k.g(str, "currentText");
        sVar.e0(1989817272);
        int i37 = i5 & 1;
        if (i37 != 0) {
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
            i6 |= sVar.f(str) ? 32 : 16;
        }
        int i38 = i6 | 384;
        int i39 = i5 & 8;
        if (i39 != 0) {
            i38 = i6 | 3456;
        } else if ((i3 & 3072) == 0) {
            z4 = z2;
            i38 |= sVar.g(z4) ? 2048 : 1024;
            i7 = i5 & 16;
            if (i7 == 0) {
                i38 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i38 |= sVar.g(z3) ? 16384 : 8192;
                i8 = i5 & 32;
                if (i8 != 0) {
                    i38 |= 196608;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i3 & 196608) == 0) {
                        i38 |= sVar.f(str4) ? 131072 : 65536;
                    }
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i38 |= 1572864;
                    str5 = str3;
                } else {
                    str5 = str3;
                    if ((i3 & 1572864) == 0) {
                        i38 |= sVar.f(str5) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 12582912) == 0) {
                    if ((i5 & 128) == 0) {
                        i11 = i;
                        if (sVar.d(i11)) {
                            i36 = 8388608;
                            i38 |= i36;
                        }
                    } else {
                        i11 = i;
                    }
                    i36 = 4194304;
                    i38 |= i36;
                } else {
                    i11 = i;
                }
                if ((i3 & 100663296) == 0) {
                    if ((i5 & 256) == 0) {
                        i12 = i2;
                        if (sVar.d(i12)) {
                            i35 = 67108864;
                            i38 |= i35;
                        }
                    } else {
                        i12 = i2;
                    }
                    i35 = 33554432;
                    i38 |= i35;
                } else {
                    i12 = i2;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i38 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i38 |= sVar.h(fVar) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i16 = i4 | 6;
                    i15 = i14;
                } else if ((i4 & 6) == 0) {
                    i15 = i14;
                    i16 = i4 | (sVar.h(fVar2) ? 4 : 2);
                } else {
                    i15 = i14;
                    i16 = i4;
                }
                if ((i4 & 48) == 0) {
                    if ((i5 & 2048) == 0 && sVar.f(gbVar)) {
                        i34 = 32;
                        i16 |= i34;
                    }
                    i34 = 16;
                    i16 |= i34;
                }
                int i41 = i16;
                i17 = i5 & 4096;
                if (i17 != 0) {
                    i18 = i41 | 384;
                } else {
                    int i42 = i41;
                    if ((i4 & 384) == 0) {
                        i42 |= sVar.h(eVar) ? 256 : 128;
                    }
                    i18 = i42;
                }
                i19 = i5 & 8192;
                if (i19 != 0) {
                    i21 = i18 | 3072;
                } else {
                    int i43 = i18;
                    if ((i4 & 3072) == 0) {
                        i43 |= sVar.h(cVar) ? 2048 : 1024;
                    }
                    i21 = i43;
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                    i23 = i21 | 24576;
                } else {
                    i23 = i21;
                    if ((i4 & 24576) == 0) {
                        i23 |= sVar.h(aVar) ? 16384 : 8192;
                        if ((i4 & 196608) != 0) {
                            i24 = i22;
                            i23 |= sVar.h(aVar2) ? 131072 : 65536;
                        } else {
                            i24 = i22;
                        }
                        if ((i4 & 1572864) == 0) {
                            i23 |= sVar.h(aVar3) ? 1048576 : 524288;
                        }
                        i25 = i5 & 131072;
                        if (i25 == 0) {
                            i23 |= 12582912;
                            m0Var2 = m0Var;
                        } else {
                            m0Var2 = m0Var;
                            if ((i4 & 12582912) == 0) {
                                i23 |= sVar.f(m0Var2) ? 8388608 : 4194304;
                            }
                        }
                        if (sVar.S(i38 & 1, (i38 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                            sVar.V();
                            z5 = z;
                            z6 = z3;
                            gbVar2 = gbVar;
                            eVar2 = eVar;
                            aVar4 = aVar;
                            m0Var3 = m0Var;
                            rVar3 = rVar2;
                            z7 = z4;
                            str6 = str5;
                            i26 = i11;
                            i27 = i12;
                            fVar3 = fVar;
                            fVar4 = fVar2;
                            cVar2 = cVar;
                        } else {
                            sVar.X();
                            if ((i3 & 1) == 0 || sVar.A()) {
                                w1.r rVar5 = i37 != 0 ? w1.o.a : rVar2;
                                boolean z12 = i39 != 0 ? true : z4;
                                boolean z13 = i7 == 0 ? z3 : false;
                                String str7 = i8 != 0 ? "" : str4;
                                String str8 = i9 != 0 ? "" : str5;
                                if ((i5 & 128) != 0) {
                                    i38 &= -29360129;
                                    i28 = 2131951855;
                                } else {
                                    i28 = i11;
                                }
                                if ((i5 & 256) != 0) {
                                    i29 = (-234881025) & i38;
                                    i31 = 2131951840;
                                } else {
                                    i29 = i38;
                                    i31 = i12;
                                }
                                j71.f fVar7 = i13 != 0 ? f.a : fVar;
                                j71.f fVar8 = i15 != 0 ? f.b : fVar2;
                                if ((i5 & 2048) != 0) {
                                    gbVar3 = com.github.rudroid.uitoolkit.text.q.a(d2.t.j, 0L, ih.d.b(sVar).p, 0L, 0L, sVar, 100663302, 250);
                                    sVar2 = sVar;
                                    i23 &= -113;
                                } else {
                                    sVar2 = sVar;
                                    gbVar3 = gbVar;
                                }
                                j71.e eVar4 = i17 != 0 ? f.c : eVar;
                                Object obj = androidx.compose.runtime.n.a;
                                if (i19 != 0) {
                                    Object N = sVar2.N();
                                    if (N == obj) {
                                        N = new p4(26);
                                        sVar2.n0(N);
                                    }
                                    cVar3 = (j71.c) N;
                                } else {
                                    cVar3 = cVar;
                                }
                                if (i24 != 0) {
                                    Object N2 = sVar2.N();
                                    if (N2 == obj) {
                                        N2 = new com.github.rudroid.widget.p(15);
                                        sVar2.n0(N2);
                                    }
                                    aVar5 = (j71.a) N2;
                                } else {
                                    aVar5 = aVar;
                                }
                                if (i25 != 0) {
                                    gbVar4 = gbVar3;
                                    m0Var4 = m0.e;
                                    rVar4 = rVar5;
                                    i32 = i31;
                                    aVar6 = aVar5;
                                    cVar4 = cVar3;
                                    str4 = str7;
                                    str6 = str8;
                                    z8 = z13;
                                    i33 = i28;
                                    z9 = z12;
                                    fVar5 = fVar7;
                                    fVar6 = fVar8;
                                } else {
                                    rVar4 = rVar5;
                                    i32 = i31;
                                    gbVar4 = gbVar3;
                                    aVar6 = aVar5;
                                    cVar4 = cVar3;
                                    str4 = str7;
                                    str6 = str8;
                                    z8 = z13;
                                    i33 = i28;
                                    z9 = z12;
                                    fVar5 = fVar7;
                                    fVar6 = fVar8;
                                    m0Var4 = m0Var;
                                }
                                eVar3 = eVar4;
                                z11 = true;
                            } else {
                                sVar.V();
                                if ((i5 & 128) != 0) {
                                    i38 &= -29360129;
                                }
                                if ((i5 & 256) != 0) {
                                    i38 &= -234881025;
                                }
                                if ((i5 & 2048) != 0) {
                                    i23 &= -113;
                                }
                                fVar5 = fVar;
                                eVar3 = eVar;
                                cVar4 = cVar;
                                aVar6 = aVar;
                                m0Var4 = m0Var2;
                                rVar4 = rVar2;
                                i29 = i38;
                                str6 = str5;
                                i32 = i12;
                                z11 = z;
                                fVar6 = fVar2;
                                z9 = z4;
                                i33 = i11;
                                z8 = z3;
                                gbVar4 = gbVar;
                            }
                            sVar.r();
                            w1.r rVar6 = rVar4;
                            j71.a aVar7 = aVar6;
                            t.a(rVar6, aVar7, r1.i.d(-362829723, new m(fVar5, str, m0Var4, cVar4, z11, str4, str6, gbVar4, fVar6, z9, z8, aVar2, aVar3, i33, i32, eVar3, 0), sVar), sVar, (i29 & 14) | 384 | ((i23 >> 9) & 112), 0);
                            m0Var3 = m0Var4;
                            z5 = z11;
                            gbVar2 = gbVar4;
                            z6 = z8;
                            i26 = i33;
                            eVar2 = eVar3;
                            cVar2 = cVar4;
                            fVar4 = fVar6;
                            z7 = z9;
                            i27 = i32;
                            fVar3 = fVar5;
                            aVar4 = aVar7;
                            rVar3 = rVar6;
                        }
                        t = sVar.t();
                        if (t == null) {
                            t.d = new j71.e() { // from class: xg.n
                                public final Object s(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int L = androidx.compose.runtime.t.L(i3 | 1);
                                    int L2 = androidx.compose.runtime.t.L(i4);
                                    p.a(rVar3, str, z5, z7, z6, str4, str6, i26, i27, fVar3, fVar4, gbVar2, eVar2, cVar2, aVar4, aVar2, aVar3, m0Var3, (androidx.compose.runtime.s) obj2, L, L2, i5);
                                    return a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                if ((i4 & 196608) != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i25 = i5 & 131072;
                if (i25 == 0) {
                }
                if (sVar.S(i38 & 1, (i38 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i412 = i16;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            if ((i4 & 196608) != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i25 = i5 & 131072;
            if (i25 == 0) {
            }
            if (sVar.S(i38 & 1, (i38 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        z4 = z2;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i4122 = i16;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        if ((i4 & 196608) != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i25 = i5 & 131072;
        if (i25 == 0) {
        }
        if (sVar.S(i38 & 1, (i38 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(w1.r rVar, boolean z, boolean z2, j71.a aVar, j71.a aVar2, int i, int i2, androidx.compose.runtime.s sVar, int i3) {
        w1.r rVar2;
        sVar.e0(-1053368);
        int i4 = i3 | 6 | (sVar.g(z) ? 32 : 16) | (sVar.g(z2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar2) ? 16384 : 8192) | (sVar.d(i) ? 131072 : 65536) | (sVar.d(i2) ? 1048576 : 524288);
        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
            rVar2 = w1.o.a;
            w1.r e = p2.e(rVar2, 1.0f);
            float f = ih.a.l;
            w1.r f2 = androidx.compose.foundation.layout.b.A(e, f, ih.a.k, ih.a.m, f).f(rVar2);
            l2 a = j2.a(androidx.compose.foundation.layout.l.b, w1.c.B, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, f2);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            s sVar2 = s.r;
            n2 n2Var = n2.a;
            sVar2.k(n2Var);
            androidx.compose.foundation.layout.b.g(sVar, n2Var.a(rVar2, 1.0f, true));
            d1.a(null, aVar2, false, false, r1.i.d(-1833082191, new d2(i2, 13), sVar), sVar, ((i4 >> 9) & 112) | 24576, 13);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = androidx.compose.runtime.t.B(new s3.l(0L));
                sVar.n0(N);
            }
            d1.a(null, aVar, z, false, r1.i.d(-1823311630, new o(z2, (f1) N, i), sVar), sVar, ((i4 >> 6) & 112) | 24576 | ((i4 << 3) & 896), 9);
            sVar.q(true);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.uitoolkit.d(rVar2, z, z2, aVar, aVar2, i, i2, i3);
        }
    }
}
