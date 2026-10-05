package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cj implements aa.a {
    public static final cj a = new cj();
    public static final List b = sy.d0.o("gitObject", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ur urVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                urVar = (u10.ur) aa.c.b(aa.c.c(aj.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.wr(urVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wr wrVar = (u10.wr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wrVar, "value");
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(aj.a, true)).b(fVar, wVar, wrVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wrVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wrVar.c);
    }
}
