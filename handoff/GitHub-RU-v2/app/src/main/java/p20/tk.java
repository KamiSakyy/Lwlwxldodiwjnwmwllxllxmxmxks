package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tk implements aaShadow.a {
    public static final tk a = new tk();
    public static final List b = sy.d0Shadow.o("pageInfo", "totalCount", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.hu huVar = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                huVar = (u10.hu) aa.c.c(wk.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vk.a, true)))).a(eVar, wVar);
            }
        }
        if (huVar == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new u10.du(huVar, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.du duVar = (u10.du) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(duVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(wk.a, false).b(fVar, wVar, duVar.a);
        fVar.z0("totalCount");
        fVar.z(duVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vk.a, true)))).b(fVar, wVar, duVar.c);
    }
}
