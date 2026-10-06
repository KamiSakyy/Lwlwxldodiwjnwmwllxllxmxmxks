package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h6 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public aa1.b d;
    public aa1.b e;
    public aa1.b f;
    public aa1.b g;
    public aa1.b h;
    public aa1.b i;
    public String j;
    public String k;

    public h6(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5, aa1.b bVar6, aa1.b bVar7, String str, String str2) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "title");
        this.a = bVar;
        this.b = bVar2;
        aa.t0 t0Var = aa.t0.d;
        this.c = t0Var;
        this.d = bVar3;
        this.e = bVar4;
        this.f = bVar5;
        this.g = bVar6;
        this.h = bVar7;
        this.i = t0Var;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return k71.k.b(this.a, h6Var.a) && k71.k.b(this.b, h6Var.b) && k71.k.b(this.c, h6Var.c) && k71.k.b(this.d, h6Var.d) && k71.k.b(this.e, h6Var.e) && k71.k.b(this.f, h6Var.f) && k71.k.b(this.g, h6Var.g) && k71.k.b(this.h, h6Var.h) && k71.k.b(this.i, h6Var.i) && k71.k.b(this.j, h6Var.j) && k71.k.b(this.k, h6Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.i, f1.e.a(this.h, f1.e.a(this.g, f1.e.a(this.f, f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("CreateIssueInput(assigneeIds=", this.a, ", body=", this.b, ", clientMutationId=");
        f1.e.w(u, this.c, ", issueTemplate=", this.d, ", issueTypeId=");
        f1.e.w(u, this.e, ", labelIds=", this.f, ", milestoneId=");
        f1.e.w(u, this.g, ", parentIssueId=", this.h, ", projectIds=");
        u.append(this.i);
        u.append(", repositoryId=");
        u.append(this.j);
        u.append(", title=");
        return com.github.rudroid.copilot.h1.p(u, this.k, ")");
    }

    public Object e;
}
