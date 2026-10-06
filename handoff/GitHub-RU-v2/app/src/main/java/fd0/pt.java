package fd0;

import java.util.List;
import kc0.b70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pt implements aaShadow.a {
    public static final pt a = new pt();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new b70(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b70 b70Var = (b70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b70Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, b70Var.a);
    }
}
