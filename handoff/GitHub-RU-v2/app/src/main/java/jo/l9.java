package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l9 {
    public final String a;
    public final h9 b;

    public l9(String str, h9 h9Var) {
        this.a = str;
        this.b = h9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return k71.k.b(this.a, l9Var.a) && k71.k.b(this.b, l9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h9 h9Var = this.b;
        return hashCode + (h9Var == null ? 0 : h9Var.hashCode());
    }

    public final String toString() {
        return "DeleteDiscussionComment(__typename=" + this.a + ", comment=" + this.b + ")";
    }
}
