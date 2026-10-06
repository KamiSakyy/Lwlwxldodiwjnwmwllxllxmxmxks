package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c50 implements aaShadow.m0 {
    public d50 a;

    public c50(d50 d50Var) {
        this.a = d50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c50) && k71.k.b(this.a, ((c50) obj).a);
    }

    public final int hashCode() {
        d50 d50Var = this.a;
        if (d50Var == null) {
            return 0;
        }
        return d50Var.hashCode();
    }

    public final String toString() {
        return "Data(updateNotificationSettings=" + this.a + ")";
    }
}
