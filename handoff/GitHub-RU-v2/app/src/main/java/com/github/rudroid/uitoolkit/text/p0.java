package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import f1.g2;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, int i, q0 q0Var, d2.p0 p0Var, l lVar, long j, final long j2, long j3, String str2, float f, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        q0 q0Var2;
        d2.p0 p0Var2;
        long j4;
        String str3;
        int i7;
        int i8;
        int i9;
        final w1.r rVar2;
        final int i11;
        final q0 q0Var3;
        final d2.p0 p0Var3;
        final long j5;
        final long j6;
        final float f2;
        final String str4;
        final l lVar2;
        b2 t;
        q0 q0Var4;
        d2.p0 p0Var4;
        l lVar3;
        long j7;
        w1.r rVar3;
        float f3;
        int i12;
        int i13;
        long j8;
        long j9;
        String str5;
        l lVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        k71.k.g(str, "text");
        sVar.e0(-1123123391);
        int i19 = i4 & 1;
        if (i19 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= sVar.f(str) ? 32 : 16;
        }
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i6 = i;
            i5 |= sVar.d(i6) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i18 = 2048;
                        i5 |= i18;
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i18 = 1024;
                i5 |= i18;
            } else {
                q0Var2 = q0Var;
            }
            if ((i2 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    p0Var2 = p0Var;
                    if (sVar.f(p0Var2)) {
                        i17 = 16384;
                        i5 |= i17;
                    }
                } else {
                    p0Var2 = p0Var;
                }
                i17 = 8192;
                i5 |= i17;
            } else {
                p0Var2 = p0Var;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    if ((262144 & i2) == 0 ? sVar.f(lVar) : sVar.h(lVar)) {
                        i16 = 131072;
                        i5 |= i16;
                    }
                }
                i16 = 65536;
                i5 |= i16;
            }
            if ((1572864 & i2) != 0) {
                if ((i4 & 64) == 0) {
                    j4 = j;
                    if (sVar.e(j4)) {
                        i15 = 1048576;
                        i5 |= i15;
                    }
                } else {
                    j4 = j;
                }
                i15 = 524288;
                i5 |= i15;
            } else {
                j4 = j;
            }
            if ((i2 & 12582912) == 0) {
                i5 |= sVar.e(j2) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i5 |= ((i4 & 256) == 0 && sVar.e(j3)) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 512) == 0) {
                    str3 = str2;
                    if (sVar.f(str3)) {
                        i14 = 536870912;
                        i5 |= i14;
                    }
                } else {
                    str3 = str2;
                }
                i14 = 268435456;
                i5 |= i14;
            } else {
                str3 = str2;
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
                i8 = i7;
                i9 = 6;
            } else if ((i3 & 6) == 0) {
                i8 = i7;
                i9 = i3 | (sVar.c(f) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i3;
            }
            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i9 & 3) != 2)) {
                sVar.V();
                rVar2 = rVar;
                i11 = i6;
                q0Var3 = q0Var2;
                p0Var3 = p0Var2;
                j5 = j4;
                j6 = j3;
                f2 = f;
                str4 = str3;
                lVar2 = lVar;
            } else {
                sVar.X();
                int i22 = i2 & 1;
                w1.r rVar4 = w1.o.a;
                if (i22 == 0 || sVar.A()) {
                    w1.r rVar5 = i19 != 0 ? rVar4 : rVar;
                    int i23 = i21 == 0 ? i6 : 1;
                    if ((i4 & 8) != 0) {
                        q0Var4 = (q0) sVar.j(ub.a);
                        i5 &= -7169;
                    } else {
                        q0Var4 = q0Var2;
                    }
                    if ((i4 & 16) != 0) {
                        p0Var4 = ih.d.e(sVar).c;
                        i5 &= -57345;
                    } else {
                        p0Var4 = p0Var2;
                    }
                    if ((i4 & 32) != 0) {
                        lVar3 = m.b(null, null, null, 15);
                        i5 &= -458753;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        j4 = ((d2.t) sVar.j(g2.a)).a;
                    }
                    if ((i4 & 256) != 0) {
                        j7 = ih.d.b(sVar).p;
                        i5 &= -234881025;
                    } else {
                        j7 = j3;
                    }
                    w1.r rVar6 = rVar5;
                    if ((i4 & 512) != 0) {
                        str3 = str;
                        i5 &= -1879048193;
                    }
                    if (i8 != 0) {
                        q0Var3 = q0Var4;
                        p0Var3 = p0Var4;
                        rVar3 = rVar6;
                        l lVar5 = lVar3;
                        f3 = 0.0f;
                        String str6 = str3;
                        i12 = i23;
                        i13 = i5;
                        j8 = j7;
                        j9 = j4;
                        str5 = str6;
                        lVar4 = lVar5;
                    } else {
                        rVar3 = rVar6;
                        q0Var3 = q0Var4;
                        p0Var3 = p0Var4;
                        l lVar6 = lVar3;
                        f3 = f;
                        String str7 = str3;
                        i12 = i23;
                        i13 = i5;
                        j8 = j7;
                        j9 = j4;
                        str5 = str7;
                        lVar4 = lVar6;
                    }
                } else {
                    sVar.V();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i4 & 256) != 0) {
                        i5 &= -234881025;
                    }
                    if ((i4 & 512) != 0) {
                        i5 &= -1879048193;
                    }
                    rVar3 = rVar;
                    i13 = i5;
                    q0Var3 = q0Var2;
                    p0Var3 = p0Var2;
                    j9 = j4;
                    lVar4 = lVar;
                    j8 = j3;
                    str5 = str3;
                    i12 = i6;
                    f3 = f;
                }
                sVar.r();
                int i24 = i13 << 3;
                rVar2 = rVar3;
                com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.y(rVar4, ih.a.l, ih.a.j), rVar2, str, 0.0f, q0Var3, p0Var3, i12, j2, j8, f3, lVar4, j9, str5, sVar, (i24 & 896) | (i24 & 112) | 6 | (57344 & i24) | (i24 & 458752) | ((i13 << 12) & 3670016) | (29360128 & i13) | (234881024 & i13) | ((i9 << 27) & 1879048192), ((i13 >> 15) & 126) | ((i13 >> 21) & 896), 8);
                i11 = i12;
                lVar2 = lVar4;
                j5 = j9;
                str4 = str5;
                f2 = f3;
                j6 = j8;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.o0
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int L = androidx.compose.runtime.t.L(i2 | 1);
                        int L2 = androidx.compose.runtime.t.L(i3);
                        p0.a(rVar2, str, i11, q0Var3, p0Var3, lVar2, j5, j2, j6, str4, f2, (androidx.compose.runtime.s) obj, L, L2, i4);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = i;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) != 0) {
        }
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i9 & 3) != 2)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }









    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c {
        public c() {
        }
    }
}
