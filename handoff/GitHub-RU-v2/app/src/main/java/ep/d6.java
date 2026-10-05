package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d6 implements aa.a {
    public static final d6 a = new d6();
    public static final List b = sy.d0.o("id", "replyTo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.n9 n9Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                n9Var = (jo.n9) aa.c.b(aa.c.c(j6.a, false)).a(eVar, wVar);
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
            return new jo.g9(str, n9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.g9 g9Var = (jo.g9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g9Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(j6.a, false)).b(fVar, wVar, g9Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g9Var.c);
    }
}
