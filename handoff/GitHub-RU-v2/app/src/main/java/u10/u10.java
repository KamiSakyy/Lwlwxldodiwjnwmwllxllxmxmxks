package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u10 {
    public String a;

    public u10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u10) && k71.k.b(this.a, ((u10) obj).a);
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
