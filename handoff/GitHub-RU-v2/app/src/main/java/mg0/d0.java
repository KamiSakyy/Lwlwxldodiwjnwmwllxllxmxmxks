package mg0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0.o(new String[]{"__typename", "beforeFocusCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        x xVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                xVar = (x) aa.c.c(c0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b0.a, true)))).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "beforeFocusCount");
            throw null;
        }
        int intValue = num.intValue();
        if (xVar != null) {
            return new y(str, intValue, xVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y yVar = (y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, yVar.a);
        fVar.z0("beforeFocusCount");
        fVar.z(yVar.b);
        fVar.z0("pageInfo");
        aa.c.c(c0.a, false).b(fVar, wVar, yVar.c);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b0.a, true)))).b(fVar, wVar, yVar.d);
    }
}
