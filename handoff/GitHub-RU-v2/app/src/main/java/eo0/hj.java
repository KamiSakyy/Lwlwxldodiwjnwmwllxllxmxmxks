package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hj implements aaShadow.a {
    public static final hj a = new hj();
    public static final List b = sy.d0.o(new String[]{"id", "number", "comments", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        jn0.as asVar = null;
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
                asVar = (jn0.as) aa.c.c(fj.a, false).a(eVar, wVar);
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
        if (asVar == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ds(str, intValue, asVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ds dsVar = (jn0.ds) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dsVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dsVar.a);
        fVar.z0("number");
        fVar.z(dsVar.b);
        fVar.z0("comments");
        aa.c.c(fj.a, false).b(fVar, wVar, dsVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dsVar.d);
    }
}
