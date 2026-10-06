package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import d2.p0;
import f1.e8;
import f1.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow {
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, d2 d2Var, j71.a aVar, zShadow zVar, f0.v vVar, s0 s0Var, boolean z, p0 p0Var, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        d2 d2Var2;
        zShadow zVar2;
        s0 s0Var2;
        boolean z2;
        p0 p0Var2;
        f0.v vVar2;
        p0 p0Var3;
        boolean z3;
        s0 s0Var3;
        zShadow zVar3;
        d2 d2Var3;
        b2 t;
        s0 s0Var4;
        p0 p0Var4;
        zShadow zVar4;
        int i4;
        d2 d2Var4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        k71.k.g(aVar, "onClick");
        sVar.e0(-1690265549);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                d2Var2 = d2Var;
                if (sVar.f(d2Var2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                d2Var2 = d2Var;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            d2Var2 = d2Var;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                zVar2 = zVar;
                if (sVar.f(zVar2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                zVar2 = zVar;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            zVar2 = zVar;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                s0Var2 = s0Var;
                if (sVar.f(s0Var2)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                s0Var2 = s0Var;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            s0Var2 = s0Var;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 1048576 : 524288;
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    p0Var2 = p0Var;
                    if (sVar.f(p0Var2)) {
                        i5 = 8388608;
                        i3 |= i5;
                    }
                } else {
                    p0Var2 = p0Var;
                }
                i5 = 4194304;
                i3 |= i5;
            } else {
                p0Var2 = p0Var;
            }
            if ((100663296 & i) == 0) {
                i3 |= sVar.h(dVar) ? 67108864 : 33554432;
            }
            if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
                sVar.V();
                vVar2 = vVar;
                p0Var3 = p0Var2;
                z3 = z2;
                s0Var3 = s0Var2;
                zVar3 = zVar2;
                d2Var3 = d2Var2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    if ((i2 & 2) != 0) {
                        d2Var2 = f1.p0.a;
                        i3 &= -113;
                    }
                    if ((i2 & 8) != 0) {
                        zVar2 = b(sVar);
                        i3 &= -7169;
                    }
                    f0.v b = y.b(zVar2.b, sVar, 1);
                    int i11 = i3 & (-57345);
                    if ((i2 & 32) != 0) {
                        s0Var2 = f1.p0.b(31, 0.0f);
                        i11 = i3 & (-516097);
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 128) != 0) {
                        int i12 = i11 & (-29360129);
                        d2Var4 = d2Var2;
                        zVar4 = zVar2;
                        s0Var4 = s0Var2;
                        p0Var4 = ih.d.e(sVar).b;
                        i4 = i12;
                        vVar2 = b;
                    } else {
                        p0 p0Var5 = p0Var2;
                        s0Var4 = s0Var2;
                        p0Var4 = p0Var5;
                        zVar4 = zVar2;
                        vVar2 = b;
                        i4 = i11;
                        d2Var4 = d2Var2;
                    }
                    z4 = z2;
                } else {
                    sVar.V();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    int i13 = i3 & (-57345);
                    if ((i2 & 32) != 0) {
                        i13 = i3 & (-516097);
                    }
                    if ((i2 & 128) != 0) {
                        i13 &= -29360129;
                    }
                    p0 p0Var6 = p0Var2;
                    s0Var4 = s0Var2;
                    p0Var4 = p0Var6;
                    d2Var4 = d2Var2;
                    zVar4 = zVar2;
                    i4 = i13;
                    z4 = z2;
                    vVar2 = vVar;
                }
                sVar.r();
                float f = 0;
                int i14 = i4;
                int i15 = i14 >> 12;
                e8.d((i15 & 7168) | ((i14 >> 6) & 14) | 817889280 | ((i14 << 3) & 112) | (i15 & 896) | (i14 & 458752), 256, new f2(f, f, f, f), sVar, p0Var4, vVar2, zVar4.c, s0Var4, aVar, r1.i.d(164573219, new com.github.rudroid.agents.j(zVar4, d2Var4, z4, dVar), sVar), rVar, z4);
                p0Var3 = p0Var4;
                s0Var3 = s0Var4;
                z3 = z4;
                d2Var3 = d2Var4;
                zVar3 = zVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.fileeditor.commitbox.c(rVar, d2Var3, aVar, zVar3, vVar2, s0Var3, z3, p0Var3, dVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((12582912 & i) != 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final z b(androidx.compose.runtime.s sVar) {
        long j = ih.d.a(sVar).e;
        long b = d2.t.b(0.38f, j);
        List r = x61.l.r(new d2.tShadow[]{new d2.t(ih.d.b(sVar).K0), new d2.t(ih.d.b(sVar).L0)});
        long j2 = ih.d.a(sVar).v;
        f2 f2Var = f1.p0.a;
        return new zShadow(rb0.b.b(r), j2, f1.p0.a(d2.t.j, j, 0L, b, sVar, 4));
    }
}
