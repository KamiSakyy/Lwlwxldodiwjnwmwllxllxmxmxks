package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qd {
    public final String a;
    public final ld b;
    public final String c;

    public qd(String str, ld ldVar, String str2) {
        this.a = str;
        this.b = ldVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return k71.k.b(this.a, qdVar.a) && k71.k.b(this.b, qdVar.b) && k71.k.b(this.c, qdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ld ldVar = this.b;
        return this.c.hashCode() + ((hashCode + (ldVar == null ? 0 : ldVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
