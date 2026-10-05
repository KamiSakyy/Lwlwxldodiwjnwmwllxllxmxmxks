package rg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.utilities.j1;
import d2.a0;
import qg.p;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, float f, final long j, long j2, int i, int i2, final j71.a aVar, final j71.e eVar, j71.f fVar, boolean z, s sVar, final int i3, final int i4) {
        int i5;
        float f2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        final float f3;
        final long j4;
        final int i13;
        final int i14;
        final j71.f fVar2;
        final boolean z2;
        b2 t;
        r rVar2;
        long j5;
        int i15;
        int i16;
        int i17;
        j71.f fVar3;
        boolean z3;
        int i18;
        int i19;
        float f4;
        int i21;
        int i22;
        long j6;
        j71.f fVar4;
        boolean z4;
        boolean z5;
        int i23;
        int i24;
        int i25;
        s sVar2 = sVar;
        k71.k.g(aVar, "onNavigateUp");
        sVar2.e0(455209385);
        int i26 = i4 & 1;
        if (i26 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (sVar2.f(rVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            f2 = f;
            i5 |= sVar2.c(f2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= sVar2.e(j) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    j3 = j2;
                    if (sVar2.e(j3)) {
                        i25 = 2048;
                        i5 |= i25;
                    }
                } else {
                    j3 = j2;
                }
                i25 = 1024;
                i5 |= i25;
            } else {
                j3 = j2;
            }
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    i6 = i;
                    if (sVar2.d(i6)) {
                        i24 = 16384;
                        i5 |= i24;
                    }
                } else {
                    i6 = i;
                }
                i24 = 8192;
                i5 |= i24;
            } else {
                i6 = i;
            }
            if ((196608 & i3) != 0) {
                if ((i4 & 32) == 0) {
                    i7 = i2;
                    if (sVar2.d(i7)) {
                        i23 = 131072;
                        i5 |= i23;
                    }
                } else {
                    i7 = i2;
                }
                i23 = 65536;
                i5 |= i23;
            } else {
                i7 = i2;
            }
            if ((1572864 & i3) == 0) {
                i5 |= sVar2.h(aVar) ? 1048576 : 524288;
            }
            if ((i3 & 12582912) == 0) {
                i5 |= sVar2.h(eVar) ? 8388608 : 4194304;
            }
            i8 = i4 & 256;
            if (i8 == 0) {
                i5 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i9 = i8;
                i5 |= sVar2.h(fVar) ? 67108864 : 33554432;
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i12 = i11;
                    i5 |= sVar2.g(z) ? 536870912 : 268435456;
                    if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378)) {
                        sVar2.V();
                        f3 = f2;
                        j4 = j3;
                        i13 = i6;
                        i14 = i7;
                        fVar2 = fVar;
                        z2 = z;
                    } else {
                        sVar2.X();
                        if ((i3 & 1) == 0 || sVar2.A()) {
                            rVar2 = i26 != 0 ? o.a : rVar;
                            float f5 = i27 != 0 ? ih.a.f : f2;
                            if ((i4 & 8) != 0) {
                                j5 = ih.d.b(sVar2).A;
                                i5 &= -7169;
                            } else {
                                j5 = j3;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                                i15 = 2131231498;
                            } else {
                                i15 = i6;
                            }
                            if ((i4 & 32) != 0) {
                                i16 = (-458753) & i5;
                                i17 = 2131953802;
                            } else {
                                i16 = i5;
                                i17 = i7;
                            }
                            fVar3 = i9 != 0 ? b.a : fVar;
                            if (i12 != 0) {
                                i18 = i16;
                                i19 = i17;
                                f4 = f5;
                                i21 = i15;
                                z3 = true;
                            } else {
                                z3 = z;
                                i18 = i16;
                                i19 = i17;
                                f4 = f5;
                                i21 = i15;
                            }
                            j3 = j5;
                        } else {
                            sVar2.V();
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            rVar2 = rVar;
                            z3 = z;
                            i18 = i5;
                            f4 = f2;
                            i21 = i6;
                            i19 = i7;
                            fVar3 = fVar;
                        }
                        sVar2.r();
                        r f6 = f0.o.f(rVar2, j, a0.b);
                        e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
                        int hashCode = Long.hashCode(sVar2.T);
                        v1 l = sVar2.l();
                        r c = w1.a.c(sVar2, f6);
                        v2.h.o.getClass();
                        v2.f fVar5 = v2.g.b;
                        sVar2.g0();
                        rVar = rVar2;
                        if (sVar2.S) {
                            sVar2.k(fVar5);
                        } else {
                            sVar2.q0();
                        }
                        t.I(sVar2, v2.g.f, a);
                        t.I(sVar2, v2.g.e, l);
                        t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                        t.E(sVar2, v2.g.h);
                        t.I(sVar2, v2.g.d, c);
                        if (z3) {
                            sVar2.c0(-923942073);
                            i22 = 57344;
                            fVar4 = fVar3;
                            z4 = false;
                            z5 = true;
                            l.a(null, null, false, null, j3, false, sVar, ((i18 << 3) & 57344) | 384, 43);
                            j6 = j3;
                            sVar2 = sVar;
                        } else {
                            i22 = 57344;
                            j6 = j3;
                            fVar4 = fVar3;
                            z4 = false;
                            z5 = true;
                            sVar2.c0(-925938845);
                        }
                        sVar2.q(z4);
                        int i28 = i18 >> 3;
                        float f7 = f4;
                        int i29 = i21;
                        int i31 = i19;
                        p.b(null, j, aVar, i29, i31, f7, 0.0f, r1.i.d(-762068000, new j1(fVar4, 3), sVar2), eVar, sVar2, (i28 & i22) | (i28 & 112) | 12582912 | ((i18 >> 12) & 896) | (i28 & 7168) | (458752 & (i18 << 12)) | (234881024 & (i18 << 3)), 65);
                        sVar2.q(z5);
                        i13 = i29;
                        i14 = i31;
                        f3 = f7;
                        fVar2 = fVar4;
                        z2 = z3;
                        j4 = j6;
                    }
                    final r rVar3 = rVar;
                    t = sVar2.t();
                    if (t == null) {
                        t.d = new j71.e() { // from class: rg.h
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int L = t.L(i3 | 1);
                                j.a(rVar3, f3, j, j4, i13, i14, aVar, eVar, fVar2, z2, (s) obj, L, i4);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i12 = i11;
                if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378)) {
                }
                final r rVar32 = rVar;
                t = sVar2.t();
                if (t == null) {
                }
            }
            i9 = i8;
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378)) {
            }
            final r rVar322 = rVar;
            t = sVar2.t();
            if (t == null) {
            }
        }
        f2 = f;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) != 0) {
        }
        if ((196608 & i3) != 0) {
        }
        if ((1572864 & i3) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i8 = i4 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378)) {
        }
        final r rVar3222 = rVar;
        t = sVar2.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r rVar, final String str, final g3.g gVar, String str2, float f, final long j, long j2, final j71.a aVar, final r1.d dVar, boolean z, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        String str3;
        int i4;
        float f2;
        long j3;
        int i5;
        int i6;
        int i7;
        final r rVar3;
        final String str4;
        final float f3;
        final long j4;
        final boolean z2;
        b2 t;
        long j5;
        r rVar4;
        String str5;
        float f4;
        boolean z3;
        long j6;
        r rVar5;
        float f5;
        long j7;
        int i8;
        boolean z4;
        s sVar2 = sVar;
        k71.k.g(str, "title");
        k71.k.g(aVar, "onNavigateUp");
        sVar2.e0(-672726127);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(str) ? 32 : 16;
        }
        int i11 = i3 | (sVar2.f(gVar) ? 256 : 128);
        int i12 = i2 & 8;
        if (i12 != 0) {
            i4 = i11 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i11 | (sVar2.f(str3) ? 2048 : 1024);
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i4 |= sVar2.c(f2) ? 16384 : 8192;
            int i14 = i4 | (!sVar2.e(j) ? 131072 : 65536);
            if ((i2 & 64) != 0) {
                j3 = j2;
                if (sVar2.e(j3)) {
                    i5 = 1048576;
                    int i15 = i14 | i5;
                    if ((i & 12582912) == 0) {
                        i15 |= sVar2.h(aVar) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i6 = i15 | (sVar2.h(dVar) ? 67108864 : 33554432);
                    } else {
                        i6 = i15;
                    }
                    i7 = i6 | 805306368;
                    if (sVar2.S(i7 & 1, (i7 & 306783379) != 306783378)) {
                        sVar2.X();
                        if ((i & 1) == 0 || sVar2.A()) {
                            if (i9 != 0) {
                                rVar2 = o.a;
                            }
                            if (i12 != 0) {
                                str3 = null;
                            }
                            if (i13 != 0) {
                                f2 = ih.a.f;
                            }
                            if ((i2 & 64) != 0) {
                                j5 = ih.d.b(sVar2).A;
                                i7 &= -3670017;
                            } else {
                                j5 = j3;
                            }
                            rVar4 = rVar2;
                            str5 = str3;
                            f4 = f2;
                            z3 = true;
                            j6 = j5;
                        } else {
                            sVar2.V();
                            if ((i2 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            z3 = z;
                            rVar4 = rVar2;
                            str5 = str3;
                            f4 = f2;
                            j6 = j3;
                        }
                        sVar2.r();
                        r f6 = f0.o.f(rVar4, j, a0.b);
                        e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
                        int hashCode = Long.hashCode(sVar2.T);
                        v1 l = sVar2.l();
                        r c = w1.a.c(sVar2, f6);
                        v2.h.o.getClass();
                        v2.f fVar = v2.g.b;
                        sVar2.g0();
                        if (sVar2.S) {
                            sVar2.k(fVar);
                        } else {
                            sVar2.q0();
                        }
                        t.I(sVar2, v2.g.f, a);
                        t.I(sVar2, v2.g.e, l);
                        t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                        t.E(sVar2, v2.g.h);
                        t.I(sVar2, v2.g.d, c);
                        if (z3) {
                            sVar2.c0(-44024353);
                            rVar5 = rVar4;
                            f5 = f4;
                            i8 = i7;
                            z4 = false;
                            l.a(null, null, false, null, j6, false, sVar, ((i7 >> 6) & 57344) | 384, 43);
                            j7 = j6;
                            sVar2 = sVar;
                        } else {
                            rVar5 = rVar4;
                            f5 = f4;
                            j7 = j6;
                            i8 = i7;
                            z4 = false;
                            sVar2.c0(-47156965);
                        }
                        sVar2.q(z4);
                        float f7 = f5;
                        p.d(null, str, gVar, str5, j, aVar, 2131231498, f7, 0.0f, 0, 0, dVar, sVar2, (i8 & 8176) | ((i8 >> 3) & 57344) | (458752 & (i8 >> 6)) | ((i8 << 9) & 29360128), (i8 >> 21) & 112);
                        sVar2.q(true);
                        str4 = str5;
                        f3 = f7;
                        rVar3 = rVar5;
                        z2 = z3;
                        j4 = j7;
                    } else {
                        sVar2.V();
                        rVar3 = rVar2;
                        str4 = str3;
                        f3 = f2;
                        j4 = j3;
                        z2 = z;
                    }
                    t = sVar2.t();
                    if (t != null) {
                        t.d = new j71.e() { // from class: rg.i
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int L = t.L(i | 1);
                                j.b(rVar3, str, gVar, str4, f3, j, j4, aVar, dVar, z2, (s) obj, L, i2);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                j3 = j2;
            }
            i5 = 524288;
            int i152 = i14 | i5;
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i6 | 805306368;
            if (sVar2.S(i7 & 1, (i7 & 306783379) != 306783378)) {
            }
            t = sVar2.t();
            if (t != null) {
            }
        }
        f2 = f;
        int i142 = i4 | (!sVar2.e(j) ? 131072 : 65536);
        if ((i2 & 64) != 0) {
        }
        i5 = 524288;
        int i1522 = i142 | i5;
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i6 | 805306368;
        if (sVar2.S(i7 & 1, (i7 & 306783379) != 306783378)) {
        }
        t = sVar2.t();
        if (t != null) {
        }
    }
}
