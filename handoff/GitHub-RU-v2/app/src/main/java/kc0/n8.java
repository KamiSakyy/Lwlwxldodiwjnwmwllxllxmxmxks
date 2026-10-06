package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 {
    public String a;

    public n8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8) && k71.k.b(this.a, ((n8) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteRef(clientMutationId=", this.a, ")");
    }
}
