package ay;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "requiredStatusChecks", "actionRequiredWorkflowRunCount", "commits"});

    public static zx.v0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        zx.x0 x0Var = null;
        Integer num = null;
        zx.m0 m0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                x0Var = (zx.x0) aa.c.c(i0.a, false).a(eVar, wVar);
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
                m0Var = (zx.m0) aa.c.c(y.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (x0Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "actionRequiredWorkflowRunCount");
            throw null;
        }
        int intValue = num.intValue();
        if (m0Var != null) {
            return new zx.v0(str, x0Var, intValue, m0Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, zx.v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, v0Var.a);
        fVar.z0("requiredStatusChecks");
        aa.c.c(i0.a, false).b(fVar, wVar, v0Var.b);
        fVar.z0("actionRequiredWorkflowRunCount");
        fVar.z(v0Var.c);
        fVar.z0("commits");
        aa.c.c(y.a, false).b(fVar, wVar, v0Var.d);
    }
}
