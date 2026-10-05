package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uj implements aa.a {
    public static final uj a = new uj();
    public static final List b = sy.d0.o("mobilePushNotificationSchedules", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.vs vsVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vsVar = (jo.vs) aa.c.c(sj.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (vsVar == null) {
            k41.b.B(eVar, "mobilePushNotificationSchedules");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.xs(vsVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xs xsVar = (jo.xs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xsVar, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.c(sj.a, false).b(fVar, wVar, xsVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xsVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xsVar.c);
    }
}
