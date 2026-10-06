package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nc {
    public String a;
    public mc b;
    public String c;

    public nc(String str, mc mcVar, String str2) {
        this.a = str;
        this.b = mcVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return k71.k.b(this.a, ncVar.a) && k71.k.b(this.b, ncVar.b) && k71.k.b(this.c, ncVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mc mcVar = this.b;
        return this.c.hashCode() + ((hashCode + (mcVar == null ? 0 : mcVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
