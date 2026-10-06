package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k7 implements aaShadow.a {
    public static final k7 a = new k7();
    public static final List b = sy.d0Shadow.o("id", "url", "runNumber", "workflow", "pendingDeploymentRequests", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        jo.za zaVar = null;
        jo.xa xaVar = null;
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
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                zaVar = (jo.za) aa.c.c(j7.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                xaVar = (jo.xa) aa.c.c(h7.a, false).a(eVar, wVar);
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
        if (zaVar == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (xaVar == null) {
            k41.b.B(eVar, "pendingDeploymentRequests");
            throw null;
        }
        if (str3 != null) {
            return new jo.ab(str, str2, intValue, zaVar, xaVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ab abVar = (jo.ab) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(abVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, abVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, abVar.b);
        fVar.z0("runNumber");
        fVar.z(abVar.c);
        fVar.z0("workflow");
        aa.c.c(j7.a, false).b(fVar, wVar, abVar.d);
        fVar.z0("pendingDeploymentRequests");
        aa.c.c(h7.a, false).b(fVar, wVar, abVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, abVar.f);
    }
}
