package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 {
    public String a;

    public f3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3) && k71.k.b(this.a, ((f3) obj).a);
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
