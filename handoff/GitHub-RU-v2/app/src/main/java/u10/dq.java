package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dq {
    public String a;

    public dq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq) && k71.k.b(this.a, ((dq) obj).a);
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
