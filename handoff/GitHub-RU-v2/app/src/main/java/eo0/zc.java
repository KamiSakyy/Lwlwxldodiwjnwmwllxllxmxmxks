package eo0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zc implements aaShadow.a {
    public static final zc a = new zc();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "answerChosenAt", "answer", "answerChosenBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        jn0.xi xiVar = null;
        jn0.yi yiVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                pz0.o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, pz0.o7.a, eVar, wVar);
            } else if (r0 == 2) {
                xiVar = (jn0.xi) aa.c.b(aa.c.c(wc.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                yiVar = (jn0.yi) aa.c.b(aa.c.c(xc.a, true)).a(eVar, wVar);
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
            return new jn0.bj(str, zonedDateTime, xiVar, yiVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.bj bjVar = (jn0.bj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bjVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bjVar.a);
        fVar.z0("answerChosenAt");
        pz0.o7.Companion.getClass();
        aa.c.b(wVar.e(pz0.o7.a)).b(fVar, wVar, bjVar.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(wc.a, true)).b(fVar, wVar, bjVar.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(xc.a, true)).b(fVar, wVar, bjVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bjVar.e);
    }
}
