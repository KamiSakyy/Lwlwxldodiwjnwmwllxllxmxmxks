package kc0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s00 implements aa.n0 {
    public static final o00 Companion = new o00();
    public final String r;
    public final ArrayList s;

    public s00(String str, ArrayList arrayList) {
        k71.k.g(str, "labelableId");
        this.r = str;
        this.s = arrayList;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.r4.a;
        List list2 = en0.r4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return k71.k.b(this.r, s00Var.r) && this.s.equals(s00Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ep.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b9b5e4bc182109fb65e5498c482630360bc7f20f8c7900d69baac140bdd0f195";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SetLabelsForLabelableMutation($labelableId: ID!, $labelIds: [ID!]!) { setLabelsForLabelable(input: { labelableId: $labelableId labelIds: $labelIds } ) { labelableRecord { __typename ...LabelsFragment } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }";
    }

    public final String name() {
        return "SetLabelsForLabelableMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("labelableId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("labelIds");
        aa.c.a(bVar).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "SetLabelsForLabelableMutation(labelableId=" + this.r + ", labelIds=" + this.s + ")";
    }
}
