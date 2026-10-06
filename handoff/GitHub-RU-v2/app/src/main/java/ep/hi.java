package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hi implements aaShadow.a {
    public static final hi a = new hi();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        qx.j c = qx.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.ar(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.arShadow arVar = (jo.ar) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(arVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, arVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, arVar.b);
        List list = qx.l.a;
        qx.l.d(fVar, wVar, arVar.c);
    }
}
