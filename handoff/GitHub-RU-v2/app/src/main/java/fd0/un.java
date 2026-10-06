package fd0;

import java.util.List;
import kc0.sy;
import kc0.ty;

/* loaded from: /home/user/work/p/classes4.dex */
public final class un implements aaShadow.a {
    public static final un a = new un();
    public static final List b = sy.d0Shadow.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ty tyVar = null;
        while (eVar.r0(b) == 0) {
            tyVar = (ty) aa.c.b(aa.c.c(vn.a, true)).a(eVar, wVar);
        }
        return new sy(tyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sy syVar = (sy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(syVar, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(vn.a, true)).b(fVar, wVar, syVar.a);
    }
}
