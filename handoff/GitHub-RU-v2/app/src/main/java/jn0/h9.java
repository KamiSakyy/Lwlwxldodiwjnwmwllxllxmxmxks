package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h9 {
    public String a;

    public h9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9) && k71.k.b(this.a, ((h9) obj).a);
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
