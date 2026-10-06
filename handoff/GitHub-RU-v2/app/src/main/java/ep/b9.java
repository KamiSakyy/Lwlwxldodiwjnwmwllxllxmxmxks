package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b9 implements aaShadow.a {
    public static final b9 a = new b9();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.pd pdVar = null;
        while (eVar.r0(b) == 0) {
            pdVar = (jo.pd) aa.c.b(aa.c.c(d9.a, true)).a(eVar, wVar);
        }
        return new jo.nd(pdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nd ndVar = (jo.nd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ndVar, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(d9.a, true)).b(fVar, wVar, ndVar.a);
    }
}
