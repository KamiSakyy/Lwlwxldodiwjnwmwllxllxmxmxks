package fd0;

import java.util.List;
import kc0.jy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pn implements aaShadow.a {
    public static final pn a = new pn();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        oj0.f1 c = oj0.u1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jy(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jy jyVar = (jy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jyVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jyVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, jyVar.b);
        List list = oj0.u1.a;
        oj0.f1 f1Var = jyVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, f1Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, f1Var.b);
        fVar.z0("databaseId");
        nn.a aVar = od0.b.a;
        aa.c.b(aVar).b(fVar, wVar, f1Var.c);
        fVar.z0("contributorsCount");
        aVar.b(fVar, wVar, Integer.valueOf(f1Var.d));
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(oj0.h1.a, true)).b(fVar, wVar, f1Var.e);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(oj0.g1.a, true)).b(fVar, wVar, f1Var.f);
        fVar.z0("forkCount");
        aVar.b(fVar, wVar, Integer.valueOf(f1Var.g));
        fVar.z0("hasIssuesEnabled");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(f1Var.h, bVar3, fVar, wVar, "showActions");
        jo.f4.C(f1Var.i, bVar3, fVar, wVar, "homepageUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, f1Var.j);
        fVar.z0("isPrivate");
        jo.f4.C(f1Var.k, bVar3, fVar, wVar, "isArchived");
        jo.f4.C(f1Var.l, bVar3, fVar, wVar, "isTemplate");
        jo.f4.C(f1Var.m, bVar3, fVar, wVar, "isFork");
        jo.f4.C(f1Var.n, bVar3, fVar, wVar, "isEmpty");
        jo.f4.C(f1Var.o, bVar3, fVar, wVar, "isInOrganization");
        jo.f4.C(f1Var.p, bVar3, fVar, wVar, "issues");
        aa.c.c(oj0.i1.a, false).b(fVar, wVar, f1Var.q);
        fVar.z0("name");
        bVar2.b(fVar, wVar, f1Var.r);
        fVar.z0("owner");
        aa.c.c(oj0.o1.a, true).b(fVar, wVar, f1Var.s);
        fVar.z0("pullRequests");
        aa.c.c(oj0.q1.a, false).b(fVar, wVar, f1Var.t);
        fVar.z0("refs");
        aa.c.b(aa.c.c(oj0.s1.a, false)).b(fVar, wVar, f1Var.u);
        fVar.z0("readme");
        aa.c.b(aa.c.c(oj0.r1.a, false)).b(fVar, wVar, f1Var.v);
        fVar.z0("repositoryTopics");
        aa.c.c(oj0.v1.a, false).b(fVar, wVar, f1Var.w);
        fVar.z0("url");
        bVar2.b(fVar, wVar, f1Var.x);
        fVar.z0("shortDescriptionHTML");
        bVar2.b(fVar, wVar, f1Var.y);
        fVar.z0("descriptionHTML");
        bVar2.b(fVar, wVar, f1Var.z);
        fVar.z0("description");
        o0Var.b(fVar, wVar, f1Var.A);
        fVar.z0("viewerCanAdminister");
        jo.f4.C(f1Var.B, bVar3, fVar, wVar, "viewerCanPush");
        jo.f4.C(f1Var.C, bVar3, fVar, wVar, "viewerCanSubscribe");
        jo.f4.C(f1Var.D, bVar3, fVar, wVar, "viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, f1Var.E);
        fVar.z0("watchers");
        aa.c.c(oj0.x1.a, false).b(fVar, wVar, f1Var.F);
        fVar.z0("licenseInfo");
        aa.c.b(aa.c.c(oj0.k1.a, true)).b(fVar, wVar, f1Var.G);
        fVar.z0("isDiscussionsEnabled");
        jo.f4.C(f1Var.H, bVar3, fVar, wVar, "discussionsCount");
        aVar.b(fVar, wVar, Integer.valueOf(f1Var.I));
        fVar.z0("parent");
        aa.c.b(aa.c.c(oj0.p1.a, false)).b(fVar, wVar, f1Var.J);
        fVar.z0("releases");
        aa.c.c(oj0.t1.a, false).b(fVar, wVar, f1Var.K);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(oj0.j1.a, false)).b(fVar, wVar, f1Var.L);
        fVar.z0("isViewersFavorite");
        jo.f4.C(f1Var.M, bVar3, fVar, wVar, "viewerHasBlockedContributors");
        jo.f4.C(f1Var.N, bVar3, fVar, wVar, "viewerBlockedByOwner");
        jo.f4.C(f1Var.O, bVar3, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(oj0.l1.a, true)).b(fVar, wVar, f1Var.P);
        List list2 = oj0.m.a;
        oj0.m.d(fVar, wVar, f1Var.Q);
        ek0.f fVar2 = ek0.f.a;
        ek0.f.d(fVar, wVar, f1Var.R);
        List list3 = wk0.x0.a;
        wk0.u0 u0Var = f1Var.S;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("topContributors");
        aa.c.a(aa.c.c(wk0.w0.a, true)).e(fVar, wVar, u0Var.a);
        fVar.z0("id");
        aa.b bVar4 = aa.c.a;
        bVar4.b(fVar, wVar, u0Var.b);
        fVar.z0("__typename");
        bVar4.b(fVar, wVar, u0Var.c);
        oj0.f4 f4Var = oj0.f4.a;
        oj0.f4.d(fVar, wVar, f1Var.T);
        oj0.t3 t3Var = oj0.t3.a;
        oj0.t3.d(fVar, wVar, f1Var.U);
    }
}
