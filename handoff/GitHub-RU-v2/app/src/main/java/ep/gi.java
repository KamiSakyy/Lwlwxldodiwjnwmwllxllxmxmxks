package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gi implements aaShadow.a {
    public static final gi a = new gi();
    public static final List b = sy.d0Shadow.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ar arVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                arVar = (jo.ar) aa.c.c(hi.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (arVar == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.zq(arVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.zq zqVar = (jo.zq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zqVar, "value");
        fVar.z0("viewer");
        aa.c.c(hi.a, true).b(fVar, wVar, zqVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zqVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zqVar.c);
    }
}
