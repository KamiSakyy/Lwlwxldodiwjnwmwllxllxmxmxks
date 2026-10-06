package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class as implements aaShadow.m0 {
    public bs a;

    public as(bs bsVar) {
        this.a = bsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && k71.k.b(this.a, ((as) obj).a);
    }

    public final int hashCode() {
        bs bsVar = this.a;
        if (bsVar == null) {
            return 0;
        }
        return bsVar.hashCode();
    }

    public final String toString() {
        return "Data(removeUpvote=" + this.a + ")";
    }
}
