package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ea {
    public final String a;

    public ea(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea) && k71.k.b(this.a, ((ea) obj).a);
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
