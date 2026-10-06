package fd0;

import java.util.List;
import kc0.d10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class op implements aaShadow.a {
    public static final op a = new op();
    public static final List b = sy.d0Shadow.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mp.a, false)))).a(eVar, wVar);
        }
        return new d10(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d10 d10Var = (d10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d10Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mp.a, false)))).b(fVar, wVar, d10Var.a);
    }
}
