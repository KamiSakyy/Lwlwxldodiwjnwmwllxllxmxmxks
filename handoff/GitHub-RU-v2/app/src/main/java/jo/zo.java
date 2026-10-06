package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zo {
    public String a;

    public zo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo) && k71.k.b(this.a, ((zo) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("MobileEventsUpdate(clientMutationId=", this.a, ")");
    }
}
