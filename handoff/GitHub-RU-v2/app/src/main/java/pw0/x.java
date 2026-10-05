package pw0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "requiredStatusChecks", "actionRequiredWorkflowRunCount", "commits"});

    public static ow0.g0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ow0.i0 i0Var = null;
        Integer num = null;
        ow0.x xVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                i0Var = (ow0.i0) aa.c.c(z.a, false).a(eVar, wVar);
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
                xVar = (ow0.x) aa.c.c(p.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (i0Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "actionRequiredWorkflowRunCount");
            throw null;
        }
        int intValue = num.intValue();
        if (xVar != null) {
            return new ow0.g0(str, i0Var, intValue, xVar);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ow0.g0 g0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, g0Var.a);
        fVar.z0("requiredStatusChecks");
        aa.c.c(z.a, false).b(fVar, wVar, g0Var.b);
        fVar.z0("actionRequiredWorkflowRunCount");
        fVar.z(g0Var.c);
        fVar.z0("commits");
        aa.c.c(p.a, false).b(fVar, wVar, g0Var.d);
    }
}
