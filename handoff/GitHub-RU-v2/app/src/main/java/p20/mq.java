package p20;

import java.time.ZonedDateTime;
import java.util.List;
import u10.l20;
import u10.m20;
import u10.p20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mq implements aa.a {
    public static final mq a = new mq();
    public static final List b = sy.d0.o("id", "answerChosenAt", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        l20 l20Var = null;
        m20 m20Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, hc0.h6.a, eVar, wVar);
            } else if (r0 == 2) {
                l20Var = (l20) aa.c.b(aa.c.c(jq.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                m20Var = (m20) aa.c.b(aa.c.c(kq.a, true)).a(eVar, wVar);
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
            return new p20(str, zonedDateTime, l20Var, m20Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p20 p20Var = (p20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p20Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p20Var.a);
        fVar.z0("answerChosenAt");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, p20Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(jq.a, true)).b(fVar, wVar, p20Var.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(kq.a, true)).b(fVar, wVar, p20Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p20Var.e);
    }
}
