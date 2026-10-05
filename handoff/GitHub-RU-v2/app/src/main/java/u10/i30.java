package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i30 {
    public final String a;
    public final Boolean b;

    public i30(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i30)) {
            return false;
        }
        i30 i30Var = (i30) obj;
        return k71.k.b(this.a, i30Var.a) && k71.k.b(this.b, i30Var.b);
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
