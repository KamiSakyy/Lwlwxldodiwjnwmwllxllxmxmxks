package ms;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0Shadow.o("id", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        s sVar = null;
        t tVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sVar = (s) aa.c.b(aa.c.c(w.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                tVar = (t) aa.c.b(aa.c.c(xShadow.a, true)).a(eVar, wVar);
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
            return new u(str, sVar, tVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u uVar = (u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uVar.a);
        fVar.z0("answer");
        aa.c.b(aa.c.c(w.a, false)).b(fVar, wVar, uVar.b);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(xShadow.a, true)).b(fVar, wVar, uVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uVar.d);
    }
}
