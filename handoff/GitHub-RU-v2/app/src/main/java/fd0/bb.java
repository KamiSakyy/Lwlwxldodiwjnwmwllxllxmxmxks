package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class bb implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static kc0.hg c(ea.e eVar, aa.w wVar) {
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
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        wk0.c1 c = wk0.d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.hg(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.hg hgVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hgVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hgVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, hgVar.b);
        List list = wk0.d1.a;
        wk0.d1.d(fVar, wVar, hgVar.c);
    }
}
