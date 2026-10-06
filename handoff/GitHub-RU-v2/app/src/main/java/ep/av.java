package ep;

import java.util.List;
import jo.k80;
import jo.l80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class av implements aaShadow.a {
    public static final av a = new av();
    public static final List b = sy.d0.o("__typename", "subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        k80 k80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                k80Var = (k80) aa.c.b(aa.c.c(zu.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new l80(str, k80Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l80 l80Var = (l80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l80Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l80Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(zu.a, true)).b(fVar, wVar, l80Var.b);
    }
}
