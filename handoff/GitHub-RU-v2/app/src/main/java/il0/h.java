package il0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;

    public h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteUserList(clientMutationId=", this.a, ")");
    }
}
