package ep;

import java.util.List;
import jo.d30;
import jo.e30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ir implements aaShadow.a {
    public static final ir a = new ir();
    public static final List b = sy.d0Shadow.o("id", "mergeQueue", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        d30 d30Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d30Var = (d30) aa.c.b(aa.c.c(hr.a, true)).a(eVar, wVar);
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
            return new e30(str, d30Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e30 e30Var = (e30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e30Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e30Var.a);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(hr.a, true)).b(fVar, wVar, e30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e30Var.c);
    }
}
