package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.t1;
import d2.p0;
import f1.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0Shadow {
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, d2 d2Var, j71.a aVar, f1.o0 o0Var, s0 s0Var, f0.v vVar, boolean z, p0 p0Var, boolean z2, String str, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        f1.o0 o0Var2;
        boolean z3;
        int i4;
        boolean z4;
        f0.v vVar2;
        p0 p0Var2;
        f1.o0 o0Var3;
        boolean z5;
        d2 d2Var2;
        boolean z6;
        s0 s0Var2;
        b2 t;
        int i5;
        int i6;
        f1.o0 o0Var4;
        boolean z7;
        f0.v vVar3;
        boolean z8;
        p0 p0Var3;
        s0 s0Var3;
        d2 d2Var3;
        int i7;
        k71.k.g(aVar, "onClick");
        k71.k.g(str, "text");
        sVar.e0(262317553);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
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
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z3 = z;
            i3 |= sVar.g(z3) ? 1048576 : 524288;
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((100663296 & i) == 0) {
                z4 = z2;
                i3 |= sVar.g(z4) ? 67108864 : 33554432;
                if ((i & 805306368) == 0) {
                    i3 |= sVar.f(str) ? 536870912 : 268435456;
                }
                if (sVar.S(i3 & 1, (306783379 & i3) != 306783378)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        d2 d2Var4 = f1.p0.a;
                        int i9 = i3 & (-113);
                        if ((i2 & 8) != 0) {
                            o0Var2 = v.i(3072, sVar);
                            i9 = i3 & (-7281);
                        }
                        i5 = 805306368;
                        s0 b = f1.p0.b(31, 0.0f);
                        f0.v b2 = y.b(0L, sVar, 3);
                        if (i8 != 0) {
                            z3 = true;
                        }
                        p0 p0Var4 = ih.d.e(sVar).b;
                        i6 = i9 & (-29876225);
                        o0Var4 = o0Var2;
                        if (i4 != 0) {
                            p0Var3 = p0Var4;
                            z7 = z3;
                            vVar3 = b2;
                            z8 = false;
                        } else {
                            z7 = z3;
                            vVar3 = b2;
                            z8 = z4;
                            p0Var3 = p0Var4;
                        }
                        s0Var3 = b;
                        d2Var3 = d2Var4;
                    } else {
                        sVar.V();
                        int i11 = i3 & (-113);
                        if ((i2 & 8) != 0) {
                            i11 = i3 & (-7281);
                        }
                        int i12 = i11 & (-29876225);
                        s0Var3 = s0Var;
                        i6 = i12;
                        o0Var4 = o0Var2;
                        z7 = z3;
                        i5 = 805306368;
                        d2Var3 = d2Var;
                        vVar3 = vVar;
                        z8 = z4;
                        p0Var3 = p0Var;
                    }
                    sVar.r();
                    b(rVar2, d2Var3, aVar, o0Var4, s0Var3, vVar3, z7, p0Var3, z8, r1.i.d(853776371, new bd.m(str, 14), sVar), sVar, (i6 & 234881024) | (i6 & 14) | i5 | (i6 & 896) | (i6 & 7168) | (3670016 & i6), 0);
                    d2Var2 = d2Var3;
                    z5 = z8;
                    p0Var2 = p0Var3;
                    z6 = z7;
                    vVar2 = vVar3;
                    s0Var2 = s0Var3;
                    o0Var3 = o0Var4;
                } else {
                    sVar.V();
                    vVar2 = vVar;
                    p0Var2 = p0Var;
                    o0Var3 = o0Var2;
                    z5 = z4;
                    d2Var2 = d2Var;
                    z6 = z3;
                    s0Var2 = s0Var;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new com.github.rudroid.copilot.ui.m(rVar, d2Var2, aVar, o0Var3, s0Var2, vVar2, z6, p0Var2, z5, str, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 805306368) == 0) {
            }
            if (sVar.S(i3 & 1, (306783379 & i3) != 306783378)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        z3 = z;
        if ((12582912 & i) == 0) {
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 805306368) == 0) {
        }
        if (sVar.S(i3 & 1, (306783379 & i3) != 306783378)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, d2 d2Var, j71.a aVar, f1.o0 o0Var, s0 s0Var, f0.v vVar, boolean z, p0 p0Var, boolean z2, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        d2 d2Var2;
        f1.o0 o0Var2;
        s0 s0Var2;
        f0.v vVar2;
        boolean z3;
        p0 p0Var2;
        int i4;
        boolean z4;
        p0 p0Var3;
        b2 t;
        d2 d2Var3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        k71.k.g(aVar, "onClick");
        sVar.e0(1421712511);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                d2Var2 = d2Var;
                if (sVar.f(d2Var2)) {
                    i13 = 32;
                    i3 |= i13;
                }
            } else {
                d2Var2 = d2Var;
            }
            i13 = 16;
            i3 |= i13;
        } else {
            d2Var2 = d2Var;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                o0Var2 = o0Var;
                if (sVar.f(o0Var2)) {
                    i12 = 2048;
                    i3 |= i12;
                }
            } else {
                o0Var2 = o0Var;
            }
            i12 = 1024;
            i3 |= i12;
        } else {
            o0Var2 = o0Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                s0Var2 = s0Var;
                if (sVar.f(s0Var2)) {
                    i11 = 16384;
                    i3 |= i11;
                }
            } else {
                s0Var2 = s0Var;
            }
            i11 = 8192;
            i3 |= i11;
        } else {
            s0Var2 = s0Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vVar2 = vVar;
                if (sVar.f(vVar2)) {
                    i9 = 131072;
                    i3 |= i9;
                }
            } else {
                vVar2 = vVar;
            }
            i9 = 65536;
            i3 |= i9;
        } else {
            vVar2 = vVar;
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z3 = z;
            i3 |= sVar.g(z3) ? 1048576 : 524288;
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    p0Var2 = p0Var;
                    if (sVar.f(p0Var2)) {
                        i8 = 8388608;
                        i3 |= i8;
                    }
                } else {
                    p0Var2 = p0Var;
                }
                i8 = 4194304;
                i3 |= i8;
            } else {
                p0Var2 = p0Var;
            }
            if ((i & 100663296) == 0) {
                i3 |= sVar.g(z2) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i3 |= sVar.h(dVar) ? 536870912 : 268435456;
            }
            i4 = i3;
            if (sVar.S(i4 & 1, (i3 & 306783379) == 306783378)) {
                sVar.V();
                z4 = z3;
                p0Var3 = p0Var2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    if ((i2 & 2) != 0) {
                        d2Var3 = f1.p0.a;
                        i5 = i4 & (-113);
                    } else {
                        d2Var3 = d2Var2;
                        i5 = i4;
                    }
                    if ((i2 & 8) != 0) {
                        o0Var2 = v.i(3072, sVar);
                        i5 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i6 = -29360129;
                        s0Var2 = f1.p0.b(31, 0.0f);
                        i5 &= -57345;
                    } else {
                        i6 = -29360129;
                    }
                    d2 d2Var4 = d2Var3;
                    int i15 = i5;
                    if ((i2 & 32) != 0) {
                        i5 = i15 & (-458753);
                        vVar2 = y.b(0L, sVar, 3);
                    }
                    if (i14 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= i6;
                        p0Var2 = ih.d.e(sVar).b;
                    }
                    i7 = i5;
                    d2Var2 = d2Var4;
                } else {
                    sVar.V();
                    i7 = (i2 & 2) != 0 ? i4 & (-113) : i4;
                    if ((i2 & 8) != 0) {
                        i7 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i7 &= -29360129;
                    }
                }
                s0 s0Var3 = s0Var2;
                f0.v vVar3 = vVar2;
                boolean z5 = z3;
                f1.o0 o0Var3 = o0Var2;
                p0 p0Var4 = p0Var2;
                sVar.r();
                int i16 = i7 << 3;
                y.a((i7 & 896) | (i7 & 14) | 100663296 | (i7 & 112) | ((i7 >> 6) & 7168) | (i16 & 57344) | (i16 & 458752) | (i7 & 29360128), 0, d2Var2, sVar, p0Var4, vVar3, o0Var3, s0Var3, aVar, r1.i.d(606416550, new t1(z2, dVar, 4), sVar), rVar, z5 && !z2);
                p0Var3 = p0Var4;
                o0Var2 = o0Var3;
                vVar2 = vVar3;
                s0Var2 = s0Var3;
                z4 = z5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.copilot.ui.m(rVar, d2Var2, aVar, o0Var2, s0Var2, vVar2, z4, p0Var3, z2, dVar, i, i2);
                return;
            }
            return;
        }
        z3 = z;
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i4 = i3;
        if (sVar.S(i4 & 1, (i3 & 306783379) == 306783378)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
