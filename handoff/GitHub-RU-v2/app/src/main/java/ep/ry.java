package ep;

import java.util.List;
import jo.be0;
import jo.de0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ry implements aaShadow.a {
    public static final ry a = new ry();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        de0 de0Var = null;
        while (eVar.r0(b) == 0) {
            de0Var = (de0) aa.c.b(aa.c.c(ty.a, false)).a(eVar, wVar);
        }
        return new be0(de0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        be0 be0Var = (be0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(be0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(ty.a, false)).b(fVar, wVar, be0Var.a);
    }
}
