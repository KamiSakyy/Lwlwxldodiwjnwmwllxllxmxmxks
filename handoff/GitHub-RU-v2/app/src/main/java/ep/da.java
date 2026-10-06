package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class da implements aaShadow.a {
    public static final da a = new da();
    public static final List b = sy.d0Shadow.n("filters");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(eaShadow.a, true))).a(eVar, wVar);
        }
        return new jo.df(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.df dfVar = (jo.df) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dfVar, "value");
        fVar.z0("filters");
        aa.c.b(aa.c.a(aa.c.c(eaShadow.a, true))).b(fVar, wVar, dfVar.a);
    }
}
