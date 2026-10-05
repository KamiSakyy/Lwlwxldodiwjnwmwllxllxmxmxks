package rn0;

import java.util.List;
import qn0.n2;
import vn0.h2;
import vn0.j2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "hasWorkflowDispatchTriggerForBranch"});

    public static n2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        eVar.s0();
        h2 c = j2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool != null) {
            return new n2(str, str2, bool.booleanValue(), c);
        }
        k41.b.B(eVar, "hasWorkflowDispatchTriggerForBranch");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n2 n2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n2Var.b);
        fVar.z0("hasWorkflowDispatchTriggerForBranch");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(n2Var.c));
        List list = j2.a;
        j2.d(fVar, wVar, n2Var.d);
    }
}
