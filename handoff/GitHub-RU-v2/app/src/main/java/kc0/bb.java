package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bb {
    public final String a;
    public final ab b;
    public final String c;

    public bb(String str, ab abVar, String str2) {
        this.a = str;
        this.b = abVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return k71.k.b(this.a, bbVar.a) && k71.k.b(this.b, bbVar.b) && k71.k.b(this.c, bbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ab abVar = this.b;
        return this.c.hashCode() + ((hashCode + (abVar == null ? 0 : abVar.hashCode())) * 31);
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
