package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 implements aa.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0Shadow.o(new String[]{"recommendedApprovingReviewCount", "requiresCodeOwnerReviews", "viewerAllowedToDismissReviews"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
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
            return new l5(num, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerAllowedToDismissReviews");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l5 l5Var = (l5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l5Var, "value");
        fVar.z0("recommendedApprovingReviewCount");
        aa.c.b(ro0.a.a).b(fVar, wVar, l5Var.a);
        fVar.z0("requiresCodeOwnerReviews");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(l5Var.b, bVar, fVar, wVar, "viewerAllowedToDismissReviews");
        bVar.b(fVar, wVar, Boolean.valueOf(l5Var.c));
    }
}
