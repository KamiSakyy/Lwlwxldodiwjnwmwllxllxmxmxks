package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 implements aaShadow.a {
    public static final a4 a = new a4();
    public static final List b = sy.d0Shadow.n("createDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.e6 e6Var = null;
        while (eVar.r0(b) == 0) {
            e6Var = (u10.e6) aa.c.b(aa.c.c(z3.a, false)).a(eVar, wVar);
        }
        return new u10.f6(e6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.f6 f6Var = (u10.f6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f6Var, "value");
        fVar.z0("createDiscussion");
        aa.c.b(aa.c.c(z3.a, false)).b(fVar, wVar, f6Var.a);
    }
}
