package gp;

import fp.c1;
import fp.f1;
import fp.h1;
import fp.k1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0.o("id", "defaultBranchRef", "isCopilotAgentEnabled", "owner", "viewerCodingAgents", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c1 c1Var = null;
        Boolean bool = null;
        f1 f1Var = null;
        k1 k1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                c1Var = (c1) aa.c.b(aa.c.c(y.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.k.a(eVar, wVar);
            } else if (r0 == 3) {
                f1Var = (f1) aa.c.c(b0.a, true).a(eVar, wVar);
            } else if (r0 == 4) {
                k1Var = (k1) aa.c.b(aa.c.c(g0.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (f1Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new h1(str, c1Var, bool, f1Var, k1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h1 h1Var = (h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h1Var.a);
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(y.a, true)).b(fVar, wVar, h1Var.b);
        fVar.z0("isCopilotAgentEnabled");
        aa.c.k.b(fVar, wVar, h1Var.c);
        fVar.z0("owner");
        aa.c.c(b0.a, true).b(fVar, wVar, h1Var.d);
        fVar.z0("viewerCodingAgents");
        aa.c.b(aa.c.c(g0.a, false)).b(fVar, wVar, h1Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h1Var.f);
    }
}
