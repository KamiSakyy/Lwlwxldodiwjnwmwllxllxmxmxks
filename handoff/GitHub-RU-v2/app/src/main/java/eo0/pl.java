package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pl implements aaShadow.a {
    public static final pl a = new pl();
    public static final List b = sy.d0Shadow.o(new String[]{"name", "type", "mode", "submodule"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        jn0.mv mvVar = null;
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
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                mvVar = (jn0.mv) aa.c.b(aa.c.c(tl.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "type");
            throw null;
        }
        if (num != null) {
            return new jn0.iv(str, str2, num.intValue(), mvVar);
        }
        k41.b.B(eVar, "mode");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.iv ivVar = (jn0.iv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ivVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ivVar.a);
        fVar.z0("type");
        bVar.b(fVar, wVar, ivVar.b);
        fVar.z0("mode");
        fVar.z(ivVar.c);
        fVar.z0("submodule");
        aa.c.b(aa.c.c(tl.a, false)).b(fVar, wVar, ivVar.d);
    }
}
