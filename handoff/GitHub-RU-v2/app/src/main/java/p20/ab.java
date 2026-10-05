package p20;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ab implements aa.a {
    public static final ab a = new ab();
    public static final List b = sy.d0.o("id", "answerChosenAt", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        u10.eg egVar = null;
        u10.fg fgVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, hc0.h6.a, eVar, wVar);
            } else if (r0 == 2) {
                egVar = (u10.eg) aa.c.b(aa.c.c(xa.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                fgVar = (u10.fg) aa.c.b(aa.c.c(ya.a, true)).a(eVar, wVar);
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
            return new u10.ig(str, zonedDateTime, egVar, fgVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ig igVar = (u10.ig) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(igVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, igVar.a);
        fVar.z0("answerChosenAt");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, igVar.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(xa.a, true)).b(fVar, wVar, igVar.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(ya.a, true)).b(fVar, wVar, igVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, igVar.e);
    }
}
