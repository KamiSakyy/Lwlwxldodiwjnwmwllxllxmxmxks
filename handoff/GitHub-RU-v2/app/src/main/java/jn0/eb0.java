package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eb0 implements aa.m0 {
    public final fb0 a;

    public eb0(fb0 fb0Var) {
        this.a = fb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb0) && k71.k.b(this.a, ((eb0) obj).a);
    }

    public final int hashCode() {
        fb0 fb0Var = this.a;
        if (fb0Var == null) {
            return 0;
        }
        return fb0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateNotificationSettings=" + this.a + ")";
    }
}
