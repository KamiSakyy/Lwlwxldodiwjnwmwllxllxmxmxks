package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xg implements aaShadow.a {
    public static final xg a = new xg();
    public static final List b = sy.d0.o("id", "number", "comments", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        u10.uo uoVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                uoVar = (u10.uo) aa.c.c(vg.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (uoVar == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new u10.xo(str, intValue, uoVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xo xoVar = (u10.xo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xoVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xoVar.a);
        fVar.z0("number");
        fVar.z(xoVar.b);
        fVar.z0("comments");
        aa.c.c(vg.a, false).b(fVar, wVar, xoVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xoVar.d);
    }
}
