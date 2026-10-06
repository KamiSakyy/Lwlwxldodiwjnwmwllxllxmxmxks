package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tb implements aaShadow.a {
    public static final tb a = new tb();
    public static final List b = sy.d0.n("markDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.lh lhVar = null;
        while (eVar.r0(b) == 0) {
            lhVar = (kc0.lh) aa.c.b(aa.c.c(vb.a, false)).a(eVar, wVar);
        }
        return new kc0.jh(lhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jh jhVar = (kc0.jh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jhVar, "value");
        fVar.z0("markDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(vb.a, false)).b(fVar, wVar, jhVar.a);
    }
}
