package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "projectsV2"});

    public static rz.v c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        rz.w wVar2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                wVar2 = (rz.w) aa.c.c(n.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (wVar2 != null) {
            return new rz.v(str, wVar2);
        }
        k41.b.B(eVar, "projectsV2");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, rz.v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, vVar.a);
        fVar.z0("projectsV2");
        aa.c.c(n.a, true).b(fVar, wVar, vVar.b);
    }
}
