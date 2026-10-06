package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 {
    public String a;

    public f8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8) && k71.k.b(this.a, ((f8) obj).a);
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
