package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hr {
    public final String a;

    public hr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr) && k71.k.b(this.a, ((hr) obj).a);
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
