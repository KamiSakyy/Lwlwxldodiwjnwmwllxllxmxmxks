package i50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements aa.a {
    public static final xShadow a = new xShadow();
    public static final List b = sy.d0Shadow.o("id", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        r rVar = null;
        s sVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                rVar = (r) aa.c.b(aa.c.c(v.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                sVar = (s) aa.c.b(aa.c.c(w.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new t(str, rVar, sVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t tVar = (t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("answer");
        aa.c.b(aa.c.c(v.a, false)).b(fVar, wVar, tVar.b);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(w.a, true)).b(fVar, wVar, tVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tVar.d);
    }
}
