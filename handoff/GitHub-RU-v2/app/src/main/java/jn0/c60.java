package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c60 {
    public final String a;
    public final b60 b;

    public c60(String str, b60 b60Var) {
        this.a = str;
        this.b = b60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c60)) {
            return false;
        }
        c60 c60Var = (c60) obj;
        return k71.k.b(this.a, c60Var.a) && k71.k.b(this.b, c60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b60 b60Var = this.b;
        return hashCode + (b60Var == null ? 0 : b60Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
