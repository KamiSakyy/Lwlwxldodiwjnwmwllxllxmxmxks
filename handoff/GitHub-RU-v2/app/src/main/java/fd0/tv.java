package fd0;

import java.util.List;
import kc0.aa0;
import kc0.ba0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tv implements aaShadow.a {
    public static final tv a = new tv();
    public static final List b = sy.d0Shadow.n("subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        aa0 aa0Var = null;
        while (eVar.r0(b) == 0) {
            aa0Var = (aa0) aa.c.b(aa.c.c(sv.a, true)).a(eVar, wVar);
        }
        return new ba0(aa0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ba0 ba0Var = (ba0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ba0Var, "value");
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(sv.a, true)).b(fVar, wVar, ba0Var.a);
    }
}
