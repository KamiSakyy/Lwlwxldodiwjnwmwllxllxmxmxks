package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xf {
    public String a;
    public fg b;
    public bl0.a c;

    public xf(String str, fg fgVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = fgVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return k71.k.b(this.a, xfVar.a) && k71.k.b(this.b, xfVar.b) && k71.k.b(this.c, xfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fg fgVar = this.b;
        int hashCode2 = (hashCode + (fgVar == null ? 0 : fgVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
