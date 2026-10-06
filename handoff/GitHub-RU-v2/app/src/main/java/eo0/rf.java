package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rf implements aaShadow.a {
    public static final rf a = new rf();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jn0.gn(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gn gnVar = (jn0.gn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gnVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, gnVar.a);
    }
}
