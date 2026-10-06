package ep;

import java.util.List;
import jo.kf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uz implements aaShadow.a {
    public static final uz a = new uz();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pz.a, true)))).a(eVar, wVar);
        }
        return new kf0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kf0 kf0Var = (kf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kf0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pz.a, true)))).b(fVar, wVar, kf0Var.a);
    }
}
