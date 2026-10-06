package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oq {
    public String a;

    public oq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq) && k71.k.b(this.a, ((oq) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("RemoveDashboardSearchShortcut(clientMutationId=", this.a, ")");
    }
}
