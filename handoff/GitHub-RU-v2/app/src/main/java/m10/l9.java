package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l9 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public aa1.b d;
    public aa1.b e;
    public aa1.b f;
    public aa1.b g;
    public aa1.b h;
    public aa1.b i;
    public aa1.b j;
    public aa1.b k;
    public aa1.b l;
    public String m;
    public String n;

    public l9(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5, aa1.b bVar6, aa1.b bVar7, aa1.b bVar8, aa1.b bVar9, String str, String str2) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "title");
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        aa.t0 t0Var = aa.t0.d;
        this.d = t0Var;
        this.e = t0Var;
        this.f = bVar4;
        this.g = bVar5;
        this.h = bVar6;
        this.i = bVar7;
        this.j = bVar8;
        this.k = t0Var;
        this.l = bVar9;
        this.m = str;
        this.n = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return k71.k.b(this.a, l9Var.a) && k71.k.b(this.b, l9Var.b) && k71.k.b(this.c, l9Var.c) && k71.k.b(this.d, l9Var.d) && k71.k.b(this.e, l9Var.e) && k71.k.b(this.f, l9Var.f) && k71.k.b(this.g, l9Var.g) && k71.k.b(this.h, l9Var.h) && k71.k.b(this.i, l9Var.i) && k71.k.b(this.j, l9Var.j) && k71.k.b(this.k, l9Var.k) && k71.k.b(this.l, l9Var.l) && k71.k.b(this.m, l9Var.m) && k71.k.b(this.n, l9Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.l, f1.e.a(this.k, f1.e.a(this.j, f1.e.a(this.i, f1.e.a(this.h, f1.e.a(this.g, f1.e.a(this.f, f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), this.m, 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("CreateIssueInput(agentAssignment=", this.a, ", assigneeIds=", this.b, ", body=");
        f1.e.w(u, this.c, ", clientMutationId=", this.d, ", issueFields=");
        f1.e.w(u, this.e, ", issueTemplate=", this.f, ", issueTypeId=");
        f1.e.w(u, this.g, ", labelIds=", this.h, ", milestoneId=");
        f1.e.w(u, this.i, ", parentIssueId=", this.j, ", projectIds=");
        f1.e.w(u, this.k, ", projectV2Ids=", this.l, ", repositoryId=");
        return x.i.k(u, this.m, ", title=", this.n, ")");
    }

    public Object e;
}
