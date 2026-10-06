package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ei implements aaShadow.a {
    public static final ei a = new ei();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(di.a, false)))).a(eVar, wVar);
        }
        return new jo.vq(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vq vqVar = (jo.vq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vqVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(di.a, false)))).b(fVar, wVar, vqVar.a);
    }
}
