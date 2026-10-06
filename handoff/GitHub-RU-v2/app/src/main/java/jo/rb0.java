package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rb0 {
    public String a;
    public Boolean b;

    public rb0(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return k71.k.b(this.a, rb0Var.a) && k71.k.b(this.b, rb0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "MarkNotificationAsDone(__typename=" + this.a + ", success=" + this.b + ")";
    }
}
