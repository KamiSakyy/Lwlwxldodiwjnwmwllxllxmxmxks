package fd0;

import java.util.List;
import kc0.s30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jr implements aa.a {
    public static final jr a = new jr();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new s30(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s30 s30Var = (s30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s30Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, s30Var.a);
    }
}
