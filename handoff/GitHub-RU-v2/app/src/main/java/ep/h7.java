package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h7 implements aa.a {
    public static final h7 a = new h7();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b7.a, true)))).a(eVar, wVar);
        }
        return new jo.xa(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xa xaVar = (jo.xa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xaVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b7.a, true)))).b(fVar, wVar, xaVar.a);
    }
}
