package la0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"id", "upvoteCount", "viewerCanUpvote", "viewerHasUpvoted"});

    public static b c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
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
            return new b(intValue, str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerHasUpvoted");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bVar.a);
        fVar.z0("upvoteCount");
        fVar.z(bVar.b);
        fVar.z0("viewerCanUpvote");
        aa.b bVar2 = aa.c.f;
        f4Shadow.C(bVar.c, bVar2, fVar, wVar, "viewerHasUpvoted");
        bVar2.b(fVar, wVar, Boolean.valueOf(bVar.d));
    }
}
