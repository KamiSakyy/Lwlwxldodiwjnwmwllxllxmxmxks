package fd0;

import java.util.List;
import kc0.ez;
import kc0.fz;
import kc0.wy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wn implements aa.a {
    public static final wn a = new wn();
    public static final List b = sy.d0.o(new String[]{"repository", "search"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ez ezVar = null;
        fz fzVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ezVar = (ez) aa.c.b(aa.c.c(fo.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                fzVar = (fz) aa.c.c(go.a, false).a(eVar, wVar);
            }
        }
        if (fzVar != null) {
            return new wy(ezVar, fzVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wy wyVar = (wy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wyVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fo.a, false)).b(fVar, wVar, wyVar.a);
        fVar.z0("search");
        aa.c.c(go.a, false).b(fVar, wVar, wyVar.b);
    }
}
