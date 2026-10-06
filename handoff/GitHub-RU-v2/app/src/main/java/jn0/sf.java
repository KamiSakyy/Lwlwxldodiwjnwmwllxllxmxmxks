package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sf {
    public String a;
    public qf b;
    public String c;

    public sf(String str, qf qfVar, String str2) {
        this.a = str;
        this.b = qfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) obj;
        return k71.k.b(this.a, sfVar.a) && k71.k.b(this.b, sfVar.b) && k71.k.b(this.c, sfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qf qfVar = this.b;
        return this.c.hashCode() + ((hashCode + (qfVar == null ? 0 : qfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", object=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
