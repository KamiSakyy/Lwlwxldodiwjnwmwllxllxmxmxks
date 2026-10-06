package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class br implements aaShadow.m0 {
    public dr a;

    public br(dr drVar) {
        this.a = drVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br) && k71.k.b(this.a, ((br) obj).a);
    }

    public final int hashCode() {
        dr drVar = this.a;
        if (drVar == null) {
            return 0;
        }
        return drVar.hashCode();
    }

    public final String toString() {
        return "Data(reopenIssue=" + this.a + ")";
    }
}
