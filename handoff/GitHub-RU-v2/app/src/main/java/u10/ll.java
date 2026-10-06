package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ll {
    public jl a;
    public String b;
    public String c;

    public ll(jl jlVar, String str, String str2) {
        this.a = jlVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return k71.k.b(this.a, llVar.a) && k71.k.b(this.b, llVar.b) && k71.k.b(this.c, llVar.c);
    }

    public final int hashCode() {
        jl jlVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((jlVar == null ? 0 : jlVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(discussion=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
