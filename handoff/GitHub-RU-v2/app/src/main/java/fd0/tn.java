package fd0;

import java.util.List;
import kc0.ry;
import kc0.sy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tn implements aaShadow.a {
    public static final tn a = new tn();
    public static final List b = sy.d0.n("resolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        sy syVar = null;
        while (eVar.r0(b) == 0) {
            syVar = (sy) aa.c.b(aa.c.c(un.a, false)).a(eVar, wVar);
        }
        return new ry(syVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ry ryVar = (ry) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ryVar, "value");
        fVar.z0("resolveReviewThread");
        aa.c.b(aa.c.c(un.a, false)).b(fVar, wVar, ryVar.a);
    }
}
