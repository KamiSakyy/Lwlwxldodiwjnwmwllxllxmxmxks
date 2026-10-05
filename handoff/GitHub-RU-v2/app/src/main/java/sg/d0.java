package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.runtime.b2;
import d2.p0;
import f1.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, d2 d2Var, j71.a aVar, z zVar, long j, s0 s0Var, boolean z, p0 p0Var, Integer num, Integer num2, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z2;
        int i4;
        Integer num3;
        int i5;
        int i6;
        Integer num4;
        int i7;
        d2 d2Var2;
        s0 s0Var2;
        p0 p0Var2;
        w1.r rVar3;
        boolean z3;
        Integer num5;
        Integer num6;
        long j2;
        b2 t;
        w1.r rVar4;
        d2 d2Var3;
        long j3;
        p0 p0Var3;
        int i8;
        Integer num7;
        boolean z4;
        s0 s0Var3;
        w1.r rVar5;
        long j4;
        k71.k.g(aVar, "onClick");
        f1.o0 o0Var = zVar.c;
        sVar.e0(826893751);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (sVar.f(rVar2) ? 4 : 2);
        }
        int i11 = i3 | 16 | (sVar.f(zVar) ? 2048 : 1024);
        int i12 = 90112 | i11;
        int i13 = i2 & 64;
        if (i13 != 0) {
            i12 = 1662976 | i11;
        } else if ((i & 1572864) == 0) {
            z2 = z;
            i12 |= sVar.g(z2) ? 1048576 : 524288;
            int i14 = 4194304 | i12;
            i4 = i2 & 256;
            if (i4 == 0) {
                i5 = i12 | 104857600;
                num3 = num;
            } else {
                num3 = num;
                i5 = i14 | (sVar.f(num3) ? 67108864 : 33554432);
            }
            i6 = i2 & 512;
            if (i6 == 0) {
                i7 = i5 | 805306368;
                num4 = num2;
            } else {
                num4 = num2;
                i7 = i5 | (sVar.f(num4) ? 536870912 : 268435456);
            }
            if (sVar.S(i7 & 1, (306783379 & i7) == 306783378)) {
                sVar.V();
                d2Var2 = d2Var;
                s0Var2 = s0Var;
                p0Var2 = p0Var;
                rVar3 = rVar2;
                z3 = z2;
                num5 = num3;
                num6 = num4;
                j2 = j;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    rVar4 = i9 != 0 ? w1.o.a : rVar2;
                    d2Var3 = f1.p0.a;
                    j3 = d2.t.k;
                    s0 b = f1.p0.b(31, 0.0f);
                    if (i13 != 0) {
                        z2 = true;
                    }
                    p0Var3 = ih.d.e(sVar).b;
                    int i15 = i7 & (-29818993);
                    if (i4 != 0) {
                        num3 = null;
                    }
                    i8 = i15;
                    if (i6 != 0) {
                        num4 = null;
                    }
                    num7 = num3;
                    z4 = z2;
                    s0Var3 = b;
                } else {
                    sVar.V();
                    j3 = j;
                    p0Var3 = p0Var;
                    i8 = i7 & (-29818993);
                    rVar4 = rVar2;
                    num7 = num3;
                    d2Var3 = d2Var;
                    z4 = z2;
                    s0Var3 = s0Var;
                }
                sVar.r();
                if (j3 != 16) {
                    rVar5 = rVar4;
                    j4 = j3;
                } else if (z4) {
                    rVar5 = rVar4;
                    j4 = o0Var.b;
                } else {
                    rVar5 = rVar4;
                    j4 = o0Var.d;
                }
                Integer num8 = num7;
                Integer num9 = num4;
                d2 d2Var4 = d2Var3;
                w1.r rVar6 = rVar5;
                a0.a(rVar6, d2Var4, aVar, zVar, null, s0Var3, z4, p0Var3, r1.i.d(-1558609626, new com.github.rudroid.issueorpullrequest.triagesheet.projectbetacard.g(num8, num9, j4, dVar), sVar), sVar, (i8 & 14) | 100663680 | (i8 & 7168) | (3670016 & i8), 16);
                d2Var2 = d2Var4;
                z3 = z4;
                p0Var2 = p0Var3;
                num5 = num8;
                num6 = num9;
                rVar3 = rVar6;
                s0Var2 = s0Var3;
                j2 = j3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new eh.h(rVar3, d2Var2, aVar, zVar, j2, s0Var2, z3, p0Var2, num5, num6, dVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        int i142 = 4194304 | i12;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        if (sVar.S(i7 & 1, (306783379 & i7) == 306783378)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, d2 d2Var, final j71.a aVar, f0.v vVar, f1.o0 o0Var, long j, s0 s0Var, boolean z, p0 p0Var, Integer num, Integer num2, final j71.f fVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        d2 d2Var2;
        f0.v vVar2;
        f1.o0 o0Var2;
        s0 s0Var2;
        int i4;
        p0 p0Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num3;
        int i9;
        final w1.r rVar2;
        final p0 p0Var3;
        final Integer num4;
        final d2 d2Var3;
        final f0.v vVar3;
        final f1.o0 o0Var3;
        final s0 s0Var3;
        final long j2;
        final boolean z2;
        final Integer num5;
        b2 t;
        f0.v vVar4;
        f1.o0 o0Var4;
        s0 s0Var4;
        p0 p0Var4;
        w1.r rVar3;
        long j3;
        Integer num6;
        f0.v vVar5;
        int i11;
        boolean z3;
        f1.o0 o0Var5;
        p0 p0Var5;
        d2 d2Var4;
        Integer num7;
        d2 d2Var5;
        long j4;
        int i12;
        int i13;
        int i14;
        int i15;
        k71.k.g(aVar, "onClick");
        k71.k.g(fVar, "content");
        sVar.e0(1008703565);
        int i16 = i2 & 1;
        if (i16 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                d2Var2 = d2Var;
                if (sVar.f(d2Var2)) {
                    i15 = 32;
                    i3 |= i15;
                }
            } else {
                d2Var2 = d2Var;
            }
            i15 = 16;
            i3 |= i15;
        } else {
            d2Var2 = d2Var;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                vVar2 = vVar;
                if (sVar.f(vVar2)) {
                    i14 = 2048;
                    i3 |= i14;
                }
            } else {
                vVar2 = vVar;
            }
            i14 = 1024;
            i3 |= i14;
        } else {
            vVar2 = vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                o0Var2 = o0Var;
                if (sVar.f(o0Var2)) {
                    i13 = 16384;
                    i3 |= i13;
                }
            } else {
                o0Var2 = o0Var;
            }
            i13 = 8192;
            i3 |= i13;
        } else {
            o0Var2 = o0Var;
        }
        int i17 = i2 & 32;
        if (i17 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= sVar.e(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            s0Var2 = s0Var;
            i3 |= ((i2 & 64) == 0 && sVar.f(s0Var2)) ? 1048576 : 524288;
        } else {
            s0Var2 = s0Var;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 = i18;
            i3 |= sVar.g(z) ? 8388608 : 4194304;
            if ((i & 100663296) != 0) {
                if ((i2 & 256) == 0) {
                    p0Var2 = p0Var;
                    if (sVar.f(p0Var2)) {
                        i12 = 67108864;
                        i3 |= i12;
                    }
                } else {
                    p0Var2 = p0Var;
                }
                i12 = 33554432;
                i3 |= i12;
            } else {
                p0Var2 = p0Var;
            }
            i5 = i2 & 512;
            if (i5 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i6 = i5;
                i3 |= sVar.f(num) ? 536870912 : 268435456;
                i7 = i2 & 1024;
                if (i7 != 0) {
                    i9 = 54;
                    i8 = i7;
                    num3 = num2;
                } else {
                    i8 = i7;
                    num3 = num2;
                    i9 = '0' | (sVar.f(num3) ? (char) 4 : (char) 2);
                }
                if (sVar.S(i3 & 1, (i3 & 306783379) == 306783378 || (i9 & 19) != 18)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        w1.r rVar4 = i16 != 0 ? w1.o.a : rVar;
                        if ((i2 & 2) != 0) {
                            d2Var2 = f1.p0.a;
                            i3 &= -113;
                        }
                        d2 d2Var6 = d2Var2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            vVar4 = y.b(0L, sVar, 3);
                        } else {
                            vVar4 = vVar2;
                        }
                        int i19 = i3;
                        if ((i2 & 16) != 0) {
                            o0Var4 = v.e(0L, 0L, sVar, 3072, 7);
                            i19 &= -57345;
                        } else {
                            o0Var4 = o0Var2;
                        }
                        long j5 = i17 != 0 ? d2.t.k : j;
                        if ((i2 & 64) != 0) {
                            s0Var4 = f1.p0.b(31, 0.0f);
                            i19 &= -3670017;
                        } else {
                            s0Var4 = s0Var2;
                        }
                        boolean z4 = i4 == 0 ? z : true;
                        if ((i2 & 256) != 0) {
                            p0Var4 = ih.d.e(sVar).b;
                            i19 &= -234881025;
                        } else {
                            p0Var4 = p0Var;
                        }
                        Integer num8 = i6 != 0 ? null : num;
                        if (i8 != 0) {
                            j3 = j5;
                            vVar5 = vVar4;
                            i11 = i19;
                            o0Var5 = o0Var4;
                            p0Var5 = p0Var4;
                            num7 = null;
                            rVar3 = rVar4;
                            num6 = num8;
                            z3 = z4;
                            d2Var4 = d2Var6;
                        } else {
                            rVar3 = rVar4;
                            j3 = j5;
                            num6 = num8;
                            vVar5 = vVar4;
                            i11 = i19;
                            z3 = z4;
                            o0Var5 = o0Var4;
                            p0Var5 = p0Var4;
                            d2Var4 = d2Var6;
                            num7 = num2;
                        }
                    } else {
                        sVar.V();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        s0 s0Var5 = s0Var2;
                        i11 = i3;
                        vVar5 = vVar2;
                        s0Var4 = s0Var5;
                        j3 = j;
                        z3 = z;
                        num6 = num;
                        d2Var4 = d2Var2;
                        o0Var5 = o0Var2;
                        num7 = num3;
                        p0Var5 = p0Var2;
                        rVar3 = rVar;
                    }
                    sVar.r();
                    if (j3 != 16) {
                        d2Var5 = d2Var4;
                        j4 = j3;
                    } else if (z3) {
                        d2Var5 = d2Var4;
                        j4 = o0Var5.b;
                    } else {
                        d2Var5 = d2Var4;
                        j4 = o0Var5.d;
                    }
                    final Integer num9 = num6;
                    final long j6 = j4;
                    final Integer num10 = num7;
                    int i21 = i11 >> 3;
                    d2Var3 = d2Var5;
                    y.a((i11 & 14) | 100663296 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), 0, d2Var3, sVar, p0Var5, vVar5, o0Var5, s0Var4, aVar, r1.i.d(193407604, new j71.f() { // from class: sg.b0
                        public final Object f(Object obj, Object obj2, Object obj3) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            k71.k.g((m2) obj, "$this$PrimaryButton");
                            if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                com.github.rudroid.uitoolkit.text.k.b(null, com.github.rudroid.uitoolkit.text.m.b(num9, num10, null, 12), androidx.compose.foundation.layout.b.f(ih.a.l, 0.0f, 0.0f, 0.0f, 14), j6, null, null, fVar, sVar2, 384, 49);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), rVar3, z3);
                    s0Var3 = s0Var4;
                    rVar2 = rVar3;
                    z2 = z3;
                    num4 = num9;
                    num5 = num10;
                    p0Var3 = p0Var5;
                    vVar3 = vVar5;
                    o0Var3 = o0Var5;
                    j2 = j3;
                } else {
                    sVar.V();
                    rVar2 = rVar;
                    p0Var3 = p0Var;
                    num4 = num;
                    d2Var3 = d2Var2;
                    vVar3 = vVar2;
                    o0Var3 = o0Var2;
                    s0Var3 = s0Var2;
                    j2 = j;
                    z2 = z;
                    num5 = num2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: sg.c0
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int L = androidx.compose.runtime.t.L(i | 1);
                            d0.b(rVar2, d2Var3, aVar, vVar3, o0Var3, j2, s0Var3, z2, p0Var3, num4, num5, fVar, (androidx.compose.runtime.s) obj, L, i2);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i5;
            i7 = i2 & 1024;
            if (i7 != 0) {
            }
            if (sVar.S(i3 & 1, (i3 & 306783379) == 306783378 || (i9 & 19) != 18)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        i4 = i18;
        if ((i & 100663296) != 0) {
        }
        i5 = i2 & 512;
        if (i5 == 0) {
        }
        i6 = i5;
        i7 = i2 & 1024;
        if (i7 != 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 306783379) == 306783378 || (i9 & 19) != 18)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
