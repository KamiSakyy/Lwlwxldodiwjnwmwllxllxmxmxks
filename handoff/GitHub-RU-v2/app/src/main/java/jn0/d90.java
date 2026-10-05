package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d90 {
    public final String a;
    public final Boolean b;

    public d90(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        return k71.k.b(this.a, d90Var.a) && k71.k.b(this.b, d90Var.b);
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
