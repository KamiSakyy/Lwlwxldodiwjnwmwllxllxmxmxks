package jl0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.n("clientMutationId");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new il0.h(str);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        il0.h hVar = (il0.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, hVar.a);
    }
}
