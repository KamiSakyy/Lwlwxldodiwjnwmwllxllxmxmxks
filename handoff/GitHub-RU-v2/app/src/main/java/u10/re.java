package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class re {
    public final String a;

    public re(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re) && k71.k.b(this.a, ((re) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("FollowUser(clientMutationId=", this.a, ")");
    }
}
