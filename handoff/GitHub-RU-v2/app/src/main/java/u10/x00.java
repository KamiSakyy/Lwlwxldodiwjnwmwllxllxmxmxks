package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x00 {
    public final String a;
    public final String b;

    public x00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return k71.k.b(this.a, x00Var.a) && k71.k.b(this.b, x00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequestReview(id=", this.a, ", __typename=", this.b, ")");
    }
}
