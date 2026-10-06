package ep;

import java.util.List;
import jo.db0;
import jo.hb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uw implements aaShadow.a {
    public static final uw a = new uw();
    public static final List b = sy.d0Shadow.n("unmarkFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        hb0 hb0Var = null;
        while (eVar.r0(b) == 0) {
            hb0Var = (hb0) aa.c.b(aa.c.c(ywShadow.a, false)).a(eVar, wVar);
        }
        return new db0(hb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        db0 db0Var = (db0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(db0Var, "value");
        fVar.z0("unmarkFileAsViewed");
        aa.c.b(aa.c.c(ywShadow.a, false)).b(fVar, wVar, db0Var.a);
    }
}
