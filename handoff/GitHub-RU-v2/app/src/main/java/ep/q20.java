package ep;

import java.util.List;
import jo.bk0;
import jo.fk0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q20 implements aaShadow.a {
    public static final q20 a = new q20();
    public static final List b = sy.d0Shadow.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fk0 fk0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fk0Var = (fk0) aa.c.c(u20.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fk0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new bk0(fk0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bk0 bk0Var = (bk0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bk0Var, "value");
        fVar.z0("viewer");
        aa.c.c(u20.a, false).b(fVar, wVar, bk0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bk0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bk0Var.c);
    }
}
