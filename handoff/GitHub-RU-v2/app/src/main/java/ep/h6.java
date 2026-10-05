package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h6 implements aa.a {
    public static final h6 a = new h6();
    public static final List b = sy.d0.o("__typename", "comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.h9 h9Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                h9Var = (jo.h9) aa.c.b(aa.c.c(e6.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jo.l9(str, h9Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l9 l9Var = (jo.l9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l9Var.a);
        fVar.z0("comment");
        aa.c.b(aa.c.c(e6.a, false)).b(fVar, wVar, l9Var.b);
    }
}
