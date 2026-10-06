package fd0;

import java.util.List;
import kc0.ay;
import kc0.yx;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jn implements aaShadow.a {
    public static final jn a = new jn();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ay ayVar = null;
        while (eVar.r0(b) == 0) {
            ayVar = (ay) aa.c.b(aa.c.c(ln.a, false)).a(eVar, wVar);
        }
        return new yx(ayVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        yx yxVar = (yx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yxVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ln.a, false)).b(fVar, wVar, yxVar.a);
    }
}
