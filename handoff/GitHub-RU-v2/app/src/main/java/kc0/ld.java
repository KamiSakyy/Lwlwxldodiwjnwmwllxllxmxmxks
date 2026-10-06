package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ld {
    public final String a;
    public final kd b;
    public final String c;

    public ld(String str, kd kdVar, String str2) {
        this.a = str;
        this.b = kdVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return k71.k.b(this.a, ldVar.a) && k71.k.b(this.b, ldVar.b) && k71.k.b(this.c, ldVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kd kdVar = this.b;
        return this.c.hashCode() + ((hashCode + (kdVar == null ? 0 : kdVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", repoObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
