package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia {
    public String a;
    public ga b;
    public String c;

    public ia(String str, ga gaVar, String str2) {
        this.a = str;
        this.b = gaVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return k71.k.b(this.a, iaVar.a) && k71.k.b(this.b, iaVar.b) && k71.k.b(this.c, iaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ga gaVar = this.b;
        return this.c.hashCode() + ((hashCode + (gaVar == null ? 0 : gaVar.hashCode())) * 31);
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
