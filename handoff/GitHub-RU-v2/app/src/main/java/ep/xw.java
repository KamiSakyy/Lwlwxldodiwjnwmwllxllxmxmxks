package ep;

import java.util.List;
import jo.eb0;
import jo.gb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xw implements aa.a {
    public static final xw a = new xw();
    public static final List b = sy.d0.o("owner", "name", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        eb0 eb0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                eb0Var = (eb0) aa.c.c(vw.a, true).a(eVar, wVar);
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
        if (eb0Var == null) {
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
            return new gb0(eb0Var, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gb0 gb0Var = (gb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gb0Var, "value");
        fVar.z0("owner");
        aa.c.c(vw.a, true).b(fVar, wVar, gb0Var.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gb0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, gb0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gb0Var.d);
    }
}
