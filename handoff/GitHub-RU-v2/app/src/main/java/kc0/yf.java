package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yf {
    public String a;
    public gg b;
    public bl0.a c;

    public yf(String str, gg ggVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ggVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return k71.k.b(this.a, yfVar.a) && k71.k.b(this.b, yfVar.b) && k71.k.b(this.c, yfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gg ggVar = this.b;
        int hashCode2 = (hashCode + (ggVar == null ? 0 : ggVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
