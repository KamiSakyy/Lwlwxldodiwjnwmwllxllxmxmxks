package e20;

import aa.w;
import d20.q;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j implements aa.a {
    public static final List a = l.r(new String[]{"id", "databaseId", "updatesChannel"});

    public static q c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new q(num, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, q qVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(qVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, qVar.a);
        fVar.z0("databaseId");
        aa.c.b(y20.a.a).b(fVar, wVar, qVar.b);
        fVar.z0("updatesChannel");
        aa.c.i.b(fVar, wVar, qVar.c);
    }
}
