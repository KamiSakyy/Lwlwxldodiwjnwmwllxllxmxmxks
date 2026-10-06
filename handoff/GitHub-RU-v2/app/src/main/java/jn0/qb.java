package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qb {
    public String a;
    public pb b;
    public String c;

    public qb(String str, pb pbVar, String str2) {
        this.a = str;
        this.b = pbVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return k71.k.b(this.a, qbVar.a) && k71.k.b(this.b, qbVar.b) && k71.k.b(this.c, qbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pb pbVar = this.b;
        return this.c.hashCode() + ((hashCode + (pbVar == null ? 0 : pbVar.hashCode())) * 31);
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
