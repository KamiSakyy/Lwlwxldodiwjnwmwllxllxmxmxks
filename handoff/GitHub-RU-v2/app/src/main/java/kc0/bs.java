package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bs {
    public final cs a;

    public bs(cs csVar) {
        this.a = csVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs) && k71.k.b(this.a, ((bs) obj).a);
    }

    public final int hashCode() {
        cs csVar = this.a;
        if (csVar == null) {
            return 0;
        }
        return csVar.hashCode();
    }

    public final String toString() {
        return "RemoveUpvote(subject=" + this.a + ")";
    }
}
