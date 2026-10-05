package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class lf implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static jo.xm c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rm rmVar = null;
        while (eVar.r0(a) == 0) {
            rmVar = (jo.rm) aa.c.b(aa.c.c(ef.a, false)).a(eVar, wVar);
        }
        return new jo.xm(rmVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jo.xm xmVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xmVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(ef.a, false)).b(fVar, wVar, xmVar.a);
    }
}
