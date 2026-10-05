package to;

import aa.w;
import java.util.List;
import so.u;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "databaseId", "updatesChannel"});

    public static u c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new u(num, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, u uVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, uVar.a);
        fVar.z0("databaseId");
        aa.c.b(tp.a.a).b(fVar, wVar, uVar.b);
        fVar.z0("updatesChannel");
        aa.c.i.b(fVar, wVar, uVar.c);
    }
}
