package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 {
    public final String a;

    public d3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && k71.k.b(this.a, ((d3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("BlockUser(clientMutationId=", this.a, ")");
    }
}
