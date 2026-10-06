package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fl implements aaShadow.a {
    public static final fl a = new fl();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ru ruVar = null;
        while (eVar.r0(b) == 0) {
            ruVar = (jn0.ru) aa.c.b(aa.c.c(el.a, true)).a(eVar, wVar);
        }
        return new jn0.su(ruVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.su suVar = (jn0.su) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(suVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(el.a, true)).b(fVar, wVar, suVar.a);
    }
}
