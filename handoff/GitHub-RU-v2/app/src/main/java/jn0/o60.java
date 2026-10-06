package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o60 {
    public final String a;
    public final String b;

    public o60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o60)) {
            return false;
        }
        o60 o60Var = (o60) obj;
        return k71.k.b(this.a, o60Var.a) && k71.k.b(this.b, o60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequestReview(id=", this.a, ", __typename=", this.b, ")");
    }
}
