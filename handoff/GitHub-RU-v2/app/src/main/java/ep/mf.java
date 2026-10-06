package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class mf implements aaShadow.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static jo.ym c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.sm smVar = null;
        while (eVar.r0(a) == 0) {
            smVar = (jo.sm) aa.c.b(aa.c.c(ff.a, false)).a(eVar, wVar);
        }
        return new jo.ym(smVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ym ymVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ymVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(ff.a, false)).b(fVar, wVar, ymVar.a);
    }
}
