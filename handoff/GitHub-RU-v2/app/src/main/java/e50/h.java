package e50;

import hc0.h6;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = sy.d0Shadow.o("id", "answerChosenAt", "answerChosenBy", "answer", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        b bVar = null;
        a aVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, h6.a, eVar, wVar);
            } else if (r0 == 2) {
                bVar = (b) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                aVar = (a) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
            return new d(str, zonedDateTime, bVar, aVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("answerChosenAt");
        h6.Companion.getClass();
        aa.c.b(wVar.e(h6.a)).b(fVar, wVar, dVar.b);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, dVar.c);
        fVar.z0("answer");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, dVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dVar.e);
    }
}
