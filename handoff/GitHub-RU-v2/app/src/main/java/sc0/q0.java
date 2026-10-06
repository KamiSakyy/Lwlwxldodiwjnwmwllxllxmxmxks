package sc0;

import gn0.l2;
import gn0.r2;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "status", "conclusion", "duration", "rerunnable", "artifacts", "workflowRun", "failedCheckRuns", "runningCheckRuns", "skippedCheckRuns", "neutralCheckRuns", "successfulCheckRuns"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0023. Please report as an issue. */
    public static rc0.b1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        Object obj;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        r2 r2Var = null;
        l2 l2Var = null;
        Boolean bool2 = null;
        rc0.u0 u0Var = null;
        rc0.f1Shadow f1Var = null;
        rc0.x0 x0Var = null;
        rc0.c1 c1Var = null;
        rc0.d1 d1Var = null;
        rc0.y0 y0Var = null;
        rc0.e1 e1Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    Integer num3 = num2;
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    r2.Companion.getClass();
                    Iterator it = r2.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((r2) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    r2Var = (r2) obj;
                    if (r2Var == null) {
                        r2Var = r2.t;
                    }
                    num2 = num3;
                    bool2 = bool;
                case 2:
                    l2Var = (l2) aa.c.b(hn0.a.b).a(eVar, wVar);
                case 3:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool2 = bool;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                case 5:
                    num = num2;
                    u0Var = (rc0.u0) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 6:
                    num = num2;
                    f1Var = (rc0.f1Shadow) aa.c.b(aa.c.c(u0.a, true)).a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    x0Var = (rc0.x0) aa.c.b(aa.c.c(m0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num2;
                    c1Var = (rc0.c1) aa.c.b(aa.c.c(r0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 9:
                    num = num2;
                    d1Var = (rc0.d1) aa.c.b(aa.c.c(s0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 10:
                    num = num2;
                    y0Var = (rc0.y0) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 11:
                    num = num2;
                    e1Var = (rc0.e1) aa.c.b(aa.c.c(t0.a, false)).a(eVar, wVar);
                    num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (r2Var == null) {
                k41.b.B(eVar, "status");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "duration");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num4.intValue();
            if (bool3 != null) {
                return new rc0.b1(str, r2Var, l2Var, intValue, bool3.booleanValue(), u0Var, f1Var, x0Var, c1Var, d1Var, y0Var, e1Var);
            }
            k41.b.B(eVar, "rerunnable");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, rc0.b1 b1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, b1Var.a);
        fVar.z0("status");
        fVar.I(b1Var.b.r);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, b1Var.c);
        fVar.z0("duration");
        fVar.z(b1Var.d);
        fVar.z0("rerunnable");
        f4Shadow.C(b1Var.e, aa.c.f, fVar, wVar, "artifacts");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, b1Var.f);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(u0.a, true)).b(fVar, wVar, b1Var.g);
        fVar.z0("failedCheckRuns");
        aa.c.b(aa.c.c(m0.a, false)).b(fVar, wVar, b1Var.h);
        fVar.z0("runningCheckRuns");
        aa.c.b(aa.c.c(r0.a, false)).b(fVar, wVar, b1Var.i);
        fVar.z0("skippedCheckRuns");
        aa.c.b(aa.c.c(s0.a, false)).b(fVar, wVar, b1Var.j);
        fVar.z0("neutralCheckRuns");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, b1Var.k);
        fVar.z0("successfulCheckRuns");
        aa.c.b(aa.c.c(t0.a, false)).b(fVar, wVar, b1Var.l);
    }
}
