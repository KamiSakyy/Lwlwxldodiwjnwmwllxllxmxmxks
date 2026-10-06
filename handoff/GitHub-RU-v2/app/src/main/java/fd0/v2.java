package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v2 implements aaShadow.a {
    public static final v2 a = new v2();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.o4 o4Var = null;
        while (eVar.r0(b) == 0) {
            o4Var = (kc0.o4) aa.c.b(aa.c.c(x2.a, false)).a(eVar, wVar);
        }
        return new kc0.l4(o4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.l4 l4Var = (kc0.l4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(x2.a, false)).b(fVar, wVar, l4Var.a);
    }
}
