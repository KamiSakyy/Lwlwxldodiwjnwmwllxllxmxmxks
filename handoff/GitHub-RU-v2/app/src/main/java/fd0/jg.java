package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jg implements aaShadow.a {
    public static final jg a = new jg();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.mo moVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        kc0.lo loVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewThread"}), set2, str, set)) {
            eVar.s0();
            moVar = og.c(eVar, wVar);
        } else {
            moVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewComment"}), set2, str, set)) {
            eVar.s0();
            loVar = ng.c(eVar, wVar);
        }
        return new kc0.ho(str, moVar, loVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ho hoVar = (kc0.ho) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hoVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hoVar.a);
        kc0.mo moVar = hoVar.b;
        if (moVar != null) {
            og.d(fVar, wVar, moVar);
        }
        kc0.lo loVar = hoVar.c;
        if (loVar != null) {
            ng.d(fVar, wVar, loVar);
        }
    }
}
