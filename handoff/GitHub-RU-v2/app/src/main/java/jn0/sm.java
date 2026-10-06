package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sm {
    public String a;
    public vm b;
    public kw0.a c;

    public sm(String str, vm vmVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = vmVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm)) {
            return false;
        }
        sm smVar = (sm) obj;
        return k71.k.b(this.a, smVar.a) && k71.k.b(this.b, smVar.b) && k71.k.b(this.c, smVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vm vmVar = this.b;
        int hashCode2 = (hashCode + (vmVar == null ? 0 : vmVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueOrPullRequest(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
