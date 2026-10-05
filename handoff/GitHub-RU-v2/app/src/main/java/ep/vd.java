package ep;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vd implements aa.a {
    public static final vd a = new vd();
    public static final List b = sy.d0.o("id", "answerChosenAt", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        jo.ck ckVar = null;
        jo.dk dkVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m10.sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, m10.sa.a, eVar, wVar);
            } else if (r0 == 2) {
                ckVar = (jo.ck) aa.c.b(aa.c.c(sd.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                dkVar = (jo.dk) aa.c.b(aa.c.c(td.a, true)).a(eVar, wVar);
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
            return new jo.gk(str, zonedDateTime, ckVar, dkVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gk gkVar = (jo.gk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gkVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gkVar.a);
        fVar.z0("answerChosenAt");
        m10.sa.Companion.getClass();
        aa.c.b(wVar.e(m10.sa.a)).b(fVar, wVar, gkVar.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(sd.a, true)).b(fVar, wVar, gkVar.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(td.a, true)).b(fVar, wVar, gkVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gkVar.e);
    }
}
