package fd0;

import java.util.List;
import kc0.r60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jt implements aaShadow.a {
    public static final jt a = new jt();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gt.a, false)))).a(eVar, wVar);
        }
        return new r60(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r60 r60Var = (r60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r60Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gt.a, false)))).b(fVar, wVar, r60Var.a);
    }
}
