package p20;

import java.util.List;
import u10.kw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fm implements aaShadow.a {
    public static final fm a = new fm();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
        w80.c1 c = w80.q1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kw(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kw kwVar = (kw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kwVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kwVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, kwVar.b);
        List list = w80.q1.a;
        w80.c1 c1Var = kwVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, c1Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, c1Var.b);
        fVar.z0("databaseId");
        nn.a aVar = y20.a.a;
        aa.c.b(aVar).b(fVar, wVar, c1Var.c);
        fVar.z0("contributorsCount");
        aVar.b(fVar, wVar, Integer.valueOf(c1Var.d));
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(w80.e1.a, true)).b(fVar, wVar, c1Var.e);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(w80.d1.a, true)).b(fVar, wVar, c1Var.f);
        fVar.z0("forkCount");
        aVar.b(fVar, wVar, Integer.valueOf(c1Var.g));
        fVar.z0("hasIssuesEnabled");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(c1Var.h, bVar3, fVar, wVar, "showActions");
        jo.f4Shadow.C(c1Var.i, bVar3, fVar, wVar, "homepageUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, c1Var.j);
        fVar.z0("isPrivate");
        jo.f4Shadow.C(c1Var.k, bVar3, fVar, wVar, "isArchived");
        jo.f4Shadow.C(c1Var.l, bVar3, fVar, wVar, "isTemplate");
        jo.f4Shadow.C(c1Var.m, bVar3, fVar, wVar, "isFork");
        jo.f4Shadow.C(c1Var.n, bVar3, fVar, wVar, "isEmpty");
        jo.f4Shadow.C(c1Var.o, bVar3, fVar, wVar, "isInOrganization");
        jo.f4Shadow.C(c1Var.p, bVar3, fVar, wVar, "issues");
        aa.c.c(w80.f1Shadow.a, false).b(fVar, wVar, c1Var.q);
        fVar.z0("name");
        bVar2.b(fVar, wVar, c1Var.r);
        fVar.z0("owner");
        aa.c.c(w80.k1.a, true).b(fVar, wVar, c1Var.s);
        fVar.z0("pullRequests");
        aa.c.c(w80.m1.a, false).b(fVar, wVar, c1Var.t);
        fVar.z0("refs");
        aa.c.b(aa.c.c(w80.o1.a, false)).b(fVar, wVar, c1Var.u);
        fVar.z0("readme");
        aa.c.b(aa.c.c(w80.n1.a, false)).b(fVar, wVar, c1Var.v);
        fVar.z0("repositoryTopics");
        aa.c.c(w80.r1.a, false).b(fVar, wVar, c1Var.w);
        fVar.z0("url");
        bVar2.b(fVar, wVar, c1Var.x);
        fVar.z0("shortDescriptionHTML");
        bVar2.b(fVar, wVar, c1Var.y);
        fVar.z0("descriptionHTML");
        bVar2.b(fVar, wVar, c1Var.z);
        fVar.z0("description");
        o0Var.b(fVar, wVar, c1Var.A);
        fVar.z0("viewerCanAdminister");
        jo.f4Shadow.C(c1Var.B, bVar3, fVar, wVar, "viewerCanPush");
        jo.f4Shadow.C(c1Var.C, bVar3, fVar, wVar, "viewerCanSubscribe");
        jo.f4Shadow.C(c1Var.D, bVar3, fVar, wVar, "viewerPermission");
        aa.c.b(ic0.b.h).b(fVar, wVar, c1Var.E);
        fVar.z0("watchers");
        aa.c.c(w80.t1.a, false).b(fVar, wVar, c1Var.F);
        fVar.z0("licenseInfo");
        aa.c.b(aa.c.c(w80.h1.a, true)).b(fVar, wVar, c1Var.G);
        fVar.z0("isDiscussionsEnabled");
        jo.f4Shadow.C(c1Var.H, bVar3, fVar, wVar, "discussionsCount");
        aVar.b(fVar, wVar, Integer.valueOf(c1Var.I));
        fVar.z0("parent");
        aa.c.b(aa.c.c(w80.l1.a, false)).b(fVar, wVar, c1Var.J);
        fVar.z0("releases");
        aa.c.c(w80.p1.a, false).b(fVar, wVar, c1Var.K);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(w80.g1.a, false)).b(fVar, wVar, c1Var.L);
        fVar.z0("isViewersFavorite");
        jo.f4Shadow.C(c1Var.M, bVar3, fVar, wVar, "viewerHasBlockedContributors");
        jo.f4Shadow.C(c1Var.N, bVar3, fVar, wVar, "viewerBlockedByOwner");
        bVar3.b(fVar, wVar, Boolean.valueOf(c1Var.O));
        List list2 = w80.m.a;
        w80.m.d(fVar, wVar, c1Var.P);
        m90.e eVar = m90.e.a;
        m90.e.d(fVar, wVar, c1Var.Q);
        List list3 = ea0.x0.a;
        ea0.u0 u0Var = c1Var.R;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("topContributors");
        aa.c.a(aa.c.c(ea0.w0.a, true)).e(fVar, wVar, u0Var.a);
        fVar.z0("id");
        aa.b bVar4 = aa.c.a;
        bVar4.b(fVar, wVar, u0Var.b);
        fVar.z0("__typename");
        bVar4.b(fVar, wVar, u0Var.c);
        w80.z3 z3Var = w80.z3.a;
        w80.z3.d(fVar, wVar, c1Var.S);
        w80.o3 o3Var = w80.o3.a;
        w80.o3.d(fVar, wVar, c1Var.T);
    }
}
