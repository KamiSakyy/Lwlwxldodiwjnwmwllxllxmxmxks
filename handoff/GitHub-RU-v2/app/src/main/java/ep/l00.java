package ep;

import java.util.List;
import jo.ng0;
import jo.pg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l00 implements aaShadow.a {
    public static final l00 a = new l00();
    public static final List b = sy.d0.n("updateSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pg0 pg0Var = null;
        while (eVar.r0(b) == 0) {
            pg0Var = (pg0) aa.c.b(aa.c.c(n00.a, false)).a(eVar, wVar);
        }
        return new ng0(pg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ng0 ng0Var = (ng0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ng0Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(n00.a, false)).b(fVar, wVar, ng0Var.a);
    }
}
