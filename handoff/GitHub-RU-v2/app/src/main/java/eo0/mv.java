package eo0;

import java.util.List;
import jn0.i90;
import jn0.k90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mv implements aaShadow.a {
    public static final mv a = new mv();
    public static final List b = sy.d0Shadow.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k90 k90Var = null;
        while (eVar.r0(b) == 0) {
            k90Var = (k90) aa.c.b(aa.c.c(ov.a, false)).a(eVar, wVar);
        }
        return new i90(k90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i90 i90Var = (i90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i90Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(ov.a, false)).b(fVar, wVar, i90Var.a);
    }
}
