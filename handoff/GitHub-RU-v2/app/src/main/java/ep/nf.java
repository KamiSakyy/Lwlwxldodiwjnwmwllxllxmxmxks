package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class nf implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("mentionableItems");

    public static jo.zm c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.qm qmVar = null;
        while (eVar.r0(a) == 0) {
            qmVar = (jo.qm) aa.c.b(aa.c.c(df.a, false)).a(eVar, wVar);
        }
        return new jo.zm(qmVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jo.zm zmVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zmVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(df.a, false)).b(fVar, wVar, zmVar.a);
    }
}
