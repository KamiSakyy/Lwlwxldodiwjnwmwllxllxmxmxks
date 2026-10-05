package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 implements aa.a {
    public static final x6 a = new x6();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c7.a, true)))).a(eVar, wVar);
        }
        return new jo.ma(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ma maVar = (jo.ma) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(maVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c7.a, true)))).b(fVar, wVar, maVar.a);
    }
}
