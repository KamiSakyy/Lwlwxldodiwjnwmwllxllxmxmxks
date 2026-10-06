package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p6 implements aa.a {
    public static final p6 a = new p6();
    public static final List b = sy.d0Shadow.o("recommendedApprovingReviewCount", "requiresCodeOwnerReviews", "viewerAllowedToDismissReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "requiresCodeOwnerReviews");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new c5(num, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerAllowedToDismissReviews");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c5 c5Var = (c5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c5Var, "value");
        fVar.z0("recommendedApprovingReviewCount");
        aa.c.b(y20.a.a).b(fVar, wVar, c5Var.a);
        fVar.z0("requiresCodeOwnerReviews");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(c5Var.b, bVar, fVar, wVar, "viewerAllowedToDismissReviews");
        bVar.b(fVar, wVar, Boolean.valueOf(c5Var.c));
    }
}
