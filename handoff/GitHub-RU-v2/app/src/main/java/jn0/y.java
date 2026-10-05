package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public final String a;

    public y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("CreateUserDashboardPin(clientMutationId=", this.a, ")");
    }
}
