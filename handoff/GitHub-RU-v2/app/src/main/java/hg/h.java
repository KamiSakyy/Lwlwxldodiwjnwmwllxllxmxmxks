package hg;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.menu.d;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import g3.z;
import java.util.List;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(r rVar, int i, String str, d.C0009d c0009d, j71.c cVar, List list, s sVar, int i2) {
        r rVar2;
        f1 f1Var;
        s sVar2 = sVar;
        k71.k.g(str, "rowTitle");
        k71.k.g(c0009d, "selectedItem");
        k71.k.g(cVar, "onMenuItemSelect");
        sVar2.e0(-554705036);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= sVar2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        int i4 = i3 | (sVar2.h(c0009d) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= sVar2.h(cVar) ? 16384 : 8192;
        }
        int i5 = i4 | (sVar2.h(list) ? 131072 : 65536);
        if (sVar2.S(i5 & 1, (i5 & 74899) != 74898)) {
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = n.a;
            if (N == iVar) {
                N = t.B(Boolean.FALSE);
                sVar2.n0(N);
            }
            f1 f1Var2 = (f1) N;
            r rVar3 = o.a;
            r e = p2.e(rVar3, 1.0f);
            l2 a = j2.a(l.g, w1.c.B, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c);
            ub.b(str, androidx.compose.foundation.layout.b.B(rVar3, ih.a.n, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar2).d, ih.d.b(sVar2).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar, (i5 >> 6) & 14, 0, 131068);
            sVar2 = sVar;
            String p0 = i4.p0(i, sVar2);
            boolean booleanValue = ((Boolean) f1Var2.getValue()).booleanValue();
            String str2 = c0009d.a;
            boolean z = (i5 & 57344) == 16384;
            Object N2 = sVar2.N();
            if (z || N2 == iVar) {
                f1Var = f1Var2;
                N2 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 14);
                sVar2.n0(N2);
            } else {
                f1Var = f1Var2;
            }
            j71.c cVar2 = (j71.c) N2;
            Object N3 = sVar2.N();
            Object obj = N3;
            if (N3 == iVar) {
                de.f fVar2 = new de.f(f1Var, 6);
                sVar2.n0(fVar2);
                obj = fVar2;
            }
            com.github.rudroid.uitoolkit.menu.l.a(null, booleanValue, list, str2, cVar2, (j71.a) obj, 0L, 0L, false, r1.i.d(1590288150, new hf.f(p0, f1Var, c0009d, 1), sVar2), sVar2, ((i5 >> 9) & 896) | 805502976, 449);
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new x0(rVar2, i, str, c0009d, cVar, list, i2, 7);
        }
    }
}
