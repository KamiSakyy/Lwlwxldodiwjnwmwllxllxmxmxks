package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 implements aa.a {
    public static final a6 a = new a6();
    public static final List b = sy.d0.o("id", "url", "runNumber", "workflow", "pendingDeploymentRequests", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        u10.a9 a9Var = null;
        u10.y8 y8Var = null;
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
                a9Var = (u10.a9) aa.c.c(z5.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                y8Var = (u10.y8) aa.c.c(x5.a, false).a(eVar, wVar);
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
        if (a9Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (y8Var == null) {
            k41.b.B(eVar, "pendingDeploymentRequests");
            throw null;
        }
        if (str3 != null) {
            return new u10.b9(str, str2, intValue, a9Var, y8Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.b9 b9Var = (u10.b9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b9Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, b9Var.b);
        fVar.z0("runNumber");
        fVar.z(b9Var.c);
        fVar.z0("workflow");
        aa.c.c(z5.a, false).b(fVar, wVar, b9Var.d);
        fVar.z0("pendingDeploymentRequests");
        aa.c.c(x5.a, false).b(fVar, wVar, b9Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b9Var.f);
    }
}
