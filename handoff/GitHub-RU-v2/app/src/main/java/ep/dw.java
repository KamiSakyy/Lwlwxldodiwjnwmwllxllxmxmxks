package ep;

import java.util.List;
import jo.ca0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dwShadow implements aaShadow.a {
    public static final dwShadow a = new dwShadow();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new ca0(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ca0 ca0Var = (ca0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ca0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, ca0Var.a);
    }
}
