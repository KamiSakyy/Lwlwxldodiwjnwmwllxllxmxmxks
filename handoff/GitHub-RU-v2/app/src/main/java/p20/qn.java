package p20;

import java.util.List;
import u10.ly;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qn implements aaShadow.a {
    public static final qn a = new qn();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i30.c c = i30.d.c(eVar, wVar);
        if (str != null) {
            return new ly(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ly lyVar = (ly) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lyVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, lyVar.a);
        List list = i30.d.a;
        i30.c cVar = lyVar.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cVar.a);
        i30.a aVar = cVar.b;
        if (aVar != null) {
            i30.e.d(fVar, wVar, aVar);
        }
        i30.b bVar = cVar.c;
        if (bVar != null) {
            i30.f.d(fVar, wVar, bVar);
        }
    }
}
