package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 implements aa.a {
    public static final z5 a = new z5();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "viewerCanBlock", "viewerCanUnblock", "viewerIsFollowing", "isFollowingViewer", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                bool3 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                bool4 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                bool5 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool6 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool6 == null) {
            k41.b.B(eVar, "viewerCanBlock");
            throw null;
        }
        Boolean bool7 = bool3;
        boolean booleanValue = bool6.booleanValue();
        if (bool7 == null) {
            k41.b.B(eVar, "viewerCanUnblock");
            throw null;
        }
        Boolean bool8 = bool4;
        boolean booleanValue2 = bool7.booleanValue();
        if (bool8 == null) {
            k41.b.B(eVar, "viewerIsFollowing");
            throw null;
        }
        Boolean bool9 = bool5;
        boolean booleanValue3 = bool8.booleanValue();
        if (bool9 == null) {
            k41.b.B(eVar, "isFollowingViewer");
            throw null;
        }
        boolean booleanValue4 = bool9.booleanValue();
        if (str2 != null) {
            return new w5(str, booleanValue, booleanValue2, booleanValue3, booleanValue4, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w5 w5Var = (w5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w5Var.a);
        fVar.z0("viewerCanBlock");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(w5Var.b, bVar2, fVar, wVar, "viewerCanUnblock");
        jo.f4Shadow.C(w5Var.c, bVar2, fVar, wVar, "viewerIsFollowing");
        jo.f4Shadow.C(w5Var.d, bVar2, fVar, wVar, "isFollowingViewer");
        jo.f4Shadow.C(w5Var.e, bVar2, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, w5Var.f);
    }
}
