package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"contentHTML", "markDownFileLines"});

    public static r c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new r(str, list);
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c0.a, true)))).a(eVar, wVar);
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("contentHTML");
        aa.c.i.b(fVar, wVar, rVar.a);
        fVar.z0("markDownFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c0.a, true)))).b(fVar, wVar, rVar.b);
    }
}
