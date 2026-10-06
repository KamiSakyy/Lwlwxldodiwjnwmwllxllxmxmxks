package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public String a;
    public d1 b;
    public h1 c;
    public m1 d;
    public e1 e;
    public l1 f;
    public f1Shadow g;
    public g1 h;
    public n1 i;
    public j1 j;
    public i1 k;
    public k1 l;
    public kw0.a m;

    public i0(String str, d1 d1Var, h1 h1Var, m1 m1Var, e1 e1Var, l1 l1Var, f1Shadow f1Var, g1 g1Var, n1 n1Var, j1 j1Var, i1 i1Var, k1 k1Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = d1Var;
        this.c = h1Var;
        this.d = m1Var;
        this.e = e1Var;
        this.f = l1Var;
        this.g = f1Var;
        this.h = g1Var;
        this.i = n1Var;
        this.j = j1Var;
        this.k = i1Var;
        this.l = k1Var;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d) && k71.k.b(this.e, i0Var.e) && k71.k.b(this.f, i0Var.f) && k71.k.b(this.g, i0Var.g) && k71.k.b(this.h, i0Var.h) && k71.k.b(this.i, i0Var.i) && k71.k.b(this.j, i0Var.j) && k71.k.b(this.k, i0Var.k) && k71.k.b(this.l, i0Var.l) && k71.k.b(this.m, i0Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d1 d1Var = this.b;
        int hashCode2 = (hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        h1 h1Var = this.c;
        int hashCode3 = (hashCode2 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        m1 m1Var = this.d;
        int hashCode4 = (hashCode3 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        e1 e1Var = this.e;
        int hashCode5 = (hashCode4 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        l1 l1Var = this.f;
        int hashCode6 = (hashCode5 + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        f1Shadow f1Var = this.g;
        int hashCode7 = (hashCode6 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        g1 g1Var = this.h;
        int hashCode8 = (hashCode7 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        n1 n1Var = this.i;
        int hashCode9 = (hashCode8 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        j1 j1Var = this.j;
        int hashCode10 = (hashCode9 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        i1 i1Var = this.k;
        int hashCode11 = (hashCode10 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        k1 k1Var = this.l;
        int hashCode12 = (hashCode11 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        kw0.a aVar = this.m;
        return hashCode12 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2ItemFieldDateValue=");
        sb.append(this.b);
        sb.append(", onProjectV2ItemFieldNumberValue=");
        sb.append(this.c);
        sb.append(", onProjectV2ItemFieldTextValue=");
        sb.append(this.d);
        sb.append(", onProjectV2ItemFieldIterationValue=");
        sb.append(this.e);
        sb.append(", onProjectV2ItemFieldSingleSelectValue=");
        sb.append(this.f);
        sb.append(", onProjectV2ItemFieldLabelValue=");
        sb.append(this.g);
        sb.append(", onProjectV2ItemFieldMilestoneValue=");
        sb.append(this.h);
        sb.append(", onProjectV2ItemFieldUserValue=");
        sb.append(this.i);
        sb.append(", onProjectV2ItemFieldRepositoryValue=");
        sb.append(this.j);
        sb.append(", onProjectV2ItemFieldPullRequestValue=");
        sb.append(this.k);
        sb.append(", onProjectV2ItemFieldReviewerValue=");
        sb.append(this.l);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.m, ")");
    }
}
