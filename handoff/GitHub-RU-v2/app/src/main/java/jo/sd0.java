package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sd0 implements aaShadow.m0 {
    public final td0 a;

    public sd0(td0 td0Var) {
        this.a = td0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd0) && k71.k.b(this.a, ((sd0) obj).a);
    }

    public final int hashCode() {
        td0 td0Var = this.a;
        if (td0Var == null) {
            return 0;
        }
        return td0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateNotificationSettings=" + this.a + ")";
    }
}
