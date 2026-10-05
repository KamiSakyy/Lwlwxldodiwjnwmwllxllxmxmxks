package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vj implements aa.a {
    public static final vj a = new vj();
    public static final List b = sy.d0.o(new String[]{"name", "type", "mode", "submodule"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        kc0.bt btVar = null;
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
                btVar = (kc0.bt) aa.c.b(aa.c.c(zj.a, false)).a(eVar, wVar);
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
            return new kc0.xs(str, str2, num.intValue(), btVar);
        }
        k41.b.B(eVar, "mode");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xs xsVar = (kc0.xs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xsVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xsVar.a);
        fVar.z0("type");
        bVar.b(fVar, wVar, xsVar.b);
        fVar.z0("mode");
        fVar.z(xsVar.c);
        fVar.z0("submodule");
        aa.c.b(aa.c.c(zj.a, false)).b(fVar, wVar, xsVar.d);
    }
}
