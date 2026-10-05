package yu;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = d0.o("path", "fileType");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c cVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new e(str, cVar);
                }
                cVar = (c) aa.c.b(aa.c.c(k.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        e eVar = (e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, eVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(k.a, true)).b(fVar, wVar, eVar.b);
    }
}
