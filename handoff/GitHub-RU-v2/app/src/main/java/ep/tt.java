package ep;

import java.util.List;
import jo.q60;
import jo.r60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ttShadow implements aaShadow.a {
    public static final ttShadow a = new ttShadow();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r60 r60Var = null;
        while (eVar.r0(b) == 0) {
            r60Var = (r60) aa.c.b(aa.c.c(ut.a, true)).a(eVar, wVar);
        }
        return new q60(r60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q60 q60Var = (q60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q60Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(ut.a, true)).b(fVar, wVar, q60Var.a);
    }
}
