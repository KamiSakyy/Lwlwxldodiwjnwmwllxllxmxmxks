package fd0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ub implements aaShadow.a {
    public static final ub a = new ub();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "answerChosenAt", "answer", "answerChosenBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        kc0.gh ghVar = null;
        kc0.hh hhVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gn0.r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, gn0.r6.a, eVar, wVar);
            } else if (r0 == 2) {
                ghVar = (kc0.gh) aa.c.b(aa.c.c(rb.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                hhVar = (kc0.hh) aa.c.b(aa.c.c(sb.a, true)).a(eVar, wVar);
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
            return new kc0.kh(str, zonedDateTime, ghVar, hhVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kh khVar = (kc0.kh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(khVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, khVar.a);
        fVar.z0("answerChosenAt");
        gn0.r6.Companion.getClass();
        aa.c.b(wVar.e(gn0.r6.a)).b(fVar, wVar, khVar.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(rb.a, true)).b(fVar, wVar, khVar.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(sb.a, true)).b(fVar, wVar, khVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, khVar.e);
    }
}
