package sd0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 implements aa.a {
    public static final f1 a = new f1();
    public static final List b = sy.d0.o(new String[]{"id", "viewerIsFollowing", "followers", "__typename"});

    public static b1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        a1 a1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                a1Var = (a1) aa.c.c(e1.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerIsFollowing");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (a1Var == null) {
            k41.b.B(eVar, "followers");
            throw null;
        }
        if (str2 != null) {
            return new b1(str, booleanValue, a1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b1 b1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b1Var.a);
        fVar.z0("viewerIsFollowing");
        f4.C(b1Var.b, aa.c.f, fVar, wVar, "followers");
        aa.c.c(e1.a, false).b(fVar, wVar, b1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b1Var.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (b1) obj);
    }
}
