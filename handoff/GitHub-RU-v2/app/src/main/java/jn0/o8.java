package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o8 {
    public final String a;
    public final k8 b;

    public o8(String str, k8 k8Var) {
        this.a = str;
        this.b = k8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return k71.k.b(this.a, o8Var.a) && k71.k.b(this.b, o8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k8 k8Var = this.b;
        return hashCode + (k8Var == null ? 0 : k8Var.hashCode());
    }

    public final String toString() {
        return "DeleteDiscussionComment(__typename=" + this.a + ", comment=" + this.b + ")";
    }
}
