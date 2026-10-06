package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gf implements aaShadow.a {
    public static final gf a = new gf();
    public static final List b = sy.d0Shadow.o(new String[]{"teams", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wm wmVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wmVar = (kc0.wm) aa.c.c(jf.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (wmVar == null) {
            k41.b.B(eVar, "teams");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.um(wmVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.um umVar = (kc0.um) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(umVar, "value");
        fVar.z0("teams");
        aa.c.c(jf.a, false).b(fVar, wVar, umVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, umVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, umVar.c);
    }
}
