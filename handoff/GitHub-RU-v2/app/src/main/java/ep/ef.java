package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ef implements aaShadow.a {
    public static final ef a = new ef();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jf.a, true)))).a(eVar, wVar);
        }
        return new jo.rm(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rm rmVar = (jo.rm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rmVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jf.a, true)))).b(fVar, wVar, rmVar.a);
    }
}
