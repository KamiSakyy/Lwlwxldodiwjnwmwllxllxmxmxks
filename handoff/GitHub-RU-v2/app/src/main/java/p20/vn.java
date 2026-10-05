package p20;

import java.util.List;
import u10.sy;
import u10.ty;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vn implements aa.a {
    public static final vn a = new vn();
    public static final List b = sy.d0.n("labelableRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        sy syVar = null;
        while (eVar.r0(b) == 0) {
            syVar = (sy) aa.c.b(aa.c.c(un.a, true)).a(eVar, wVar);
        }
        return new ty(syVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ty tyVar = (ty) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tyVar, "value");
        fVar.z0("labelableRecord");
        aa.c.b(aa.c.c(un.a, true)).b(fVar, wVar, tyVar.a);
    }
}
