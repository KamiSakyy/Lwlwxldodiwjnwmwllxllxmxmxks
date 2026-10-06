package fd0;

import java.util.List;
import kc0.t40;
import kc0.v40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cs implements aaShadow.a {
    public static final cs a = new cs();
    public static final List b = sy.d0Shadow.o(new String[]{"owner", "name", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t40 t40Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t40Var = (t40) aa.c.c(as.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (t40Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new v40(t40Var, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v40 v40Var = (v40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v40Var, "value");
        fVar.z0("owner");
        aa.c.c(as.a, true).b(fVar, wVar, v40Var.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v40Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, v40Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v40Var.d);
    }
}
