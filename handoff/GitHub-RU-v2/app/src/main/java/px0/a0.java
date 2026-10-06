package px0;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "runNumber", "workflow", "checkSuite"});

    public static ox0.b0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        ox0.q0 q0Var = null;
        ox0.b bVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                q0Var = (ox0.q0) aa.c.c(p0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                num = num2;
                bVar = (ox0.b) aa.c.c(b.a, false).a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "runNumber");
            throw null;
        }
        int intValue = num3.intValue();
        if (q0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (bVar != null) {
            return new ox0.b0(str, str2, intValue, q0Var, bVar);
        }
        k41.b.B(eVar, "checkSuite");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.b0 b0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b0Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, b0Var.b);
        fVar.z0("runNumber");
        fVar.z(b0Var.c);
        fVar.z0("workflow");
        aa.c.c(p0.a, false).b(fVar, wVar, b0Var.d);
        fVar.z0("checkSuite");
        aa.c.c(b.a, false).b(fVar, wVar, b0Var.e);
    }
}
