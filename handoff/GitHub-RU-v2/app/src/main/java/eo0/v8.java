package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v8 implements aaShadow.a {
    public static final v8 a = new v8();
    public static final List b = sy.d0.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.id idVar = null;
        while (eVar.r0(b) == 0) {
            idVar = (jn0.id) aa.c.b(aa.c.c(x8.a, false)).a(eVar, wVar);
        }
        return new jn0.gd(idVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gd gdVar = (jn0.gd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gdVar, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(x8.a, false)).b(fVar, wVar, gdVar.a);
    }
}
