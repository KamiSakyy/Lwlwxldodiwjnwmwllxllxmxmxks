package fd0;

import java.util.List;
import kc0.f70;
import kc0.g70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rt implements aaShadow.a {
    public static final rt a = new rt();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g70 g70Var = null;
        while (eVar.r0(b) == 0) {
            g70Var = (g70) aa.c.b(aa.c.c(st.a, true)).a(eVar, wVar);
        }
        return new f70(g70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f70 f70Var = (f70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f70Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(st.a, true)).b(fVar, wVar, f70Var.a);
    }
}
