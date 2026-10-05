package tg;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.z0;
import d2.p0;
import f0.v;
import f1.e8;
import f1.x0;
import f1.y0;
import r1.d;
import r1.i;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(int i, int i2, s sVar, p0 p0Var, v vVar, x0 x0Var, y0 y0Var, d dVar, r rVar) {
        r rVar2;
        int i3;
        x0 x0Var2;
        v vVar2;
        p0 p0Var2;
        y0 y0Var2;
        p0 p0Var3;
        r rVar3;
        p0 p0Var4;
        int i4;
        y0 u;
        int i5;
        int i6;
        sVar.e0(1440773345);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= ((i2 & 2) == 0 && sVar.f(p0Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                x0Var2 = x0Var;
                if (sVar.f(x0Var2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                x0Var2 = x0Var;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            x0Var2 = x0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                vVar2 = vVar;
                if (sVar.f(vVar2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                vVar2 = vVar;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            vVar2 = vVar;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= sVar.h(dVar) ? 131072 : 65536;
        }
        if (sVar.S(i3 & 1, (74899 & i3) != 74898)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                r rVar4 = i7 != 0 ? o.a : rVar2;
                if ((i2 & 2) != 0) {
                    p0Var3 = ih.d.e(sVar).c;
                    i3 &= -113;
                } else {
                    p0Var3 = p0Var;
                }
                if ((i2 & 4) != 0) {
                    x0Var2 = b.b(24576, 15, 0L, sVar);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    vVar2 = f0.o.a(0.0f, ih.d.b(sVar).p);
                    i3 &= -7169;
                }
                rVar3 = rVar4;
                p0Var4 = p0Var3;
                i4 = i3 & (-57345);
                u = e8.u(63, 0.0f);
            } else {
                sVar.V();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                i4 = i3 & (-57345);
                p0Var4 = p0Var;
                u = y0Var;
                rVar3 = rVar2;
            }
            x0 x0Var3 = x0Var2;
            v vVar3 = vVar2;
            sVar.r();
            e8.e((i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | ((i4 << 3) & 57344), 0, sVar, p0Var4, vVar3, x0Var3, u, i.d(-845255469, new z0(dVar, 10), sVar), rVar3);
            p0Var2 = p0Var4;
            vVar2 = vVar3;
            x0Var2 = x0Var3;
            y0Var2 = u;
            rVar2 = rVar3;
        } else {
            sVar.V();
            p0Var2 = p0Var;
            y0Var2 = y0Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new f1.z0(rVar2, p0Var2, x0Var2, vVar2, y0Var2, dVar, i, i2);
        }
    }

}
