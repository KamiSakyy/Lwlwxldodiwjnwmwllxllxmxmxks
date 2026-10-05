package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s4 implements aa.a {
    public static final s4 a = new s4();
    public static final List b = sy.d0.o("id", "diffLines", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        List list = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r4.a, true)))).a(eVar, wVar);
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
            return new jo.c7(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.c7 c7Var = (jo.c7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c7Var.a);
        fVar.z0("diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r4.a, true)))).b(fVar, wVar, c7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c7Var.c);
    }
}
