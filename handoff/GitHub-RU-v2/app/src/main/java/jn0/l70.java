package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l70 {
    public String a;

    public l70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l70) && k71.k.b(this.a, ((l70) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("UnblockUser(clientMutationId=", this.a, ")");
    }
}
