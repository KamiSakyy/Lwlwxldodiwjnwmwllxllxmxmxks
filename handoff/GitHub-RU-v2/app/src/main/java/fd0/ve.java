package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ve implements aaShadow.a {
    public static final ve a = new ve();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.im imVar = null;
        while (eVar.r0(b) == 0) {
            imVar = (kc0.im) aa.c.b(aa.c.c(ye.a, false)).a(eVar, wVar);
        }
        return new kc0.fm(imVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fm fmVar = (kc0.fm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fmVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(ye.a, false)).b(fVar, wVar, fmVar.a);
    }
}
