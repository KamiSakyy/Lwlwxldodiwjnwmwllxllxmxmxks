package ep;

import java.util.List;
import jo.gf0;
import jo.if0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sz implements aaShadow.a {
    public static final sz a = new sz();
    public static final List b = sy.d0.o("id", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gf0 gf0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gf0Var = (gf0) aa.c.c(qz.a, false).a(eVar, wVar);
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
        if (gf0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new if0(str, gf0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        if0 if0Var = (if0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(if0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, if0Var.a);
        fVar.z0("owner");
        aa.c.c(qz.a, false).b(fVar, wVar, if0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, if0Var.c);
    }
}
