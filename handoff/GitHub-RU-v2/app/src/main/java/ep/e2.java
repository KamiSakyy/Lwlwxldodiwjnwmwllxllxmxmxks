package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 implements aaShadow.a {
    public static final e2 a = new e2();
    public static final List b = sy.d0.n("blockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.n3 n3Var = null;
        while (eVar.r0(b) == 0) {
            n3Var = (jo.n3) aa.c.b(aa.c.c(d2.a, false)).a(eVar, wVar);
        }
        return new jo.p3(n3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.p3 p3Var = (jo.p3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p3Var, "value");
        fVar.z0("blockUserFromOrganization");
        aa.c.b(aa.c.c(d2.a, false)).b(fVar, wVar, p3Var.a);
    }
}
