package com.github.rudroid.uitoolkit;

import f1.qa;
import f1.ub;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.r rVar, w1.r rVar2, final g3.g gVar, Map map, float f, final g3.q0 q0Var, d2.p0 p0Var, final long j, long j2, float f2, com.github.rudroid.uitoolkit.text.l lVar, long j3, final String str, androidx.compose.runtime.s sVar, final int i, final int i2) {
        Map map2;
        int i3;
        int i4;
        int i5;
        float f3;
        final w1.r rVar3;
        final d2.p0 p0Var2;
        final com.github.rudroid.uitoolkit.text.l lVar2;
        final Map map3;
        final long j4;
        final float f4;
        final float f5;
        final long j5;
        androidx.compose.runtime.b2 t;
        Map map4;
        int i6;
        Map map5;
        int i7;
        long j6;
        com.github.rudroid.uitoolkit.text.l lVar3;
        w1.r rVar4;
        d2.p0 p0Var3;
        float f6;
        float f7;
        long j7;
        sVar.e0(1469529793);
        int i8 = i | (sVar.f(rVar) ? 4 : 2) | 48 | (sVar.f(gVar) ? 256 : 128);
        if ((i2 & 8) == 0) {
            map2 = map;
            if (sVar.h(map2)) {
                i3 = 2048;
                long j8 = j2;
                i4 = i8 | i3 | 24576 | (!sVar.f(q0Var) ? 131072 : 65536) | 524288 | (!sVar.e(j) ? 8388608 : 4194304) | (((i2 & 256) == 0 || !sVar.e(j8)) ? 33554432 : 67108864);
                i5 = i2 & 512;
                if (i5 == 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    f3 = f2;
                    i4 |= sVar.c(f3) ? 536870912 : 268435456;
                    if (sVar.S(i4 & 1, (306783379 & i4) == 306783378 || (((sVar.f(str) ? (char) 256 : (char) 128) | 18) & 147) != 146)) {
                        sVar.X();
                        if ((i & 1) == 0 || sVar.A()) {
                            if ((i2 & 8) != 0) {
                                map4 = new LinkedHashMap();
                                i4 &= -7169;
                            } else {
                                map4 = map2;
                            }
                            float f8 = ih.a.e;
                            d2.p0 p0Var4 = ih.d.e(sVar).f;
                            int i9 = i4 & (-3670017);
                            if ((i2 & 256) != 0) {
                                j8 = d(j, ih.d.b(sVar).p);
                                i6 = i4 & (-238551041);
                            } else {
                                i6 = i9;
                            }
                            if (i5 != 0) {
                                f3 = 1;
                            }
                            com.github.rudroid.uitoolkit.text.o b = com.github.rudroid.uitoolkit.text.m.b(null, null, null, 15);
                            map5 = map4;
                            i7 = i6;
                            j6 = ((d2.t) sVar.j(f1.g2.a)).a;
                            lVar3 = b;
                            rVar4 = w1.o.a;
                            p0Var3 = p0Var4;
                            f6 = f8;
                            f7 = f3;
                            j7 = j8;
                        } else {
                            sVar.V();
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                            }
                            int i11 = i4 & (-3670017);
                            if ((i2 & 256) != 0) {
                                i11 = i4 & (-238551041);
                            }
                            rVar4 = rVar2;
                            f6 = f;
                            lVar3 = lVar;
                            j6 = j3;
                            i7 = i11;
                            map5 = map2;
                            p0Var3 = p0Var;
                            j7 = j8;
                            f7 = f3;
                        }
                        sVar.r();
                        qa.a(rVar4, p0Var3, j, 0L, 0.0f, f6, f0.o.a(f7, j7), r1.i.d(-414706618, new com.github.rudroid.achievements.ui.j0(str, gVar, rVar, lVar3, j6, map5, q0Var), sVar), sVar, ((i7 >> 15) & 896) | 12779526, 24);
                        rVar3 = rVar4;
                        f5 = f6;
                        j4 = j7;
                        f4 = f7;
                        lVar2 = lVar3;
                        j5 = j6;
                        map3 = map5;
                        p0Var2 = p0Var3;
                    } else {
                        sVar.V();
                        rVar3 = rVar2;
                        p0Var2 = p0Var;
                        lVar2 = lVar;
                        map3 = map2;
                        j4 = j8;
                        f4 = f3;
                        f5 = f;
                        j5 = j3;
                    }
                    t = sVar.t();
                    if (t != null) {
                        t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.f
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int L = androidx.compose.runtime.t.L(i | 1);
                                j.a(rVar, rVar3, gVar, map3, f5, q0Var, p0Var2, j, j4, f4, lVar2, j5, str, (androidx.compose.runtime.s) obj, L, i2);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                f3 = f2;
                if (sVar.S(i4 & 1, (306783379 & i4) == 306783378 || (((sVar.f(str) ? (char) 256 : (char) 128) | 18) & 147) != 146)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
        } else {
            map2 = map;
        }
        i3 = 1024;
        long j82 = j2;
        i4 = i8 | i3 | 24576 | (!sVar.f(q0Var) ? 131072 : 65536) | 524288 | (!sVar.e(j) ? 8388608 : 4194304) | (((i2 & 256) == 0 || !sVar.e(j82)) ? 33554432 : 67108864);
        i5 = i2 & 512;
        if (i5 == 0) {
        }
        f3 = f2;
        if (sVar.S(i4 & 1, (306783379 & i4) == 306783378 || (((sVar.f(str) ? (char) 256 : (char) 128) | 18) & 147) != 146)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final w1.r rVar, w1.r rVar2, final String str, float f, g3.q0 q0Var, d2.p0 p0Var, int i, long j, long j2, float f2, com.github.rudroid.uitoolkit.text.l lVar, long j3, final String str2, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        g3.q0 q0Var2;
        int i7;
        int i8;
        final long j4;
        long j5;
        int i9;
        int i11;
        int i12;
        final w1.r rVar3;
        final d2.p0 p0Var2;
        final long j6;
        final int i13;
        final g3.q0 q0Var3;
        final long j7;
        final float f3;
        final float f4;
        final com.github.rudroid.uitoolkit.text.l lVar2;
        androidx.compose.runtime.b2 t;
        w1.r rVar4;
        int i14;
        d2.p0 p0Var3;
        long j8;
        float f5;
        float f6;
        com.github.rudroid.uitoolkit.text.l lVar3;
        int i15;
        long j9;
        long j11;
        int i16;
        int i17;
        int i18;
        k71.k.g(str, "text");
        sVar.e0(429617938);
        if ((i2 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= sVar.f(rVar2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i5 |= sVar.f(str) ? 256 : 128;
            }
            i6 = i5 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i18 = 16384;
                        i6 |= i18;
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i18 = 8192;
                i6 |= i18;
            } else {
                q0Var2 = q0Var;
            }
            if ((i2 & 196608) == 0) {
                i6 |= ((i4 & 32) == 0 && sVar.f(p0Var)) ? 131072 : 65536;
            }
            i7 = i4 & 64;
            if (i7 == 0) {
                i6 |= 1572864;
                i8 = i;
            } else {
                i8 = i;
                if ((i2 & 1572864) == 0) {
                    i6 |= sVar.d(i8) ? 1048576 : 524288;
                }
            }
            if ((i2 & 12582912) != 0) {
                j4 = j;
                i6 |= ((i4 & 128) == 0 && sVar.e(j4)) ? 8388608 : 4194304;
            } else {
                j4 = j;
            }
            if ((i2 & 100663296) != 0) {
                j5 = j2;
                i6 |= ((i4 & 256) == 0 && sVar.e(j5)) ? 67108864 : 33554432;
            } else {
                j5 = j2;
            }
            i9 = i4 & 512;
            if (i9 == 0) {
                i6 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i6 |= sVar.c(f2) ? 536870912 : 268435456;
            }
            if ((i3 & 6) != 0) {
                if ((i4 & 1024) == 0) {
                    if ((i3 & 8) == 0 ? sVar.f(lVar) : sVar.h(lVar)) {
                        i17 = 4;
                        i11 = i3 | i17;
                    }
                }
                i17 = 2;
                i11 = i3 | i17;
            } else {
                i11 = i3;
            }
            if ((i3 & 48) != 0) {
                int i21 = i11;
                if ((i4 & 2048) == 0 && sVar.e(j3)) {
                    i16 = 32;
                    i12 = i21 | i16;
                }
                i16 = 16;
                i12 = i21 | i16;
            } else {
                i12 = i11;
            }
            if ((i3 & 384) == 0) {
                i12 |= sVar.f(str2) ? 256 : 128;
            }
            if (sVar.S(i6 & 1, (i6 & 306783379) == 306783378 || (i12 & 147) != 146)) {
                sVar.V();
                rVar3 = rVar2;
                p0Var2 = p0Var;
                j6 = j3;
                i13 = i8;
                q0Var3 = q0Var2;
                j7 = j5;
                f3 = f;
                f4 = f2;
                lVar2 = lVar;
            } else {
                sVar.X();
                if ((i2 & 1) == 0 || sVar.A()) {
                    rVar4 = i19 != 0 ? w1.o.a : rVar2;
                    float f7 = ih.a.e;
                    if ((i4 & 16) != 0) {
                        q0Var2 = (g3.q0) sVar.j(ub.a);
                        i6 &= -57345;
                    }
                    if ((i4 & 32) != 0) {
                        i14 = -234881025;
                        p0Var3 = ih.d.e(sVar).f;
                        i6 &= -458753;
                    } else {
                        i14 = -234881025;
                        p0Var3 = p0Var;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if ((i4 & 128) != 0) {
                        j4 = ih.d.b(sVar).b;
                        i6 &= -29360129;
                    }
                    if ((i4 & 256) != 0) {
                        j5 = d(j4, ih.d.b(sVar).p);
                        i6 &= i14;
                    }
                    float f8 = i9 != 0 ? 1 : f2;
                    com.github.rudroid.uitoolkit.text.l b = (i4 & 1024) != 0 ? com.github.rudroid.uitoolkit.text.m.b(null, null, null, 15) : lVar;
                    if ((i4 & 2048) != 0) {
                        j8 = ((d2.t) sVar.j(f1.g2.a)).a;
                        f5 = f7;
                        rVar4 = rVar4;
                        p0Var3 = p0Var3;
                    } else {
                        j8 = j3;
                        f5 = f7;
                    }
                    f6 = f8;
                    long j12 = j4;
                    lVar3 = b;
                    i15 = i6;
                    j9 = j12;
                    j11 = j5;
                } else {
                    sVar.V();
                    if ((i4 & 16) != 0) {
                        i6 &= -57345;
                    }
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                    }
                    if ((i4 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    if ((i4 & 256) != 0) {
                        i6 &= -234881025;
                    }
                    rVar4 = rVar2;
                    f5 = f;
                    p0Var3 = p0Var;
                    j8 = j3;
                    j9 = j4;
                    lVar3 = lVar;
                    i15 = i6;
                    j11 = j5;
                    f6 = f2;
                }
                sVar.r();
                com.github.rudroid.uitoolkit.text.l lVar4 = lVar3;
                int i22 = i8;
                g3.q0 q0Var4 = q0Var2;
                long j13 = j8;
                long j14 = j11;
                qa.a(rVar4, p0Var3, j9, 0L, 0.0f, f5, f0.o.a(f6, j11), r1.i.d(-187931667, new g(str2, str, rVar, lVar4, j13, i22, q0Var4, 0), sVar), sVar, ((i15 >> 3) & 14) | 12582912 | ((i15 >> 12) & 112) | ((i15 >> 15) & 896) | ((i15 << 6) & 458752), 24);
                p0Var2 = p0Var3;
                j4 = j9;
                f3 = f5;
                f4 = f6;
                q0Var3 = q0Var4;
                i13 = i22;
                lVar2 = lVar4;
                j7 = j14;
                j6 = j13;
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.h
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int L = androidx.compose.runtime.t.L(i2 | 1);
                        int L2 = androidx.compose.runtime.t.L(i3);
                        j.b(rVar, rVar3, str, f3, q0Var3, p0Var2, i13, j4, j7, f4, lVar2, j6, str2, (androidx.compose.runtime.s) obj, L, L2, i4);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i2 & 384) == 0) {
        }
        i6 = i5 | 3072;
        if ((i2 & 24576) != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) != 0) {
        }
        i9 = i4 & 512;
        if (i9 == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) != 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if (sVar.S(i6 & 1, (i6 & 306783379) == 306783378 || (i12 & 147) != 146)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final w1.r rVar, w1.r rVar2, final String str, float f, g3.q0 q0Var, d2.p0 p0Var, int i, long j, f0.v vVar, com.github.rudroid.uitoolkit.text.l lVar, long j2, final String str2, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        int i5;
        w1.r rVar3;
        g3.q0 q0Var2;
        int i6;
        long j3;
        int i7;
        f0.v vVar2;
        int i8;
        int i9;
        String str3;
        final float f2;
        final d2.p0 p0Var2;
        final f0.v vVar3;
        final w1.r rVar4;
        final g3.q0 q0Var3;
        final long j4;
        final int i11;
        final com.github.rudroid.uitoolkit.text.l lVar2;
        final long j5;
        androidx.compose.runtime.b2 t;
        g3.q0 q0Var4;
        int i12;
        com.github.rudroid.uitoolkit.text.l lVar3;
        long j6;
        long j7;
        d2.p0 p0Var3;
        w1.r rVar5;
        float f3;
        com.github.rudroid.uitoolkit.text.l lVar4;
        int i13;
        int i14;
        int i15;
        k71.k.g(str, "text");
        sVar.e0(-1775428095);
        if ((i2 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            rVar3 = rVar2;
            i5 |= sVar.f(rVar3) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i5 |= sVar.f(str) ? 256 : 128;
            }
            int i17 = i5 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i15 = 16384;
                        i17 |= i15;
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i15 = 8192;
                i17 |= i15;
            } else {
                q0Var2 = q0Var;
            }
            if ((196608 & i2) == 0) {
                i17 |= 65536;
            }
            i6 = i17 | 1572864;
            if ((i2 & 12582912) != 0) {
                if ((i4 & 128) == 0) {
                    j3 = j;
                    if (sVar.e(j3)) {
                        i14 = 8388608;
                        i6 |= i14;
                    }
                } else {
                    j3 = j;
                }
                i14 = 4194304;
                i6 |= i14;
            } else {
                j3 = j;
            }
            i7 = i4 & 256;
            if (i7 == 0) {
                i6 |= 100663296;
                vVar2 = vVar;
            } else {
                vVar2 = vVar;
                if ((i2 & 100663296) == 0) {
                    i6 |= sVar.f(vVar2) ? 67108864 : 33554432;
                }
            }
            if ((i2 & 805306368) == 0) {
                if ((i4 & 512) == 0) {
                    if ((1073741824 & i2) == 0 ? sVar.f(lVar) : sVar.h(lVar)) {
                        i13 = 536870912;
                        i6 |= i13;
                    }
                }
                i13 = 268435456;
                i6 |= i13;
            }
            i8 = i3 | 2;
            if ((i3 & 48) != 0) {
                i9 = 12582912;
                str3 = str2;
                i8 |= sVar.f(str3) ? 32 : 16;
            } else {
                i9 = 12582912;
                str3 = str2;
            }
            int i18 = 1;
            if (sVar.S(i6 & 1, (i6 & 306783379) == 306783378 || (i8 & 19) != 18)) {
                sVar.V();
                f2 = f;
                p0Var2 = p0Var;
                vVar3 = vVar2;
                rVar4 = rVar3;
                q0Var3 = q0Var2;
                j4 = j3;
                i11 = i;
                lVar2 = lVar;
                j5 = j2;
            } else {
                sVar.X();
                if ((i2 & 1) == 0 || sVar.A()) {
                    w1.r rVar6 = i16 != 0 ? w1.o.a : rVar3;
                    float f4 = ih.a.e;
                    if ((i4 & 16) != 0) {
                        q0Var4 = (g3.q0) sVar.j(ub.a);
                        i6 &= -57345;
                    } else {
                        q0Var4 = q0Var2;
                    }
                    d2.p0 p0Var4 = ih.d.e(sVar).f;
                    i12 = i6 & (-458753);
                    if ((i4 & 128) != 0) {
                        j3 = ih.d.b(sVar).b;
                        i12 = i6 & (-29818881);
                    }
                    if (i7 != 0) {
                        vVar2 = null;
                    }
                    if ((i4 & 512) != 0) {
                        lVar3 = com.github.rudroid.uitoolkit.text.m.b(null, null, null, 15);
                        i12 &= -1879048193;
                    } else {
                        lVar3 = lVar;
                    }
                    com.github.rudroid.uitoolkit.text.l lVar5 = lVar3;
                    j6 = j3;
                    j7 = ((d2.t) sVar.j(f1.g2.a)).a;
                    p0Var3 = p0Var4;
                    rVar5 = rVar6;
                    q0Var2 = q0Var4;
                    f3 = f4;
                    lVar4 = lVar5;
                } else {
                    sVar.V();
                    if ((i4 & 16) != 0) {
                        i6 &= -57345;
                    }
                    int i19 = i6 & (-458753);
                    if ((i4 & 128) != 0) {
                        i19 = i6 & (-29818881);
                    }
                    if ((i4 & 512) != 0) {
                        i19 &= -1879048193;
                    }
                    p0Var3 = p0Var;
                    i18 = i;
                    lVar4 = lVar;
                    i12 = i19;
                    rVar5 = rVar3;
                    j6 = j3;
                    f3 = f;
                    j7 = j2;
                }
                sVar.r();
                com.github.rudroid.uitoolkit.text.l lVar6 = lVar4;
                g3.q0 q0Var5 = q0Var2;
                long j8 = j7;
                f0.v vVar4 = vVar2;
                qa.a(rVar5, p0Var3, j6, 0L, 0.0f, f3, vVar4, r1.i.d(-1686886052, new g(str3, str, rVar, lVar6, j8, i18, q0Var5, 1), sVar), sVar, ((i12 >> 3) & 14) | i9 | ((i12 >> 15) & 896) | ((i12 << 6) & 458752) | (3670016 & (i12 >> 6)), 24);
                p0Var2 = p0Var3;
                f2 = f3;
                vVar3 = vVar4;
                q0Var3 = q0Var5;
                i11 = i18;
                lVar2 = lVar6;
                j5 = j8;
                j4 = j6;
                rVar4 = rVar5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.i
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int L = androidx.compose.runtime.t.L(i2 | 1);
                        int L2 = androidx.compose.runtime.t.L(i3);
                        j.c(rVar, rVar4, str, f2, q0Var3, p0Var2, i11, j4, vVar3, lVar2, j5, str2, (androidx.compose.runtime.s) obj, L, L2, i4);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        rVar3 = rVar2;
        if ((i2 & 384) == 0) {
        }
        int i172 = i5 | 3072;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i6 = i172 | 1572864;
        if ((i2 & 12582912) != 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i8 = i3 | 2;
        if ((i3 & 48) != 0) {
        }
        int i182 = 1;
        if (sVar.S(i6 & 1, (i6 & 306783379) == 306783378 || (i8 & 19) != 18)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final long d(long j, long j2) {
        return (d2.t.c(j, d2.t.d) || d2.t.c(j, d2.t.b)) ? j2 : j;
    }
}
