package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fl implements aa.m0 {
    public final gl a;

    public fl(gl glVar) {
        this.a = glVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl) && k71.k.b(this.a, ((fl) obj).a);
    }

    public final int hashCode() {
        gl glVar = this.a;
        if (glVar == null) {
            return 0;
        }
        return glVar.hashCode();
    }

    public final String toString() {
        return "Data(markPullRequestReadyForReview=" + this.a + ")";
    }
}
