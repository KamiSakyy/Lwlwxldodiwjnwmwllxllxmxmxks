package ep;

import java.util.List;
import jo.xd0;
import jo.yd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class py implements aaShadow.a {
    public static final py a = new py();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yd0 yd0Var = null;
        while (eVar.r0(b) == 0) {
            yd0Var = (yd0) aa.c.b(aa.c.c(qy.a, true)).a(eVar, wVar);
        }
        return new xd0(yd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xd0 xd0Var = (xd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xd0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(qy.a, true)).b(fVar, wVar, xd0Var.a);
    }
}
