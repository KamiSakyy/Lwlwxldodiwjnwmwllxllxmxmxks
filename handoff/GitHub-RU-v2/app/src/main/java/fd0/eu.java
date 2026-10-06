package fd0;

import java.util.List;
import kc0.w70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eu implements aaShadow.a {
    public static final eu a = new eu();
    public static final List b = sy.d0.n("viewerCanPush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new w70(bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanPush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w70 w70Var = (w70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w70Var, "value");
        fVar.z0("viewerCanPush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(w70Var.a));
    }
}
