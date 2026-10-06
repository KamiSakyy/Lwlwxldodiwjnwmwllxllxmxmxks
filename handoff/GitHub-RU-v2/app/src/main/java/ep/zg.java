package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zg implements aaShadow.a {
    public static final zg a = new zg();
    public static final List b = sy.d0.o("notificationSettings", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.dp dpVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dpVar = (jo.dp) aa.c.b(aa.c.c(yg.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.ep(dpVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ep epVar = (jo.ep) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(epVar, "value");
        fVar.z0("notificationSettings");
        aa.c.b(aa.c.c(yg.a, false)).b(fVar, wVar, epVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, epVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, epVar.c);
    }
}
