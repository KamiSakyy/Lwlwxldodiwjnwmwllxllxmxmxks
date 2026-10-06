package ep;

import java.util.List;
import jo.od0;
import jo.pd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ly implements aaShadow.a {
    public static final ly a = new ly();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        od0 od0Var = null;
        while (eVar.r0(b) == 0) {
            od0Var = (od0) aa.c.b(aa.c.c(ky.a, false)).a(eVar, wVar);
        }
        return new pd0(od0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pd0 pd0Var = (pd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pd0Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(ky.a, false)).b(fVar, wVar, pd0Var.a);
    }
}
