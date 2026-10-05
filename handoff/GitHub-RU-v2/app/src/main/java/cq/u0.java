package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "upvoteCount", "viewerCanUpvote", "viewerHasUpvoted"});

    public static o0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "upvoteCount");
            throw null;
        }
        int intValue = num.intValue();
        if (bool == null) {
            k41.b.B(eVar, "viewerCanUpvote");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new o0(intValue, str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerHasUpvoted");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o0 o0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, o0Var.a);
        fVar.z0("upvoteCount");
        fVar.z(o0Var.b);
        fVar.z0("viewerCanUpvote");
        aa.b bVar = aa.c.f;
        jo.f4.C(o0Var.c, bVar, fVar, wVar, "viewerHasUpvoted");
        bVar.b(fVar, wVar, Boolean.valueOf(o0Var.d));
    }
}
