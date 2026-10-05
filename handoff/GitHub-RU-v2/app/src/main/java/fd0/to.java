package fd0;

import java.util.List;
import kc0.yz;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class to implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static yz c(ea.e eVar, aa.w wVar) {
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
        oj0.e2 c = oj0.l2.c(eVar, wVar);
        eVar.s0();
        oj0.h c2 = oj0.m.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new yz(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, yz yzVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yzVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yzVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, yzVar.b);
        List list = oj0.l2.a;
        oj0.l2.d(fVar, wVar, yzVar.c);
        List list2 = oj0.m.a;
        oj0.m.d(fVar, wVar, yzVar.d);
    }
}
