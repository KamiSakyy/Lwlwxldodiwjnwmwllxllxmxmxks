package ep;

import java.util.List;
import jo.df0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nz implements aaShadow.a {
    public static final nz a = new nz();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oz.a, true)))).a(eVar, wVar);
        }
        return new df0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        df0 df0Var = (df0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(df0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oz.a, true)))).b(fVar, wVar, df0Var.a);
    }
}
