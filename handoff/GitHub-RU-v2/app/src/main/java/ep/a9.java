package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a9 implements aaShadow.a {
    public static final a9 a = new a9();
    public static final List b = sy.d0.n("dismissPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.nd ndVar = null;
        while (eVar.r0(b) == 0) {
            ndVar = (jo.nd) aa.c.b(aa.c.c(b9.a, false)).a(eVar, wVar);
        }
        return new jo.md(ndVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.md mdVar = (jo.md) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mdVar, "value");
        fVar.z0("dismissPullRequestReview");
        aa.c.b(aa.c.c(b9.a, false)).b(fVar, wVar, mdVar.a);
    }
}
