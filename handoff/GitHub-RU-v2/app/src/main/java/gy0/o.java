package gy0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements w0 {
    public static final l Companion = new l();
    public final String r;

    public o(String str) {
        this.r = str;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = ky0.b.a;
        List list2 = ky0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.r, ((o) obj).r);
    }

    public final p0 g() {
        return aa.c.c(hy0.j.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "f4584c2a9942eec8677c06bba4423e8616e27c85c45473e7b4abecd66d2a6c30";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectV2ContentRelatedProjects($contentId: ID!) { node(id: $contentId) { __typename id ...ProjectV2RelatedProjectsIssue ...ProjectV2RelatedProjectsPullRequest } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2RelatedProjectsIssue on Issue { __typename id projectsV2(first: 5, after: null) { nodes { __typename ...SimpleProjectV2Fragment id } } }  fragment ProjectV2RelatedProjectsPullRequest on PullRequest { __typename id projectsV2(first: 5, after: null) { nodes { __typename ...SimpleProjectV2Fragment id } } }";
    }

    public final String name() {
        return "FetchProjectV2ContentRelatedProjects";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("contentId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FetchProjectV2ContentRelatedProjectsQuery(contentId=", this.r, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }
}
