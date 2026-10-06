package fd0;

import java.util.List;
import kc0.rx;
import kc0.vx;

/* loaded from: /home/user/work/p/classes4.dex */
public final class en implements aaShadow.a {
    public static final en a = new en();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vx vxVar = null;
        while (eVar.r0(b) == 0) {
            vxVar = (vx) aa.c.b(aa.c.c(in.a, false)).a(eVar, wVar);
        }
        return new rx(vxVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rx rxVar = (rx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rxVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(in.a, false)).b(fVar, wVar, rxVar.a);
    }
}
