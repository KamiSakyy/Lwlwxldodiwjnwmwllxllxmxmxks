package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cg implements aa.a {
    public static final cg a = new cg();
    public static final List b = sy.d0.o("mobilePushNotificationSchedules", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.rn rnVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rnVar = (u10.rn) aa.c.c(ag.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (rnVar == null) {
            k41.b.B(eVar, "mobilePushNotificationSchedules");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.tn(rnVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.tn tnVar = (u10.tn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tnVar, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.c(ag.a, false).b(fVar, wVar, tnVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tnVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tnVar.c);
    }
}
