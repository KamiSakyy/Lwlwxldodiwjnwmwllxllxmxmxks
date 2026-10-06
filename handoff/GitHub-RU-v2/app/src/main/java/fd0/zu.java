package fd0;

import java.util.List;
import kc0.m80;
import kc0.t80;
import kc0.v80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zu implements aaShadow.a {
    public static final zu a = new zu();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m80 m80Var = null;
        t80 t80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m80Var = (m80) aa.c.b(aa.c.c(ru.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new v80(m80Var, t80Var);
                }
                t80Var = (t80) aa.c.b(aa.c.c(xu.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v80 v80Var = (v80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v80Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ru.a, true)).b(fVar, wVar, v80Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(xu.a, false)).b(fVar, wVar, v80Var.b);
    }
}
