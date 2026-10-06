package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wn implements aaShadow.a {
    public static final wn a = new wn();
    public static final List b = sy.d0Shadow.o(new String[]{"planLimit", "pullRequest", "collaborators", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        jn0.hy hyVar = null;
        jn0.cy cyVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                hyVar = (jn0.hy) aa.c.b(aa.c.c(vn.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                cyVar = (jn0.cy) aa.c.b(aa.c.c(rn.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "planLimit");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.iy(intValue, hyVar, cyVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.iy iyVar = (jn0.iy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iyVar, "value");
        fVar.z0("planLimit");
        fVar.z(iyVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(vn.a, false)).b(fVar, wVar, iyVar.b);
        fVar.z0("collaborators");
        aa.c.b(aa.c.c(rn.a, false)).b(fVar, wVar, iyVar.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iyVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iyVar.e);
    }
}
