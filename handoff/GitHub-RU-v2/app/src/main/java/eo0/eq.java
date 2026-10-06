package eo0;

import java.util.List;
import jn0.p10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eq implements aaShadow.a {
    public static final eq a = new eq();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        uu0.i2 c = uu0.a3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p10(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p10 p10Var = (p10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p10Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p10Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p10Var.b);
        List list = uu0.a3.a;
        uu0.i2 i2Var = p10Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i2Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, i2Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, i2Var.b);
        fVar.z0("databaseId");
        nn.a aVar = ro0.a.a;
        aa.c.b(aVar).b(fVar, wVar, i2Var.c);
        fVar.z0("contributorsCount");
        f1.e.v(i2Var.d, aVar, fVar, wVar, "defaultBranchRef");
        aa.c.b(aa.c.c(uu0.k2.a, true)).b(fVar, wVar, i2Var.e);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(uu0.j2.a, true)).b(fVar, wVar, i2Var.f);
        fVar.z0("forkCount");
        f1.e.v(i2Var.g, aVar, fVar, wVar, "hasIssuesEnabled");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(i2Var.h, bVar3, fVar, wVar, "showActions");
        jo.f4Shadow.C(i2Var.i, bVar3, fVar, wVar, "homepageUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, i2Var.j);
        fVar.z0("isPrivate");
        jo.f4Shadow.C(i2Var.k, bVar3, fVar, wVar, "isArchived");
        jo.f4Shadow.C(i2Var.l, bVar3, fVar, wVar, "isTemplate");
        jo.f4Shadow.C(i2Var.m, bVar3, fVar, wVar, "isFork");
        jo.f4Shadow.C(i2Var.n, bVar3, fVar, wVar, "forkingAllowed");
        jo.f4Shadow.C(i2Var.o, bVar3, fVar, wVar, "isEmpty");
        jo.f4Shadow.C(i2Var.p, bVar3, fVar, wVar, "isInOrganization");
        jo.f4Shadow.C(i2Var.q, bVar3, fVar, wVar, "issues");
        aa.c.c(uu0.m2.a, false).b(fVar, wVar, i2Var.r);
        fVar.z0("name");
        bVar2.b(fVar, wVar, i2Var.s);
        fVar.z0("owner");
        aa.c.c(uu0.t2.a, true).b(fVar, wVar, i2Var.t);
        fVar.z0("pullRequests");
        aa.c.c(uu0.w2.a, false).b(fVar, wVar, i2Var.u);
        fVar.z0("refs");
        aa.c.b(aa.c.c(uu0.y2.a, false)).b(fVar, wVar, i2Var.v);
        fVar.z0("readme");
        aa.c.b(aa.c.c(uu0.x2.a, false)).b(fVar, wVar, i2Var.w);
        fVar.z0("repositoryTopics");
        aa.c.c(uu0.b3.a, false).b(fVar, wVar, i2Var.x);
        fVar.z0("url");
        bVar2.b(fVar, wVar, i2Var.y);
        fVar.z0("shortDescriptionHTML");
        bVar2.b(fVar, wVar, i2Var.z);
        fVar.z0("descriptionHTML");
        bVar2.b(fVar, wVar, i2Var.A);
        fVar.z0("description");
        o0Var.b(fVar, wVar, i2Var.B);
        fVar.z0("viewerCanAdminister");
        jo.f4Shadow.C(i2Var.C, bVar3, fVar, wVar, "viewerCanPush");
        jo.f4Shadow.C(i2Var.D, bVar3, fVar, wVar, "viewerCanSubscribe");
        jo.f4Shadow.C(i2Var.E, bVar3, fVar, wVar, "viewerPermission");
        aa.c.b(qz0.b.o).b(fVar, wVar, i2Var.F);
        fVar.z0("watchers");
        aa.c.c(uu0.d3.a, false).b(fVar, wVar, i2Var.G);
        fVar.z0("licenseInfo");
        aa.c.b(aa.c.c(uu0.o2.a, true)).b(fVar, wVar, i2Var.H);
        fVar.z0("isDiscussionsEnabled");
        jo.f4Shadow.C(i2Var.I, bVar3, fVar, wVar, "discussionsCount");
        f1.e.v(i2Var.J, aVar, fVar, wVar, "parent");
        aa.c.b(aa.c.c(uu0.u2.a, false)).b(fVar, wVar, i2Var.K);
        fVar.z0("releases");
        aa.c.c(uu0.z2.a, false).b(fVar, wVar, i2Var.L);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(uu0.n2.a, false)).b(fVar, wVar, i2Var.M);
        fVar.z0("isViewersFavorite");
        jo.f4Shadow.C(i2Var.N, bVar3, fVar, wVar, "viewerHasBlockedContributors");
        jo.f4Shadow.C(i2Var.O, bVar3, fVar, wVar, "viewerBlockedByOwner");
        jo.f4Shadow.C(i2Var.P, bVar3, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(uu0.p2.a, true)).b(fVar, wVar, i2Var.Q);
        fVar.z0("projectsV2");
        aa.c.c(uu0.v2.a, false).b(fVar, wVar, i2Var.R);
        fVar.z0("forks");
        aa.c.c(uu0.l2.a, false).b(fVar, wVar, i2Var.S);
        List list2 = uu0.t.a;
        uu0.t.d(fVar, wVar, i2Var.T);
        nv0.f fVar2 = nv0.f.a;
        nv0.f.d(fVar, wVar, i2Var.U);
        List list3 = fw0.x0.a;
        fw0.u0 u0Var = i2Var.V;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("topContributors");
        aa.c.a(aa.c.c(fw0.w0.a, true)).e(fVar, wVar, u0Var.a);
        fVar.z0("id");
        aa.b bVar4 = aa.c.a;
        bVar4.b(fVar, wVar, u0Var.b);
        fVar.z0("__typename");
        bVar4.b(fVar, wVar, u0Var.c);
        uu0.t6 t6Var = uu0.t6.a;
        uu0.t6.d(fVar, wVar, i2Var.W);
        uu0.x4 x4Var = uu0.x4.a;
        uu0.x4.d(fVar, wVar, i2Var.X);
    }
}
