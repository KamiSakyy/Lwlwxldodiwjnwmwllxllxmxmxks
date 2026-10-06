package p20;

import java.util.List;
import u10.p10;
import u10.q10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wp implements aaShadow.a {
    public static final wp a = new wp();
    public static final List b = sy.d0Shadow.n("unblockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q10 q10Var = null;
        while (eVar.r0(b) == 0) {
            q10Var = (q10) aa.c.b(aa.c.c(xp.a, false)).a(eVar, wVar);
        }
        return new p10(q10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p10 p10Var = (p10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p10Var, "value");
        fVar.z0("unblockUserFromOrganization");
        aa.c.b(aa.c.c(xp.a, false)).b(fVar, wVar, p10Var.a);
    }
}
