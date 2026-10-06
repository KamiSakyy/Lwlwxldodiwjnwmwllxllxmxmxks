package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.main.s1;
import d2.p0;
import d2.r0;
import f1.e8;
import f1.s0;
import f1.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, d2 d2Var, androidx.compose.runtime.s sVar, p0 p0Var, f0.v vVar, f1.o0 o0Var, s0 s0Var, j71.a aVar, j71.f fVar, w1.r rVar, boolean z) {
        w1.r rVar2;
        int i3;
        d2 d2Var2;
        f0.v vVar2;
        f1.o0 o0Var2;
        s0 s0Var2;
        boolean z2;
        p0 p0Var2;
        d2 d2Var3;
        f0.v vVar3;
        f1.o0 o0Var3;
        s0 s0Var3;
        boolean z3;
        b2 t;
        d2 d2Var4;
        f0.v vVar4;
        p0 p0Var3;
        s0 s0Var4;
        d2 d2Var5;
        f0.v vVar5;
        int i4;
        int i5;
        int i6;
        int i7;
        k71.k.g(aVar, "onClick");
        k71.k.g(fVar, "content");
        sVar.e0(1143237794);
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                d2Var2 = d2Var;
                if (sVar.f(d2Var2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                d2Var2 = d2Var;
            }
            i7 = 16;
            i3 |= i7;
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
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                vVar2 = vVar;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            vVar2 = vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                o0Var2 = o0Var;
                if (sVar.f(o0Var2)) {
                    i5 = 16384;
                    i3 |= i5;
                }
            } else {
                o0Var2 = o0Var;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            o0Var2 = o0Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                s0Var2 = s0Var;
                if (sVar.f(s0Var2)) {
                    i4 = 131072;
                    i3 |= i4;
                }
            } else {
                s0Var2 = s0Var;
            }
            i4 = 65536;
            i3 |= i4;
        } else {
            s0Var2 = s0Var;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 1048576 : 524288;
            if ((12582912 & i) == 0) {
                i3 |= ((i2 & 128) == 0 && sVar.f(p0Var)) ? 8388608 : 4194304;
            }
            if ((100663296 & i) == 0) {
                i3 |= sVar.h(fVar) ? 67108864 : 33554432;
            }
            if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
                sVar.V();
                p0Var2 = p0Var;
                d2Var3 = d2Var2;
                vVar3 = vVar2;
                o0Var3 = o0Var2;
                s0Var3 = s0Var2;
                z3 = z2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    if (i8 != 0) {
                        rVar2 = w1.o.a;
                    }
                    w1.r rVar3 = rVar2;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        d2Var4 = f1.p0.a;
                    } else {
                        d2Var4 = d2Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        vVar4 = b(0L, sVar, 3);
                    } else {
                        vVar4 = vVar2;
                    }
                    int i11 = i3;
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        o0Var2 = v.e(0L, 0L, sVar, 3072, 7);
                    }
                    if ((i2 & 32) != 0) {
                        s0Var2 = f1.p0.b(31, 0.0f);
                        i3 = i11 & (-458753);
                    } else {
                        i3 = i11;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 128) != 0) {
                        p0Var3 = ih.d.e(sVar).b;
                        i3 &= -29360129;
                    } else {
                        p0Var3 = p0Var;
                    }
                    s0Var4 = s0Var2;
                    rVar2 = rVar3;
                    d2Var5 = d2Var4;
                    vVar5 = vVar4;
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
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    p0Var3 = p0Var;
                    d2Var5 = d2Var2;
                    vVar5 = vVar2;
                    s0Var4 = s0Var2;
                }
                boolean z4 = z2;
                sVar.r();
                int i12 = i3 >> 12;
                p0 p0Var4 = p0Var3;
                f1.o0 o0Var4 = o0Var2;
                e8.l(aVar, p2.b(rVar2, 0.0f, ih.a.F, 1), z4, p0Var4, o0Var4, s0Var4, vVar5, d2Var5, r1.i.d(-732500624, new s1(z4, o0Var2, fVar, 8), sVar), sVar, ((i3 >> 6) & 14) | 805306368 | (i12 & 896) | (i12 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 9) & 3670016) | ((i3 << 18) & 29360128), 256);
                z3 = z4;
                p0Var2 = p0Var4;
                o0Var3 = o0Var4;
                s0Var3 = s0Var4;
                vVar3 = vVar5;
                d2Var3 = d2Var5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new u0(rVar2, d2Var3, aVar, vVar3, o0Var3, s0Var3, z3, p0Var2, fVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final f0.v b(long j, androidx.compose.runtime.s sVar, int i) {
        float f = ih.a.d;
        if ((i & 2) != 0) {
            j = ih.d.a(sVar).E0;
        }
        return new f0.v(f, new r0(j));
    }

    public static Object a;
}
