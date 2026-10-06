package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u8 implements aa.a {
    public static final u8 a = new u8();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t8.a, false)))).a(eVar, wVar);
        }
        return new o8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o8 o8Var = (o8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t8.a, false)))).b(fVar, wVar, o8Var.a);
    }
}
