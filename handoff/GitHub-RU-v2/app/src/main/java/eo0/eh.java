package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eh implements aa.a {
    public static final eh a = new eh();
    public static final List b = sy.d0.o(new String[]{"aheadBy", "behindBy", "commits", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        jn0.kp kpVar = null;
        String str = null;
        String str2 = null;
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
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong2);
                } else {
                    num2 = Integer.valueOf((int) nextLong2);
                }
            } else if (r0 == 2) {
                kpVar = (jn0.kp) aa.c.c(dh.a, false).a(eVar, wVar);
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
            k41.b.B(eVar, "aheadBy");
            throw null;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            k41.b.B(eVar, "behindBy");
            throw null;
        }
        int intValue2 = num2.intValue();
        if (kpVar == null) {
            k41.b.B(eVar, "commits");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.mp(intValue, intValue2, kpVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mp mpVar = (jn0.mp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mpVar, "value");
        fVar.z0("aheadBy");
        fVar.z(mpVar.a);
        fVar.z0("behindBy");
        fVar.z(mpVar.b);
        fVar.z0("commits");
        aa.c.c(dh.a, false).b(fVar, wVar, mpVar.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mpVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mpVar.e);
    }
}
