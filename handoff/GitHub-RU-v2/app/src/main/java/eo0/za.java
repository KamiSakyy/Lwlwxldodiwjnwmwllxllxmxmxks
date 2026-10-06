package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class za implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static jn0.hg c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        xt0.x0 c = xt0.e1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.hg(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.hg hgVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hgVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hgVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, hgVar.b);
        List list = xt0.e1.a;
        xt0.x0 x0Var = hgVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, x0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, x0Var.b);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, x0Var.c);
        fVar.z0("viewerCanEditFiles");
        jo.f4Shadow.C(x0Var.d, aa.c.f, fVar, wVar, "baseRefName");
        bVar2.b(fVar, wVar, x0Var.e);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, x0Var.f);
        fVar.z0("additions");
        fVar.z(x0Var.g);
        fVar.z0("deletions");
        fVar.z(x0Var.h);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(xt0.f1Shadow.a, false)).b(fVar, wVar, x0Var.i);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(xt0.g1.a, false)).b(fVar, wVar, x0Var.j);
        fVar.z0("repository");
        aa.c.c(xt0.q1.a, true).b(fVar, wVar, x0Var.k);
        fVar.z0("diff");
        aa.c.b(aa.c.c(xt0.z0.a, false)).b(fVar, wVar, x0Var.l);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(xt0.p1.a, false)).b(fVar, wVar, x0Var.m);
        fVar.z0("files");
        aa.c.b(aa.c.c(xt0.d1.a, false)).b(fVar, wVar, x0Var.n);
        xt0.z zVar = xt0.z.a;
        xt0.z.d(fVar, wVar, x0Var.o);
    }
}
