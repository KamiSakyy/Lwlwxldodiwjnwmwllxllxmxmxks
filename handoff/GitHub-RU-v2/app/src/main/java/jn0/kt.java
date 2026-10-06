package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kt {
    public final String a;

    public kt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt) && k71.k.b(this.a, ((kt) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteUserDashboardPin(clientMutationId=", this.a, ")");
    }
}
