package ep;

import java.util.List;
import jo.o30;
import jo.p30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class or implements aa.a {
    public static final or a = new or();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p30 p30Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p30Var = (p30) aa.c.b(aa.c.c(pr.a, true)).a(eVar, wVar);
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
            return new o30(p30Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o30 o30Var = (o30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o30Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(pr.a, true)).b(fVar, wVar, o30Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o30Var.c);
    }
}
