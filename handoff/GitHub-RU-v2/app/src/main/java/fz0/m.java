package fz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public String a;
    public j b;
    public k c;
    public i d;
    public kw0.a e;

    public m(String str, j jVar, k kVar, i iVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = jVar;
        this.c = kVar;
        this.d = iVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j jVar = this.b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.a.hashCode())) * 31;
        k kVar = this.c;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        i iVar = this.d;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        kw0.a aVar = this.e;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(__typename=");
        sb.append(this.a);
        sb.append(", onWorkflow=");
        sb.append(this.b);
        sb.append(", onWorkflowRun=");
        sb.append(this.c);
        sb.append(", onPullRequest=");
        sb.append(this.d);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.e, ")");
    }
}
