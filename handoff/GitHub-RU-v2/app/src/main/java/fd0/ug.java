package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ug implements aaShadow.a {
    public static final ug a = new ug();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jg.a, true)))).a(eVar, wVar);
        }
        return new kc0.so(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.so soVar = (kc0.so) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(soVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jg.a, true)))).b(fVar, wVar, soVar.a);
    }
}
