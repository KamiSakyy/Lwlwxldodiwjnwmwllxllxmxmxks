package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class el implements aa.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static kc0.ru c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.vu vuVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                vuVar = (kc0.vu) aa.c.c(il.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (vuVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new kc0.ru(vuVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.ru ruVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ruVar, "value");
        fVar.z0("repositories");
        aa.c.c(il.a, false).b(fVar, wVar, ruVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, ruVar.b);
    }
}
