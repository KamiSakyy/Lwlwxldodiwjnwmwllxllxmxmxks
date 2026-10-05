package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u6 implements aa.a {
    public static final u6 a = new u6();
    public static final List b = sy.d0.o("__typename", "pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ka kaVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                kaVar = (jo.ka) aa.c.b(aa.c.c(w6.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jo.ia(str, kaVar);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ia iaVar = (jo.ia) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iaVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, iaVar.a);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(w6.a, false)).b(fVar, wVar, iaVar.b);
    }
}
