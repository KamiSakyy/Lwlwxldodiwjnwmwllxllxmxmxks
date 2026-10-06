package fd0;

import java.util.List;
import kc0.iy;
import kc0.jy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class on implements aaShadow.a {
    public static final on a = new on();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jy jyVar = null;
        while (eVar.r0(b) == 0) {
            jyVar = (jy) aa.c.b(aa.c.c(pn.a, true)).a(eVar, wVar);
        }
        return new iy(jyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        iy iyVar = (iy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iyVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(pn.a, true)).b(fVar, wVar, iyVar.a);
    }
}
