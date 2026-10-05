package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oa {
    public final String a;
    public final na b;
    public final String c;

    public oa(String str, na naVar, String str2) {
        this.a = str;
        this.b = naVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return k71.k.b(this.a, oaVar.a) && k71.k.b(this.b, oaVar.b) && k71.k.b(this.c, oaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        na naVar = this.b;
        return this.c.hashCode() + ((hashCode + (naVar == null ? 0 : naVar.hashCode())) * 31);
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
