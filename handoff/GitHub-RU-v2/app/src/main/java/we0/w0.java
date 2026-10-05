package we0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements aa.a {
    public static final w0 a = new w0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(m0.a, false)))).a(eVar, wVar);
        }
        return new t(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t tVar = (t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(m0.a, false)))).b(fVar, wVar, tVar.a);
    }
}
