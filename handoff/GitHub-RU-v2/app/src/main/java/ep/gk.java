package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gk implements aaShadow.a {
    public static final gk a = new gk();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.st stVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                stVar = (jo.st) aa.c.c(ik.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(hk.a, true)))).a(eVar, wVar);
            }
        }
        if (stVar != null) {
            return new jo.qt(stVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qt qtVar = (jo.qt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qtVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ik.a, false).b(fVar, wVar, qtVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(hk.a, true)))).b(fVar, wVar, qtVar.b);
    }
}
