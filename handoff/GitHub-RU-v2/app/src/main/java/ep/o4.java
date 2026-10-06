package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o4 implements aaShadow.a {
    public static final o4 a = new o4();
    public static final List b = sy.d0.o("id", "compare", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.x6 x6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                x6Var = (jo.x6) aa.c.b(aa.c.c(n4.a, false)).a(eVar, wVar);
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
            return new jo.y6(str, x6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y6 y6Var = (jo.y6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y6Var.a);
        fVar.z0("compare");
        aa.c.b(aa.c.c(n4.a, false)).b(fVar, wVar, y6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y6Var.c);
    }
}
