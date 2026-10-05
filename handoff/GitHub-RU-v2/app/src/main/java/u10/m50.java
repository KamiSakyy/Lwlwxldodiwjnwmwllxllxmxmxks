package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m50 {
    public final String a;
    public final String b;

    public m50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return k71.k.b(this.a, m50Var.a) && k71.k.b(this.b, m50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequest(id=", this.a, ", __typename=", this.b, ")");
    }
}
