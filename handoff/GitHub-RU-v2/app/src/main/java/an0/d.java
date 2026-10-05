package an0;

import aa.w;
import java.util.List;
import sy.d0;
import zm0.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.o(new String[]{"repository", "resource"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zm0.l lVar = null;
        m mVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lVar = (zm0.l) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new zm0.e(lVar, mVar);
                }
                mVar = (m) aa.c.b(aa.c.c(l.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        zm0.e eVar = (zm0.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, eVar.a);
        fVar.z0("resource");
        aa.c.b(aa.c.c(l.a, true)).b(fVar, wVar, eVar.b);
    }
}
