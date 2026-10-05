package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o30 {
    public final String a;

    public o30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o30) && k71.k.b(this.a, ((o30) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("UnblockUserFromOrganization(clientMutationId=", this.a, ")");
    }
}
