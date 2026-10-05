package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"file", "id"});

    public static p c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l lVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                lVar = (l) aa.c.b(aa.c.c(z.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new p(lVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("file");
        aa.c.b(aa.c.c(z.a, false)).b(fVar, wVar, pVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, pVar.b);
    }
}
