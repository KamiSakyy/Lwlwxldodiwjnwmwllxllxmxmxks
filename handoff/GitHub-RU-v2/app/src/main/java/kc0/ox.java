package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ox {
    public final String a;
    public final nx b;
    public final String c;

    public ox(String str, nx nxVar, String str2) {
        this.a = str;
        this.b = nxVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox)) {
            return false;
        }
        ox oxVar = (ox) obj;
        return k71.k.b(this.a, oxVar.a) && k71.k.b(this.b, oxVar.b) && k71.k.b(this.c, oxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nx nxVar = this.b;
        return this.c.hashCode() + ((hashCode + (nxVar == null ? 0 : nxVar.hashCode())) * 31);
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
