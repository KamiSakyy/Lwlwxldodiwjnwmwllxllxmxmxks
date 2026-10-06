package ep;

import java.util.List;
import jo.ce0;
import jo.de0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ty implements aaShadow.a {
    public static final ty a = new ty();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ce0 ce0Var = null;
        while (eVar.r0(b) == 0) {
            ce0Var = (ce0) aa.c.b(aa.c.c(sy.a, false)).a(eVar, wVar);
        }
        return new de0(ce0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        de0 de0Var = (de0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(de0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(sy.a, false)).b(fVar, wVar, de0Var.a);
    }
}
