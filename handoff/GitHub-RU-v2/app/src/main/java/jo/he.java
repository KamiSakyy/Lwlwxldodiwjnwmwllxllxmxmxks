package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class he {
    public String a;
    public ge b;
    public String c;

    public he(String str, ge geVar, String str2) {
        this.a = str;
        this.b = geVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return k71.k.b(this.a, heVar.a) && k71.k.b(this.b, heVar.b) && k71.k.b(this.c, heVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ge geVar = this.b;
        return this.c.hashCode() + ((hashCode + (geVar == null ? 0 : geVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
