package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pb implements aaShadow.a {
    public static final pb a = new pb();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ih ihVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ihVar = (jn0.ih) aa.c.c(sb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(rb.a, true)))).a(eVar, wVar);
            }
        }
        if (ihVar != null) {
            return new jn0.eh(ihVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.eh ehVar = (jn0.eh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ehVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(sb.a, false).b(fVar, wVar, ehVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(rb.a, true)))).b(fVar, wVar, ehVar.b);
    }
}
