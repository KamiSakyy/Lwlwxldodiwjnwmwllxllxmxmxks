package j70;

import aa.w;
import i70.h;
import i70.i;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0Shadow.n("organization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (h) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
        }
        return new i(hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i iVar = (i) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(iVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, iVar.a);
    }
}
