package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ut {
    public String a;
    public qt b;
    public String c;

    public ut(String str, qt qtVar, String str2) {
        this.a = str;
        this.b = qtVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj;
        return k71.k.b(this.a, utVar.a) && k71.k.b(this.b, utVar.b) && k71.k.b(this.c, utVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qt qtVar = this.b;
        return this.c.hashCode() + ((hashCode + (qtVar == null ? 0 : qtVar.hashCode())) * 31);
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
