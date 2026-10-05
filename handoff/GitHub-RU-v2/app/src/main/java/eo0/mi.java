package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mi implements aa.a {
    public static final mi a = new mi();
    public static final List b = sy.d0.o(new String[]{"mobilePushNotificationSchedules", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.yq yqVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                yqVar = (jn0.yq) aa.c.c(ki.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (yqVar == null) {
            k41.b.B(eVar, "mobilePushNotificationSchedules");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ar(yqVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ar arVar = (jn0.ar) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(arVar, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.c(ki.a, false).b(fVar, wVar, arVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, arVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, arVar.c);
    }
}
