package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fg implements aaShadow.a {
    public static final fg a = new fg();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(kg.a, true)))).a(eVar, wVar);
        }
        return new kc0.bo(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bo boVar = (kc0.bo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(boVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(kg.a, true)))).b(fVar, wVar, boVar.a);
    }
}
