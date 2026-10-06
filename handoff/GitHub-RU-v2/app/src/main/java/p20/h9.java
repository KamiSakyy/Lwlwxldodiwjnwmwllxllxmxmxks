package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h9 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static u10.wd c(ea.e eVar, aa.w wVar) {
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
        z70.w0 c = z70.d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.wd(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.wd wdVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wdVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wdVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, wdVar.b);
        List list = z70.d1.a;
        z70.w0 w0Var = wdVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, w0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, w0Var.b);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, w0Var.c);
        fVar.z0("viewerCanEditFiles");
        jo.f4.C(w0Var.d, aa.c.f, fVar, wVar, "baseRefName");
        bVar2.b(fVar, wVar, w0Var.e);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, w0Var.f);
        fVar.z0("additions");
        fVar.z(w0Var.g);
        fVar.z0("deletions");
        fVar.z(w0Var.h);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(z70.e1.a, false)).b(fVar, wVar, w0Var.i);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(z70.f1.a, false)).b(fVar, wVar, w0Var.j);
        fVar.z0("repository");
        aa.c.c(z70.p1.a, true).b(fVar, wVar, w0Var.k);
        fVar.z0("diff");
        aa.c.b(aa.c.c(z70.y0.a, false)).b(fVar, wVar, w0Var.l);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(z70.o1.a, false)).b(fVar, wVar, w0Var.m);
        fVar.z0("files");
        aa.c.b(aa.c.c(z70.c1.a, false)).b(fVar, wVar, w0Var.n);
        z70.y yVar = z70.y.a;
        z70.y.d(fVar, wVar, w0Var.o);
    }
}
