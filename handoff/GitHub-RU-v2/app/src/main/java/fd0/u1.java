package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 implements aaShadow.a {
    public static final u1 a = new u1();
    public static final List b = sy.d0.n("blockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.z2 z2Var = null;
        while (eVar.r0(b) == 0) {
            z2Var = (kc0.z2) aa.c.b(aa.c.c(t1.a, false)).a(eVar, wVar);
        }
        return new kc0.b3(z2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.b3 b3Var = (kc0.b3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b3Var, "value");
        fVar.z0("blockUserFromOrganization");
        aa.c.b(aa.c.c(t1.a, false)).b(fVar, wVar, b3Var.a);
    }
}
