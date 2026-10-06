package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t30 implements aaShadow.m0 {
    public u30 a;

    public t30(u30 u30Var) {
        this.a = u30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t30) && k71.k.b(this.a, ((t30) obj).a);
    }

    public final int hashCode() {
        u30 u30Var = this.a;
        if (u30Var == null) {
            return 0;
        }
        return u30Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussionComment=" + this.a + ")";
    }
}
