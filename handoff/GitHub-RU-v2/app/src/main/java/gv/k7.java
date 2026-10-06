package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k7 implements aa.a {
    public static final k7 a = new k7();
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
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
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
            return new x5(num, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerAllowedToDismissReviews");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x5 x5Var = (x5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x5Var, "value");
        fVar.z0("recommendedApprovingReviewCount");
        aa.c.b(tp.a.a).b(fVar, wVar, x5Var.a);
        fVar.z0("requiresCodeOwnerReviews");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(x5Var.b, bVar, fVar, wVar, "viewerAllowedToDismissReviews");
        bVar.b(fVar, wVar, Boolean.valueOf(x5Var.c));
    }
}
