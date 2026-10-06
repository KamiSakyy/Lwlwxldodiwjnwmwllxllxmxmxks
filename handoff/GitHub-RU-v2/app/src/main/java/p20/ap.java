package p20;

import java.util.List;
import u10.k00;
import u10.l00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ap implements aaShadow.a {
    public static final ap a = new ap();
    public static final List b = sy.d0Shadow.o("__typename", "subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        k00 k00Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                k00Var = (k00) aa.c.b(aa.c.c(zo.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new l00(str, k00Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l00 l00Var = (l00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l00Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l00Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(zo.a, true)).b(fVar, wVar, l00Var.b);
    }
}
