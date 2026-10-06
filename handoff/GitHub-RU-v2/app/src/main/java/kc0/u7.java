package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u7 {
    public final String a;
    public final q7 b;

    public u7(String str, q7 q7Var) {
        this.a = str;
        this.b = q7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return k71.k.b(this.a, u7Var.a) && k71.k.b(this.b, u7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q7 q7Var = this.b;
        return hashCode + (q7Var == null ? 0 : q7Var.hashCode());
    }

    public final String toString() {
        return "DeleteDiscussionComment(__typename=" + this.a + ", comment=" + this.b + ")";
    }
}
