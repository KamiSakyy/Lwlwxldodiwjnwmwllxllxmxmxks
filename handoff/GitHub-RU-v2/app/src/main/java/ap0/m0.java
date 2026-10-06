package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "upvoteCount", "viewerCanUpvote", "viewerHasUpvoted"});

    public static g0 c(ea.e eVar, aa.w wVar) {
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
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
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
            return new g0(intValue, str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerHasUpvoted");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g0 g0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, g0Var.a);
        fVar.z0("upvoteCount");
        fVar.z(g0Var.b);
        fVar.z0("viewerCanUpvote");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(g0Var.c, bVar, fVar, wVar, "viewerHasUpvoted");
        bVar.b(fVar, wVar, Boolean.valueOf(g0Var.d));
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object p(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
