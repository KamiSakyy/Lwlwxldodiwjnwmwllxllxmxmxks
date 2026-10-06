package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a7 {
    public final String a;
    public final String b;

    public a7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return k71.k.b(this.a, a7Var.a) && k71.k.b(this.b, a7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequestReview(id=", this.a, ", __typename=", this.b, ")");
    }
}
