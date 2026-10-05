package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h30 implements aa.m0 {
    public final k30 a;
    public final i30 b;

    public h30(k30 k30Var, i30 i30Var) {
        this.a = k30Var;
        this.b = i30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h30)) {
            return false;
        }
        h30 h30Var = (h30) obj;
        return k71.k.b(this.a, h30Var.a) && k71.k.b(this.b, h30Var.b);
    }

    public final int hashCode() {
        k30 k30Var = this.a;
        int hashCode = (k30Var == null ? 0 : k30Var.hashCode()) * 31;
        i30 i30Var = this.b;
        return hashCode + (i30Var != null ? i30Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsDone=" + this.b + ")";
    }
}
