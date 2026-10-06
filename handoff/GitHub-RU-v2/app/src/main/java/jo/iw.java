package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iw implements aaShadow.m0 {
    public final jw a;

    public iw(jw jwVar) {
        this.a = jwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw) && k71.k.b(this.a, ((iw) obj).a);
    }

    public final int hashCode() {
        jw jwVar = this.a;
        if (jwVar == null) {
            return 0;
        }
        return jwVar.hashCode();
    }

    public final String toString() {
        return "Data(removeUpvote=" + this.a + ")";
    }
}
