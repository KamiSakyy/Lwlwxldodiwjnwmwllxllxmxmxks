package gh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import java.util.Iterator;
import java.util.List;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(r rVar, List list, List list2, j71.e eVar, s sVar, int i) {
        r rVar2;
        int i2;
        k.g(list, "options");
        k.g(eVar, "onOptionSelect");
        sVar.e0(-411392048);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i2 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i2 = i;
        }
        int i3 = i2 | (sVar.h(list) ? 32 : 16) | (sVar.h(list2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= sVar.h(eVar) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (sVar.S(i4 & 1, (i4 & 9363) != 9362)) {
            r c = q0.c.c(rVar2);
            e0 a = c0.a(l.c, w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c2 = w1.a.c(sVar, c);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, a);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c2);
            sVar.c0(1195803054);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                r x = androidx.compose.foundation.layout.b.x(o.a, ih.a.n);
                boolean contains = list2.contains(fVar2.a);
                boolean f = ((i4 & 7168) == 2048) | sVar.f(fVar2);
                Object N = sVar.N();
                if (f || N == n.a) {
                    N = new fg.d(2, eVar, fVar2);
                    sVar.n0(N);
                }
                e.a(x, fVar2, (j71.c) N, contains, sVar, 6);
                sVar.c0(-1853257614);
                sVar.q(false);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(rVar2, list, list2, eVar, i, 20);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
