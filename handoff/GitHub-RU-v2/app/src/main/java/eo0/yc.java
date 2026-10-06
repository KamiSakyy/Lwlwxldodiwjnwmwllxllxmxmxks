package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yc implements aaShadow.a {
    public static final yc a = new yc();
    public static final List b = sy.d0.n("markDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.cj cjVar = null;
        while (eVar.r0(b) == 0) {
            cjVar = (jn0.cj) aa.c.b(aa.c.c(ad.a, false)).a(eVar, wVar);
        }
        return new jn0.aj(cjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.aj ajVar = (jn0.aj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ajVar, "value");
        fVar.z0("markDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(ad.a, false)).b(fVar, wVar, ajVar.a);
    }
}
