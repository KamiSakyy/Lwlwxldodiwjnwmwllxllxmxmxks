package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.utilities.l1;
import d2.p0;
import f1.e8;
import f1.t0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, d2 d2Var, androidx.compose.runtime.s sVar, p0 p0Var, f0.v vVar, f1.o0 o0Var, j71.a aVar, j71.f fVar, w1.r rVar, boolean z) {
        w1.r rVar2;
        int i3;
        boolean z2;
        f1.o0 o0Var2;
        int i4;
        f0.v vVar2;
        d2 d2Var2;
        int i5;
        p0 p0Var2;
        boolean z3;
        f1.o0 o0Var3;
        f0.v vVar3;
        d2 d2Var3;
        b2 t;
        p0 p0Var3;
        int i6;
        boolean z4;
        int i7;
        k71.k.g(fVar, "content");
        sVar.e0(-1450596211);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= sVar.h(aVar) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    o0Var2 = o0Var;
                    if (sVar.f(o0Var2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    o0Var2 = o0Var;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                o0Var2 = o0Var;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                vVar2 = vVar;
            } else {
                vVar2 = vVar;
                if ((i & 24576) == 0) {
                    i3 |= sVar.f(vVar2) ? 16384 : 8192;
                }
            }
            if ((196608 & i) != 0) {
                d2Var2 = d2Var;
                i3 |= ((i2 & 32) == 0 && sVar.f(d2Var2)) ? 131072 : 65536;
            } else {
                d2Var2 = d2Var;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= sVar.h(fVar) ? 8388608 : 4194304;
            }
            i5 = i3;
            if (sVar.S(i5 & 1, (4793491 & i5) == 4793490)) {
                sVar.V();
                p0Var2 = p0Var;
                z3 = z2;
                o0Var3 = o0Var2;
                vVar3 = vVar2;
                d2Var3 = d2Var2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    w1.r rVar3 = i8 != 0 ? w1.o.a : rVar2;
                    boolean z5 = i9 != 0 ? true : z2;
                    if ((i2 & 8) != 0) {
                        f2 f2Var = f1.p0.a;
                        i5 &= -7169;
                        o0Var2 = f1.p0.e(d2.t.j, ih.d.b(sVar).F, ih.d.b(sVar).H, sVar, 4);
                    }
                    if (i4 != 0) {
                        vVar2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                        d2Var2 = f1.p0.b;
                    }
                    int i11 = i5 & (-3670017);
                    p0Var3 = ih.d.e(sVar).b;
                    i6 = i11;
                    rVar2 = rVar3;
                    z4 = z5;
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    int i12 = i5 & (-3670017);
                    p0Var3 = p0Var;
                    i6 = i12;
                    z4 = z2;
                }
                f1.o0 o0Var4 = o0Var2;
                f0.v vVar4 = vVar2;
                d2 d2Var4 = d2Var2;
                sVar.r();
                int i13 = i6 << 3;
                int i14 = ((i6 >> 6) & 14) | (i13 & 896) | (i13 & 57344);
                int i15 = i6 << 6;
                e8.s((i15 & 1879048192) | i14 | (3670016 & i15) | (29360128 & i15), 288, d2Var4, sVar, p0Var3, vVar4, o0Var4, aVar, fVar, p2.b(rVar2, 0.0f, ih.a.F, 1), z4);
                d2Var3 = d2Var4;
                p0Var2 = p0Var3;
                vVar3 = vVar4;
                o0Var3 = o0Var4;
                z3 = z4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new t0(rVar2, z3, aVar, o0Var3, vVar3, d2Var3, p0Var2, fVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i5 = i3;
        if (sVar.S(i5 & 1, (4793491 & i5) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, boolean z, j71.a aVar, f1.o0 o0Var, String str, d2 d2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z2;
        int i4;
        j71.a aVar2;
        f1.o0 o0Var2;
        d2 d2Var2;
        w1.r rVar3;
        boolean z3;
        j71.a aVar3;
        f1.o0 o0Var3;
        d2 d2Var3;
        b2 t;
        j71.a aVar4;
        w1.r rVar4;
        boolean z4;
        j71.a aVar5;
        d2 d2Var4;
        f1.o0 o0Var4;
        int i5;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "text");
        sVar2.e0(2033706181);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= sVar2.g(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                aVar2 = aVar;
                i3 |= sVar2.h(aVar2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        o0Var2 = o0Var;
                        if (sVar2.f(o0Var2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        o0Var2 = o0Var;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    o0Var2 = o0Var;
                }
                if ((i & 24576) == 0) {
                    i3 |= sVar2.f(str) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    d2Var2 = d2Var;
                    i3 |= ((i2 & 32) == 0 && sVar2.f(d2Var2)) ? 131072 : 65536;
                } else {
                    d2Var2 = d2Var;
                }
                if (sVar2.S(i3 & 1, (74899 & i3) != 74898)) {
                    sVar2.X();
                    if ((i & 1) == 0 || sVar2.A()) {
                        w1.r rVar5 = i6 != 0 ? w1.o.a : rVar2;
                        boolean z5 = i7 != 0 ? true : z2;
                        if (i4 != 0) {
                            Object N = sVar2.N();
                            if (N == androidx.compose.runtime.n.a) {
                                N = new com.github.rudroid.widget.p(15);
                                sVar2.n0(N);
                            }
                            aVar4 = (j71.a) N;
                        } else {
                            aVar4 = aVar2;
                        }
                        if ((i2 & 8) != 0) {
                            f2 f2Var = f1.p0.a;
                            f1.o0 e = f1.p0.e(d2.t.j, ih.d.b(sVar2).F, ih.d.b(sVar2).H, sVar, 4);
                            sVar2 = sVar;
                            i3 &= -7169;
                            o0Var2 = e;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rVar4 = rVar5;
                            z4 = z5;
                            aVar5 = aVar4;
                            d2Var4 = f1.p0.b;
                            o0Var4 = o0Var2;
                            sVar2.r();
                            a((i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3), 80, d2Var4, sVar2, null, null, o0Var4, aVar5, r1.i.d(201233086, new ab.m(str, 17), sVar2), rVar4, z4);
                            d2Var3 = d2Var4;
                            o0Var3 = o0Var4;
                            aVar3 = aVar5;
                            rVar3 = rVar4;
                            z3 = z4;
                        } else {
                            rVar4 = rVar5;
                            z4 = z5;
                            aVar5 = aVar4;
                        }
                    } else {
                        sVar2.V();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        rVar4 = rVar2;
                        z4 = z2;
                        aVar5 = aVar2;
                    }
                    o0Var4 = o0Var2;
                    d2Var4 = d2Var2;
                    sVar2.r();
                    a((i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3), 80, d2Var4, sVar2, null, null, o0Var4, aVar5, r1.i.d(201233086, new ab.m(str, 17), sVar2), rVar4, z4);
                    d2Var3 = d2Var4;
                    o0Var3 = o0Var4;
                    aVar3 = aVar5;
                    rVar3 = rVar4;
                    z3 = z4;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    z3 = z2;
                    aVar3 = aVar2;
                    o0Var3 = o0Var2;
                    d2Var3 = d2Var2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new l1(rVar3, z3, aVar3, o0Var3, str, d2Var3, i, i2);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (sVar2.S(i3 & 1, (74899 & i3) != 74898)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        aVar2 = aVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (sVar2.S(i3 & 1, (74899 & i3) != 74898)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    public static Object b(Object... a) {
        return null;
    }
}
