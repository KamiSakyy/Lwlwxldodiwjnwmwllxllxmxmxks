package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v20 {
    public final String a;
    public final String b;

    public v20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return k71.k.b(this.a, v20Var.a) && k71.k.b(this.b, v20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequestReview(id=", this.a, ", __typename=", this.b, ")");
    }
}
