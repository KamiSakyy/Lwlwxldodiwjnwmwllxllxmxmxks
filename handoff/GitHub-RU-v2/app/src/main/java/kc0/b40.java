package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b40 {
    public final String a;

    public b40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b40) && k71.k.b(this.a, ((b40) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("UnfollowUser(clientMutationId=", this.a, ")");
    }
}
