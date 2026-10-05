package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ck implements aa.a {
    public static final ck a = new ck();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
            return new kc0.gt(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gt gtVar = (kc0.gt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gtVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gtVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gtVar.b);
        List list = oj0.l2.a;
        oj0.l2.d(fVar, wVar, gtVar.c);
        List list2 = oj0.m.a;
        oj0.m.d(fVar, wVar, gtVar.d);
    }
}
