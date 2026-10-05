package gp;

import fp.w0;
import fp.x0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0.o("viewerCopilotAgentTasks", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x0 x0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                x0Var = (x0) aa.c.b(aa.c.c(w.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new w0(x0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w0 w0Var = (w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("viewerCopilotAgentTasks");
        aa.c.b(aa.c.c(w.a, false)).b(fVar, wVar, w0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w0Var.c);
    }
}
