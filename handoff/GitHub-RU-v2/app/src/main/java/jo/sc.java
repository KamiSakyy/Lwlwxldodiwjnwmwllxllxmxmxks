package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sc {
    public String a;
    public rc b;
    public String c;

    public sc(String str, rc rcVar, String str2) {
        this.a = str;
        this.b = rcVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return k71.k.b(this.a, scVar.a) && k71.k.b(this.b, scVar.b) && k71.k.b(this.c, scVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rc rcVar = this.b;
        return this.c.hashCode() + ((hashCode + (rcVar == null ? 0 : rcVar.hashCode())) * 31);
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
