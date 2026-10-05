package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.z1;
import f1.g2;
import f1.p0;
import f1.u7;
import f1.z7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, boolean z, final j71.a aVar, f1.o0 o0Var, final boolean z2, float f, d2 d2Var, final j71.f fVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        boolean z3;
        j71.a aVar2;
        f1.o0 o0Var2;
        float f2;
        d2 d2Var2;
        final d2 d2Var3;
        final w1.r rVar3;
        final boolean z4;
        final f1.o0 o0Var3;
        final float f3;
        b2 t;
        w1.r rVar4;
        final float f4;
        w1.r rVar5;
        boolean z5;
        final f1.o0 o0Var4;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(fVar, "content");
        sVar2.e0(822901604);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z;
            i3 |= sVar2.g(z3) ? 32 : 16;
            if ((i & 384) != 0) {
                aVar2 = aVar;
                i3 |= sVar2.h(aVar2) ? 256 : 128;
            } else {
                aVar2 = aVar;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    o0Var2 = o0Var;
                    if (sVar2.f(o0Var2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    o0Var2 = o0Var;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                o0Var2 = o0Var;
            }
            if ((i & 24576) == 0) {
                i3 |= sVar2.g(z2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (sVar2.c(f2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    f2 = f;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                f2 = f;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    d2Var2 = d2Var;
                    if (sVar2.f(d2Var2)) {
                        i4 = 1048576;
                        i3 |= i4;
                    }
                } else {
                    d2Var2 = d2Var;
                }
                i4 = 524288;
                i3 |= i4;
            } else {
                d2Var2 = d2Var;
            }
            if ((i & 12582912) == 0) {
                i3 |= sVar2.h(fVar) ? 8388608 : 4194304;
            }
            if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
                sVar.V();
                d2Var3 = d2Var;
                rVar3 = rVar2;
                z4 = z3;
                o0Var3 = o0Var2;
                f3 = f;
            } else {
                sVar2.X();
                if ((i & 1) == 0 || sVar2.A()) {
                    w1.r rVar6 = i7 != 0 ? w1.o.a : rVar2;
                    if (i8 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 8) != 0) {
                        f2 f2Var = p0.a;
                        rVar4 = rVar6;
                        f1.o0 e = p0.e(d2.t.j, ih.d.b(sVar2).F, ih.d.b(sVar2).H, sVar2, 4);
                        sVar2 = sVar2;
                        i3 &= -7169;
                        o0Var2 = e;
                    } else {
                        rVar4 = rVar6;
                    }
                    if ((i2 & 32) != 0) {
                        f4 = u7.a;
                        i3 &= -458753;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        rVar5 = rVar4;
                        d2Var2 = p0.b;
                    } else {
                        rVar5 = rVar4;
                        d2Var2 = d2Var;
                    }
                    z5 = z3;
                    o0Var4 = o0Var2;
                } else {
                    sVar2.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    rVar5 = rVar2;
                    z5 = z3;
                    o0Var4 = o0Var2;
                    f4 = f2;
                }
                sVar2.r();
                k0.a((i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 458752), 80, d2Var2, sVar2, null, null, o0Var4, aVar2, r1.i.d(-1470503267, new j71.f() { // from class: sg.f0
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        final m2 m2Var = (m2) obj;
                        androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        k71.k.g(m2Var, "$this$PrimaryTextButton");
                        if ((intValue & 6) == 0) {
                            intValue |= sVar3.f(m2Var) ? 4 : 2;
                        }
                        if (!sVar3.S(intValue & 1, (intValue & 19) != 18)) {
                            sVar3.V();
                        } else if (z2) {
                            sVar3.c0(903636831);
                            z7.a(p2.o(w1.o.a, 24), ((d2.t) sVar3.j(g2.a)).a, f4, 0L, 0, 0.0f, sVar3, 6, 56);
                            sVar3.q(false);
                        } else {
                            sVar3.c0(903847259);
                            z1 f5 = f1.e.f(o0Var4.b, g2.a);
                            final int i9 = 1;
                            final j71.f fVar2 = fVar;
                            androidx.compose.runtime.t.a(f5, r1.i.d(911279289, new j71.e() { // from class: sg.x
                                public final Object s(Object obj4, Object obj5) {
                                    int i11 = i9;
                                    androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    switch (i11) {
                                        case 0:
                                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                fVar2.f(m2Var, sVar4, 0);
                                            } else {
                                                sVar4.V();
                                            }
                                            break;
                                        default:
                                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                fVar2.f(m2Var, sVar4, 0);
                                            } else {
                                                sVar4.V();
                                            }
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            }, sVar3), sVar3, 56);
                            sVar3.q(false);
                        }
                        return w61.a0.a;
                    }
                }, sVar2), rVar5, z5);
                f3 = f4;
                d2Var3 = d2Var2;
                o0Var3 = o0Var4;
                rVar3 = rVar5;
                z4 = z5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: sg.g0
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h0.a(rVar3, z4, aVar, o0Var3, z2, f3, d2Var3, fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (sVar2.S(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
