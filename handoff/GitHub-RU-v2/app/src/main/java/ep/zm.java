package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class zm implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"entries", "id"});

    public static jo.hx c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(xm.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jo.hx(list, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.hx hxVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hxVar, "value");
        fVar.z0("entries");
        aa.c.b(aa.c.a(aa.c.c(xm.a, false))).b(fVar, wVar, hxVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, hxVar.b);
    }
}
