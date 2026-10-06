package p20;

import java.util.List;
import u10.v70;
import u10.w70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eu implements aaShadow.a {
    public static final eu a = new eu();
    public static final List b = sy.d0Shadow.n("shortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v70 v70Var = null;
        while (eVar.r0(b) == 0) {
            v70Var = (v70) aa.c.b(aa.c.c(du.a, true)).a(eVar, wVar);
        }
        return new w70(v70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w70 w70Var = (w70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w70Var, "value");
        fVar.z0("shortcut");
        aa.c.b(aa.c.c(du.a, true)).b(fVar, wVar, w70Var.a);
    }
}
