package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a70 implements aaShadow.m0 {
    public b70 a;

    public a70(b70 b70Var) {
        this.a = b70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a70) && k71.k.b(this.a, ((a70) obj).a);
    }

    public final int hashCode() {
        b70 b70Var = this.a;
        if (b70Var == null) {
            return 0;
        }
        return b70Var.hashCode();
    }

    public final String toString() {
        return "Data(updateNotificationSettings=" + this.a + ")";
    }
}
