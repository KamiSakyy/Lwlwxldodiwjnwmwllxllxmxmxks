package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xm implements aaShadow.a {
    public static final xm a = new xm();
    public static final List b = sy.d0Shadow.o("name", "type", "mode", "submodule");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        jo.jx jxVar = null;
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
                jxVar = (jo.jx) aa.c.b(aa.c.c(bn.a, false)).a(eVar, wVar);
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
            return new jo.fx(str, str2, num.intValue(), jxVar);
        }
        k41.b.B(eVar, "mode");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fx fxVar = (jo.fx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fxVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fxVar.a);
        fVar.z0("type");
        bVar.b(fVar, wVar, fxVar.b);
        fVar.z0("mode");
        fVar.z(fxVar.c);
        fVar.z0("submodule");
        aa.c.b(aa.c.c(bn.a, false)).b(fVar, wVar, fxVar.d);
    }
}
