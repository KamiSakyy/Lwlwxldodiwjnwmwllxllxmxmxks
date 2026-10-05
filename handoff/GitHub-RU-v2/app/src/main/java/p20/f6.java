package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 implements aa.a {
    public static final f6 a = new f6();
    public static final List b = sy.d0.o("id", "viewerCanEnableAutoMerge", "viewerCanDisableAutoMerge", "autoMergeRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        u10.e9 e9Var = null;
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
                e9Var = (u10.e9) aa.c.b(aa.c.c(c6.a, false)).a(eVar, wVar);
                bool2 = bool2;
                bool3 = bool3;
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool4 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool4 == null) {
            k41.b.B(eVar, "viewerCanEnableAutoMerge");
            throw null;
        }
        Boolean bool5 = bool3;
        boolean booleanValue = bool4.booleanValue();
        if (bool5 == null) {
            k41.b.B(eVar, "viewerCanDisableAutoMerge");
            throw null;
        }
        boolean booleanValue2 = bool5.booleanValue();
        if (str2 != null) {
            return new u10.i9(str, booleanValue, booleanValue2, e9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.i9 i9Var = (u10.i9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i9Var.a);
        fVar.z0("viewerCanEnableAutoMerge");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(i9Var.b, bVar2, fVar, wVar, "viewerCanDisableAutoMerge");
        jo.f4.C(i9Var.c, bVar2, fVar, wVar, "autoMergeRequest");
        aa.c.b(aa.c.c(c6.a, false)).b(fVar, wVar, i9Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i9Var.e);
    }
}
