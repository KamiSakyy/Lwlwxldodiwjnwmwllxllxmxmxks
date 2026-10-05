package fd0;

import java.util.List;
import kc0.n30;
import kc0.o30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gr implements aa.a {
    public static final gr a = new gr();
    public static final List b = sy.d0.n("unblockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o30 o30Var = null;
        while (eVar.r0(b) == 0) {
            o30Var = (o30) aa.c.b(aa.c.c(hr.a, false)).a(eVar, wVar);
        }
        return new n30(o30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n30 n30Var = (n30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n30Var, "value");
        fVar.z0("unblockUserFromOrganization");
        aa.c.b(aa.c.c(hr.a, false)).b(fVar, wVar, n30Var.a);
    }
}
