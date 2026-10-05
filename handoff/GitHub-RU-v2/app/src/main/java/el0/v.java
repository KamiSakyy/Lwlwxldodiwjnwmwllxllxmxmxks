package el0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "requiredStatusChecks", "actionRequiredWorkflowRunCount", "commits"});

    public static dl0.c0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        dl0.e0 e0Var = null;
        Integer num = null;
        dl0.t tVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                e0Var = (dl0.e0) aa.c.c(x.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                tVar = (dl0.t) aa.c.c(n.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (e0Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "actionRequiredWorkflowRunCount");
            throw null;
        }
        int intValue = num.intValue();
        if (tVar != null) {
            return new dl0.c0(str, e0Var, intValue, tVar);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, dl0.c0 c0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, c0Var.a);
        fVar.z0("requiredStatusChecks");
        aa.c.c(x.a, false).b(fVar, wVar, c0Var.b);
        fVar.z0("actionRequiredWorkflowRunCount");
        fVar.z(c0Var.c);
        fVar.z0("commits");
        aa.c.c(n.a, false).b(fVar, wVar, c0Var.d);
    }
}
