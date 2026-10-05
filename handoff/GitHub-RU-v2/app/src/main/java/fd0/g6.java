package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g6 implements aa.a {
    public static final g6 a = new g6();
    public static final List b = sy.d0.o(new String[]{"id", "url", "runNumber", "workflow", "pendingDeploymentRequests", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        kc0.i9 i9Var = null;
        kc0.g9 g9Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                i9Var = (kc0.i9) aa.c.c(f6.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                g9Var = (kc0.g9) aa.c.c(d6.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
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
        if (i9Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (g9Var == null) {
            k41.b.B(eVar, "pendingDeploymentRequests");
            throw null;
        }
        if (str3 != null) {
            return new kc0.j9(str, str2, intValue, i9Var, g9Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j9 j9Var = (kc0.j9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j9Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, j9Var.b);
        fVar.z0("runNumber");
        fVar.z(j9Var.c);
        fVar.z0("workflow");
        aa.c.c(f6.a, false).b(fVar, wVar, j9Var.d);
        fVar.z0("pendingDeploymentRequests");
        aa.c.c(d6.a, false).b(fVar, wVar, j9Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j9Var.f);
    }
}
