package fd0;

import java.util.List;
import kc0.b40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class or implements aa.a {
    public static final or a = new or();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new b40(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b40 b40Var = (b40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b40Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, b40Var.a);
    }
}
