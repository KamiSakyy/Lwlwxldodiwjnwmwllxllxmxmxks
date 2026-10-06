package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 implements aaShadow.a {
    public static final a6 a = new a6();
    public static final List b = sy.d0Shadow.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y5.a, false)))).a(eVar, wVar);
        }
        return new jo.a9(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a9 a9Var = (jo.a9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a9Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y5.a, false)))).b(fVar, wVar, a9Var.a);
    }
}
