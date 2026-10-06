package zg;

import aa.u0;
import android.content.Context;
import androidx.compose.runtime.v1;
import f1.ub;
import g3.q0;
import java.util.List;
import java.util.Map;
import jn0.az;
import jn0.bz;
import jn0.cz;
import jn0.eg;
import jn0.fg;
import jn0.hg;
import jn0.ig;
import jn0.jg;
import jn0.uy;
import jn0.vy;
import jn0.wy;
import jn0.xy;
import xt0.t0;
import xt0.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.e {
    public final /* synthetic */ int r;

    public final Object s(Object obj, Object obj2) {

        Object r4 = null;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, w1.o.a);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    ub.b("Custom headline", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, ih.d.f(sVar).x, sVar, 6, 384, 126974);
                    ub.b("Custom title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (q0) null, sVar, 6, 384, 258046);
                    sVar.q(true);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ub.c(com.github.rudroid.uitoolkit.utils.d0.a((Context) sVar2.j(w2.j0.b), "#Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi in dictum arcu, quis curs", 2, null, sVar2, 24), (w1.r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (Map) null, (j71.c) null, (q0) null, sVar2, 0, 384, 520190);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
            case 2:
                w1.r rVar = (w1.r) obj;
                j71.a aVar = (j71.a) obj2;
                k71.k.g(rVar, "$this$applyIfNotNull");
                k71.k.g(aVar, "it");
                return f0.o.m(rVar, false, (String) null, (d3.k) null, new qd.g(24, aVar), 15);
            case 3:
                zo0.a aVar2 = (zo0.a) obj;
                String str = (String) obj2;
                k71.k.g(aVar2, "id");
                k71.k.g(str, "after");
                return new jg(aVar2.a, aVar2.b, aVar2.c, new u0(str), 16);
            case 4:
                eg egVar = (eg) obj;
                List list = (List) obj2;
                k71.k.g(egVar, "data");
                k71.k.g(list, "nodes");
                ig igVar = egVar.a;
                hg hgVar = null;
                if (igVar != null) {
                    fg fgVar = igVar.b;
                    if (fgVar != null) {
                        hg hgVar2 = fgVar.c;
                        if (hgVar2 != null) {
                            x0 x0Var = hgVar2.c;
                            xt0.f0 f0Var = x0Var.l;
                            hgVar = hg.a(hgVar2, x0.a(x0Var, f0Var != null ? new xt0.f0(new t0(f0Var.a.a, list)) : null, (xt0.j0) null, 30719));
                        }
                        hgVar = fg.a(fgVar, hgVar);
                    }
                    hgVar = ig.a(igVar, hgVar);
                }
                return eg.a(egVar, hgVar);
            case 5:
                zo0.b bVar = (zo0.b) obj;
                String str2 = (String) obj2;
                k71.k.g(bVar, "refComparisonFilesChangedParameters");
                k71.k.g(str2, "after");
                return new cz(new u0(str2), bVar.a, bVar.b, bVar.c, bVar.d);
            default:
                wy wyVar = (wy) obj;
                List list2 = (List) obj2;
                k71.k.g(wyVar, "data");
                k71.k.g(list2, "nodes");
                bz bzVar = wyVar.a;
                if (bzVar != null) {
                    vy vyVar = bzVar.b;
                    if (vyVar != null) {
                        uy uyVar = vyVar.b;
                        if (uyVar != null) {
                            xy xyVar = uyVar.b;
                            r4 = uy.a(uyVar, xyVar != null ? xy.a(xyVar, new az(xyVar.d.a, list2)) : null);
                        }
                        r4 = vy.a(vyVar, r4);
                    }
                    r4 = bz.a(bzVar, r4);
                }
                return wy.a(wyVar, r4);
        }
    }
    public m(int p1) {
    }
}
