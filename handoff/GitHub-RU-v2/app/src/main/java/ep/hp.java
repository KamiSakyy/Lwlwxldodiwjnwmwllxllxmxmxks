package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hp implements aa.a {
    public static final hp a = new hp();
    public static final List b = sy.d0.o("author", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.b00 b00Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b00Var = (jo.b00) aa.c.b(aa.c.c(cp.a, true)).a(eVar, wVar);
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
            return new jo.h00(b00Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h00 h00Var = (jo.h00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h00Var, "value");
        fVar.z0("author");
        aa.c.b(aa.c.c(cp.a, true)).b(fVar, wVar, h00Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h00Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h00Var.c);
    }
}
