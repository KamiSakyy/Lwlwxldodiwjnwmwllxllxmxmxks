package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class xj implements aa.a {
    public static final List a = x61.l.r(new String[]{"entries", "id"});

    public static kc0.zs c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(vj.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new kc0.zs(list, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.zs zsVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zsVar, "value");
        fVar.z0("entries");
        aa.c.b(aa.c.a(aa.c.c(vj.a, false))).b(fVar, wVar, zsVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, zsVar.b);
    }
}
