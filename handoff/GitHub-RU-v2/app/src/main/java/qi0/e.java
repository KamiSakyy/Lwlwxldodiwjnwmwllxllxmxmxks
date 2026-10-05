package qi0;

import aa.w;
import java.util.List;
import k71.k;
import pi0.h;
import pi0.i;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        i iVar = null;
        while (eVar.r0(b) == 0) {
            iVar = (i) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
        }
        return new h(iVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        h hVar = (h) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(hVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, hVar.a);
    }
}
