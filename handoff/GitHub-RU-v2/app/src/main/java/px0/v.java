package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "notificationsPermalink"});

    public static ox0.w c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new ox0.w(str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.w wVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, wVar2.a);
        fVar.z0("notificationsPermalink");
        aa.c.i.b(fVar, wVar, wVar2.b);
    }
}
