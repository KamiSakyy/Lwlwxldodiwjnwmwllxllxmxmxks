package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z8 implements aaShadow.a {
    public static final z8 a = new z8();
    public static final List b = sy.d0.o("discussionCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        jo.hd hdVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                hdVar = (jo.hd) aa.c.c(x8.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(w8.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "discussionCount");
            throw null;
        }
        int intValue = num.intValue();
        if (hdVar != null) {
            return new jo.jd(intValue, hdVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.jd jdVar = (jo.jd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jdVar, "value");
        fVar.z0("discussionCount");
        fVar.z(jdVar.a);
        fVar.z0("pageInfo");
        aa.c.c(x8.a, false).b(fVar, wVar, jdVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(w8.a, true)))).b(fVar, wVar, jdVar.c);
    }
}
