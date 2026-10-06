package fd0;

import java.util.List;
import kc0.ea0;
import kc0.fa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uv implements aaShadow.a {
    public static final uv a = new uv();
    public static final List b = sy.d0Shadow.n("updateUserMobileTimeZone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fa0 fa0Var = null;
        while (eVar.r0(b) == 0) {
            fa0Var = (fa0) aa.c.b(aa.c.c(vv.a, false)).a(eVar, wVar);
        }
        return new ea0(fa0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ea0 ea0Var = (ea0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ea0Var, "value");
        fVar.z0("updateUserMobileTimeZone");
        aa.c.b(aa.c.c(vv.a, false)).b(fVar, wVar, ea0Var.a);
    }
}
