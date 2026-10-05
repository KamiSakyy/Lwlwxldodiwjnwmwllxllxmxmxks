package qg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.uitoolkit.f1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final void a(w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(1939581533);
        int i2 = i | 6;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            float f = ih.a.F;
            w1.r rVar2 = w1.o.a;
            w1.r b = p2.b(rVar2, f, 0.0f, 2);
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, b);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, d);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            sVar2 = sVar;
            f1.a(p2.o(rVar2, 26), null, 2, ih.d.b(sVar).F, sVar2, 390, 2);
            sVar2.q(true);
            rVar = rVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.layout.r(i, 18, rVar);
        }
    }
}
