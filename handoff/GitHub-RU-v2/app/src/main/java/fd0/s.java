package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class s implements aaShadow.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.n("addReaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.b0 b0Var = null;
        while (eVar.r0(b) == 0) {
            b0Var = (kc0.b0) aa.c.b(aa.c.c(r.a, false)).a(eVar, wVar);
        }
        return new kc0.d0(b0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.d0 d0Var = (kc0.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("addReaction");
        aa.c.b(aa.c.c(r.a, false)).b(fVar, wVar, d0Var.a);
    }
}
