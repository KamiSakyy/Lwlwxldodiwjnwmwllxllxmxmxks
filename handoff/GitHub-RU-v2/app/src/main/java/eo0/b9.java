package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b9 implements aaShadow.a {
    public static final b9 a = new b9();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "contributorsCount", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
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
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        uu0.k3 c = uu0.r3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "contributorsCount");
            throw null;
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new jn0.od(str, intValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.od odVar = (jn0.od) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(odVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, odVar.a);
        fVar.z0("contributorsCount");
        fVar.z(odVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, odVar.c);
        List list = uu0.r3.a;
        uu0.r3.d(fVar, wVar, odVar.d);
    }
}
