package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 {
    public String a;

    public n3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3) && k71.k.b(this.a, ((n3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("BlockUserFromOrganization(clientMutationId=", this.a, ")");
    }
}
