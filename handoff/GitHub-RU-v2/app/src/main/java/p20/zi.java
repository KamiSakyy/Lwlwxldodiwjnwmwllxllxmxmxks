package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zi implements aaShadow.a {
    public static final zi a = new zi();
    public static final List b = sy.d0Shadow.o("name", "type", "mode", "submodule");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        u10.xr xrVar = null;
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
                xrVar = (u10.xr) aa.c.b(aa.c.c(dj.a, false)).a(eVar, wVar);
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
            return new u10.tr(str, str2, num.intValue(), xrVar);
        }
        k41.b.B(eVar, "mode");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.tr trVar = (u10.tr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(trVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, trVar.a);
        fVar.z0("type");
        bVar.b(fVar, wVar, trVar.b);
        fVar.z0("mode");
        fVar.z(trVar.c);
        fVar.z0("submodule");
        aa.c.b(aa.c.c(dj.a, false)).b(fVar, wVar, trVar.d);
    }
}
