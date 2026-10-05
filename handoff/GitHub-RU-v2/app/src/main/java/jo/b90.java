package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b90 {
    public final String a;
    public final String b;

    public b90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b90)) {
            return false;
        }
        b90 b90Var = (b90) obj;
        return k71.k.b(this.a, b90Var.a) && k71.k.b(this.b, b90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequestReview(id=", this.a, ", __typename=", this.b, ")");
    }
}
