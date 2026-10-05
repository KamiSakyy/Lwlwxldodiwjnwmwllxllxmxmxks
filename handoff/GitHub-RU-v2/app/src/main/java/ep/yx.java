package ep;

import java.util.List;
import jo.wc0;
import jo.xc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yx implements aa.a {
    public static final yx a = new yx();
    public static final List b = sy.d0.n("issueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wc0 wc0Var = null;
        while (eVar.r0(b) == 0) {
            wc0Var = (wc0) aa.c.b(aa.c.c(xx.a, true)).a(eVar, wVar);
        }
        return new xc0(wc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xc0 xc0Var = (xc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xc0Var, "value");
        fVar.z0("issueComment");
        aa.c.b(aa.c.c(xx.a, true)).b(fVar, wVar, xc0Var.a);
    }
}
