package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pl {
    public final String a;

    public pl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl) && k71.k.b(this.a, ((pl) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("MobileEventsUpdate(clientMutationId=", this.a, ")");
    }
}
