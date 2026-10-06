package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 implements aa.a {
    public static final r6 a = new r6();
    public static final List b = sy.d0Shadow.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, false)))).a(eVar, wVar);
        }
        return new j6(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j6 j6Var = (j6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j6Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, false)))).b(fVar, wVar, j6Var.a);
    }
}
