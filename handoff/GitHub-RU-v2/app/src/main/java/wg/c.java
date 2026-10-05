package wg;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.copilot.h1;
import d2.a0;
import d3.k;
import f1.e8;
import f1.f8;
import f1.ua;
import f1.va;
import ih.d;
import j0.j;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(r rVar, boolean z, ua uaVar, j71.c cVar, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        ua uaVar2;
        r rVar3;
        ua uaVar3;
        r rVar4;
        boolean z2;
        int i4;
        ua uaVar4;
        r rVar5;
        r rVar6;
        int i5;
        sVar.e0(-1081404243);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                uaVar2 = uaVar;
                if (sVar.f(uaVar2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                uaVar2 = uaVar;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            uaVar2 = uaVar;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                rVar4 = i6 != 0 ? o.a : rVar2;
                if ((i2 & 4) != 0) {
                    z2 = false;
                    uaVar2 = e8.v(d.b(sVar).F, a0.d(f0.o.u(sVar) ? 4279776612L : 4289974773L), a0.d(f0.o.u(sVar) ? 4290427578L : 4293717228L), d.b(sVar).R, sVar);
                    i3 &= -897;
                } else {
                    z2 = false;
                }
                i4 = i3;
                uaVar4 = uaVar2;
            } else {
                sVar.V();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                rVar4 = rVar2;
                i4 = i3;
                uaVar4 = uaVar2;
                z2 = false;
            }
            sVar.r();
            if (cVar != null) {
                sVar.c0(436163488);
                Object N = sVar.N();
                if (N == n.a) {
                    N = h1.k(sVar);
                }
                boolean z3 = z2;
                r d = q0.c.d(rVar4, z, (j) N, f8.b(0.0f, 6, 0L, z2), true, new k(2), cVar);
                rVar5 = rVar4;
                sVar.q(z3);
                rVar6 = d;
            } else {
                rVar5 = rVar4;
                sVar.c0(436442333);
                sVar.q(z2);
                rVar6 = rVar5;
            }
            uaVar3 = uaVar4;
            va.a(z, rVar6, false, uaVar3, sVar, ((i4 >> 3) & 14) | 48 | ((i4 << 9) & 458752));
            rVar3 = rVar5;
        } else {
            sVar.V();
            rVar3 = rVar2;
            uaVar3 = uaVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.c(rVar3, z, uaVar3, cVar, i, i2);
        }
    }
}
