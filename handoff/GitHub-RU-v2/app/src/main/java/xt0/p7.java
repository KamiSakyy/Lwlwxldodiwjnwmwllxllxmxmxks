package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p7 implements aa.a {
    public static final p7 a = new p7();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "isResolved", "resolvedBy", "viewerCanResolve", "viewerCanUnresolve", "diffLines"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        Boolean bool5 = null;
        i7 i7Var = null;
        Boolean bool6 = null;
        List list = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool3 = bool4;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 1:
                    bool3 = bool4;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 2:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 3:
                    bool = bool4;
                    bool2 = bool5;
                    i7Var = (i7) aa.c.b(aa.c.c(n7.a, false)).a(eVar, wVar);
                    bool4 = bool;
                    bool5 = bool2;
                case 4:
                    bool3 = bool4;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 5:
                    bool3 = bool4;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 6:
                    bool = bool4;
                    bool2 = bool5;
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(l7.a, true)))).a(eVar, wVar);
                    bool4 = bool;
                    bool5 = bool2;
            }
            eVar.s0();
            eu0.a c = eu0.b.c(eVar, wVar);
            Boolean bool7 = bool4;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (bool7 == null) {
                k41.b.B(eVar, "isResolved");
                throw null;
            }
            Boolean bool8 = bool5;
            boolean booleanValue = bool7.booleanValue();
            if (bool8 == null) {
                k41.b.B(eVar, "viewerCanResolve");
                throw null;
            }
            Boolean bool9 = bool6;
            boolean booleanValue2 = bool8.booleanValue();
            if (bool9 != null) {
                return new j7(str, str2, booleanValue, i7Var, booleanValue2, bool9.booleanValue(), list, c);
            }
            k41.b.B(eVar, "viewerCanUnresolve");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j7 j7Var = (j7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j7Var.b);
        fVar.z0("isResolved");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(j7Var.c, bVar2, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(n7.a, false)).b(fVar, wVar, j7Var.d);
        fVar.z0("viewerCanResolve");
        jo.f4Shadow.C(j7Var.e, bVar2, fVar, wVar, "viewerCanUnresolve");
        jo.f4Shadow.C(j7Var.f, bVar2, fVar, wVar, "diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(l7.a, true)))).b(fVar, wVar, j7Var.g);
        List list = eu0.b.a;
        eu0.b.d(fVar, wVar, j7Var.h);
    }
}
