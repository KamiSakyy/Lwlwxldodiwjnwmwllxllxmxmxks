package fd0;

import java.util.List;
import kc0.s80;
import kc0.u80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yu implements aaShadow.a {
    public static final yu a = new yu();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        s80 s80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                s80Var = (s80) aa.c.c(wu.a, false).a(eVar, wVar);
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
        if (s80Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new u80(str, s80Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u80 u80Var = (u80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u80Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u80Var.a);
        fVar.z0("owner");
        aa.c.c(wu.a, false).b(fVar, wVar, u80Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u80Var.c);
    }
}
