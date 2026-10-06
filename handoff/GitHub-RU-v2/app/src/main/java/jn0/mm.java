package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mm {
    public im a;
    public om b;

    public mm(im imVar, om omVar) {
        this.a = imVar;
        this.b = omVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return k71.k.b(this.a, mmVar.a) && k71.k.b(this.b, mmVar.b);
    }

    public final int hashCode() {
        im imVar = this.a;
        int hashCode = (imVar == null ? 0 : imVar.hashCode()) * 31;
        om omVar = this.b;
        return hashCode + (omVar != null ? omVar.hashCode() : 0);
    }

    public final String toString() {
        return "MergePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
