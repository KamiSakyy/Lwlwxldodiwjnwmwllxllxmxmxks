package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g50 {
    public String a;
    public Boolean b;

    public g50(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return k71.k.b(this.a, g50Var.a) && k71.k.b(this.b, g50Var.b);
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
