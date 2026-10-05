package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ce0 {
    public final String a;
    public final String b;

    public ce0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        return k71.k.b(this.a, ce0Var.a) && k71.k.b(this.b, ce0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequest(id=", this.a, ", __typename=", this.b, ")");
    }
}
