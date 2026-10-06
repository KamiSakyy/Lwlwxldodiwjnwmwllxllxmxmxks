package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class um {
    public String a;
    public tm b;
    public String c;

    public um(String str, tm tmVar, String str2) {
        this.a = str;
        this.b = tmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return k71.k.b(this.a, umVar.a) && k71.k.b(this.b, umVar.b) && k71.k.b(this.c, umVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tm tmVar = this.b;
        return this.c.hashCode() + ((hashCode + (tmVar == null ? 0 : tmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
