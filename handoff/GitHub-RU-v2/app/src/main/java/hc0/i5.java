package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public aa1.b d;
    public aa1.b e;
    public aa1.b f;
    public aa1.b g;
    public String h;
    public String i;

    public i5(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5, String str, String str2) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "title");
        this.a = bVar;
        this.b = bVar2;
        aa.t0 t0Var = aa.t0.d;
        this.c = t0Var;
        this.d = bVar3;
        this.e = bVar4;
        this.f = bVar5;
        this.g = t0Var;
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c) && k71.k.b(this.d, i5Var.d) && k71.k.b(this.e, i5Var.e) && k71.k.b(this.f, i5Var.f) && k71.k.b(this.g, i5Var.g) && k71.k.b(this.h, i5Var.h) && k71.k.b(this.i, i5Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.g, f1.e.a(this.f, f1.e.a(this.e, f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("CreateIssueInput(assigneeIds=", this.a, ", body=", this.b, ", clientMutationId=");
        f1.e.w(u, this.c, ", issueTemplate=", this.d, ", labelIds=");
        f1.e.w(u, this.e, ", milestoneId=", this.f, ", projectIds=");
        u.append(this.g);
        u.append(", repositoryId=");
        u.append(this.h);
        u.append(", title=");
        return com.github.rudroid.copilot.h1.p(u, this.i, ")");
    }

    public Object e;
}
