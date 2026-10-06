package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class du implements aaShadow.m0 {
    public hu a;

    public du(hu huVar) {
        this.a = huVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du) && k71.k.b(this.a, ((du) obj).a);
    }

    public final int hashCode() {
        hu huVar = this.a;
        if (huVar == null) {
            return 0;
        }
        return huVar.hashCode();
    }

    public final String toString() {
        return "Data(removeSubIssue=" + this.a + ")";
    }
}
