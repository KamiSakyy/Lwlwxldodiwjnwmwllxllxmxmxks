package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aaShadow.a {
    public static final x3 a = new x3();
    public static final List b = sy.d0Shadow.o("id", "gitObject", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.a6 a6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                a6Var = (jo.a6) aa.c.b(aa.c.c(w3.a, true)).a(eVar, wVar);
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
            return new jo.b6(str, a6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b6 b6Var = (jo.b6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b6Var.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(w3.a, true)).b(fVar, wVar, b6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b6Var.c);
    }
}
