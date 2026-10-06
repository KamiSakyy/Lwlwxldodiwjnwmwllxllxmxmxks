package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n9 implements aaShadow.a {
    public static final n9 a = new n9();
    public static final List b = sy.d0.n("filters");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(o9.a, true))).a(eVar, wVar);
        }
        return new jn0.ge(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ge geVar = (jn0.ge) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(geVar, "value");
        fVar.z0("filters");
        aa.c.b(aa.c.a(aa.c.c(o9.a, true))).b(fVar, wVar, geVar.a);
    }
}
