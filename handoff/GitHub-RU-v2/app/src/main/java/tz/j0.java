package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public String a;
    public e1 b;
    public i1 c;
    public n1 d;
    public f1 e;
    public m1 f;
    public g1 g;
    public h1 h;
    public o1 i;
    public k1 j;
    public j1 k;
    public l1 l;
    public vx.a m;

    public j0(String str, e1 e1Var, i1 i1Var, n1 n1Var, f1 f1Var, m1 m1Var, g1 g1Var, h1 h1Var, o1 o1Var, k1 k1Var, j1 j1Var, l1 l1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e1Var;
        this.c = i1Var;
        this.d = n1Var;
        this.e = f1Var;
        this.f = m1Var;
        this.g = g1Var;
        this.h = h1Var;
        this.i = o1Var;
        this.j = k1Var;
        this.k = j1Var;
        this.l = l1Var;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && k71.k.b(this.c, j0Var.c) && k71.k.b(this.d, j0Var.d) && k71.k.b(this.e, j0Var.e) && k71.k.b(this.f, j0Var.f) && k71.k.b(this.g, j0Var.g) && k71.k.b(this.h, j0Var.h) && k71.k.b(this.i, j0Var.i) && k71.k.b(this.j, j0Var.j) && k71.k.b(this.k, j0Var.k) && k71.k.b(this.l, j0Var.l) && k71.k.b(this.m, j0Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e1 e1Var = this.b;
        int hashCode2 = (hashCode + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        i1 i1Var = this.c;
        int hashCode3 = (hashCode2 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        n1 n1Var = this.d;
        int hashCode4 = (hashCode3 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        f1 f1Var = this.e;
        int hashCode5 = (hashCode4 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        m1 m1Var = this.f;
        int hashCode6 = (hashCode5 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        g1 g1Var = this.g;
        int hashCode7 = (hashCode6 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        h1 h1Var = this.h;
        int hashCode8 = (hashCode7 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        o1 o1Var = this.i;
        int hashCode9 = (hashCode8 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        k1 k1Var = this.j;
        int hashCode10 = (hashCode9 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        j1 j1Var = this.k;
        int hashCode11 = (hashCode10 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        l1 l1Var = this.l;
        int hashCode12 = (hashCode11 + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        vx.a aVar = this.m;
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
        return jo.f4.r(sb, this.m, ")");
    }
}
