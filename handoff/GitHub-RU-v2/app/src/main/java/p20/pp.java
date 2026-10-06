package p20;

import java.util.List;
import u10.e10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pp implements aaShadow.a {
    public static final pp a = new pp();
    public static final List b = sy.d0Shadow.o("__typename", "hasIssuesEnabled", "isDiscussionsEnabled", "isArchived", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
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
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        w80.q3 c = w80.s3.c(eVar, wVar);
        eVar.s0();
        w80.h c2 = w80.m.c(eVar, wVar);
        Boolean bool5 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool5 == null) {
            k41.b.B(eVar, "hasIssuesEnabled");
            throw null;
        }
        Boolean bool6 = bool3;
        boolean booleanValue = bool5.booleanValue();
        if (bool6 == null) {
            k41.b.B(eVar, "isDiscussionsEnabled");
            throw null;
        }
        Boolean bool7 = bool4;
        boolean booleanValue2 = bool6.booleanValue();
        if (bool7 == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue3 = bool7.booleanValue();
        if (str2 != null) {
            return new e10(str, booleanValue, booleanValue2, booleanValue3, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e10 e10Var = (e10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e10Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e10Var.a);
        fVar.z0("hasIssuesEnabled");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(e10Var.b, bVar2, fVar, wVar, "isDiscussionsEnabled");
        jo.f4Shadow.C(e10Var.c, bVar2, fVar, wVar, "isArchived");
        jo.f4Shadow.C(e10Var.d, bVar2, fVar, wVar, "id");
        bVar.b(fVar, wVar, e10Var.e);
        List list = w80.s3.a;
        w80.s3.d(fVar, wVar, e10Var.f);
        List list2 = w80.m.a;
        w80.m.d(fVar, wVar, e10Var.g);
    }
}
