package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sk implements aa.a {
    public static final sk a = new sk();
    public static final List b = sy.d0.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.au auVar = null;
        while (eVar.r0(b) == 0) {
            auVar = (jn0.au) aa.c.b(aa.c.c(tk.a, true)).a(eVar, wVar);
        }
        return new jn0.zt(auVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.zt ztVar = (jn0.zt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ztVar, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(tk.a, true)).b(fVar, wVar, ztVar.a);
    }
}
