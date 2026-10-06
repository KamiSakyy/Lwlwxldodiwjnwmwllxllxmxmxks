package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f4 implements aaShadow.a {
    public static final f4 a = new f4();
    public static final List b = sy.d0Shadow.o("id", "commit", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.h6 h6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                h6Var = (jo.h6) aa.c.c(a4.a, true).a(eVar, wVar);
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
        if (h6Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new jo.n6(str, h6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n6 n6Var = (jo.n6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n6Var.a);
        fVar.z0("commit");
        aa.c.c(a4.a, true).b(fVar, wVar, n6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n6Var.c);
    }
}
