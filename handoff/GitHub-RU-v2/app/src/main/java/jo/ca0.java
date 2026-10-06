package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ca0 {
    public String a;

    public ca0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca0) && k71.k.b(this.a, ((ca0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("UndoUserDisinterest(clientMutationId=", this.a, ")");
    }
}
