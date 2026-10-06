package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fy {
    public String a;
    public xx b;
    public String c;

    public fy(String str, xx xxVar, String str2) {
        this.a = str;
        this.b = xxVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return k71.k.b(this.a, fyVar.a) && k71.k.b(this.b, fyVar.b) && k71.k.b(this.c, fyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xx xxVar = this.b;
        return this.c.hashCode() + ((hashCode + (xxVar == null ? 0 : xxVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", mergeQueue=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
