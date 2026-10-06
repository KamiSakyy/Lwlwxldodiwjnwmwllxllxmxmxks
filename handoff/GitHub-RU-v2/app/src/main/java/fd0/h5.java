package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 implements aaShadow.a {
    public static final h5 a = new h5();
    public static final List b = sy.d0.n("deleteDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.b8 b8Var = null;
        while (eVar.r0(b) == 0) {
            b8Var = (kc0.b8) aa.c.b(aa.c.c(i5.a, false)).a(eVar, wVar);
        }
        return new kc0.a8(b8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.a8 a8Var = (kc0.a8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a8Var, "value");
        fVar.z0("deleteDiscussion");
        aa.c.b(aa.c.c(i5.a, false)).b(fVar, wVar, a8Var.a);
    }
}
