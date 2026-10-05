package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 implements aa.a {
    public static final x4 a = new x4();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "stargazerCount", "viewerHasStarred"});

    public static u4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "stargazerCount");
            throw null;
        }
        int intValue = num.intValue();
        if (bool != null) {
            return new u4(intValue, str, str2, bool.booleanValue());
        }
        k41.b.B(eVar, "viewerHasStarred");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u4 u4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u4Var.b);
        fVar.z0("stargazerCount");
        fVar.z(u4Var.c);
        fVar.z0("viewerHasStarred");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(u4Var.d));
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (u4) obj);
    }
}
