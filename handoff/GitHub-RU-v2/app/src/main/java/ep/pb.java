package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class pb implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static jo.eh c(ea.e eVar, aa.w wVar) {
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
        gv.h1 c = gv.o1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.eh(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.eh ehVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ehVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ehVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ehVar.b);
        List list = gv.o1.a;
        gv.h1 h1Var = ehVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, h1Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, h1Var.b);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, h1Var.c);
        fVar.z0("viewerCanEditFiles");
        jo.f4Shadow.C(h1Var.d, aa.c.f, fVar, wVar, "baseRefName");
        bVar2.b(fVar, wVar, h1Var.e);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, h1Var.f);
        fVar.z0("additions");
        fVar.z(h1Var.g);
        fVar.z0("deletions");
        fVar.z(h1Var.h);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(gv.p1.a, false)).b(fVar, wVar, h1Var.i);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(gv.q1.a, false)).b(fVar, wVar, h1Var.j);
        fVar.z0("repository");
        aa.c.c(gv.a2.a, true).b(fVar, wVar, h1Var.k);
        fVar.z0("diff");
        aa.c.b(aa.c.c(gv.j1.a, false)).b(fVar, wVar, h1Var.l);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(gv.z1.a, false)).b(fVar, wVar, h1Var.m);
        fVar.z0("files");
        aa.c.b(aa.c.c(gv.n1.a, false)).b(fVar, wVar, h1Var.n);
        gv.j0 j0Var = gv.j0.a;
        gv.j0.d(fVar, wVar, h1Var.o);
    }
}
