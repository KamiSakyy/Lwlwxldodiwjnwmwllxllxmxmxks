package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ta {
    public final String a;
    public final sa b;
    public final String c;

    public ta(String str, sa saVar, String str2) {
        this.a = str;
        this.b = saVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return k71.k.b(this.a, taVar.a) && k71.k.b(this.b, taVar.b) && k71.k.b(this.c, taVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sa saVar = this.b;
        return this.c.hashCode() + ((hashCode + (saVar == null ? 0 : saVar.hashCode())) * 31);
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
