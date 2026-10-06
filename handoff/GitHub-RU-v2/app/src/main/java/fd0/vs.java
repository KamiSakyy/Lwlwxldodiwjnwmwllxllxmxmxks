package fd0;

import java.util.List;
import kc0.a60;
import kc0.c60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vs implements aaShadow.a {
    public static final vs a = new vs();
    public static final List b = sy.d0.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c60 c60Var = null;
        while (eVar.r0(b) == 0) {
            c60Var = (c60) aa.c.b(aa.c.c(xs.a, false)).a(eVar, wVar);
        }
        return new a60(c60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a60 a60Var = (a60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a60Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(xs.a, false)).b(fVar, wVar, a60Var.a);
    }
}
