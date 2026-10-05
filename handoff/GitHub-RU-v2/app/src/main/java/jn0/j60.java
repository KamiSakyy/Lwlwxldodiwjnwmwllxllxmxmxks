package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j60 {
    public final r60 a;
    public final String b;

    public j60(r60 r60Var, String str) {
        this.a = r60Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j60)) {
            return false;
        }
        j60 j60Var = (j60) obj;
        return k71.k.b(this.a, j60Var.a) && k71.k.b(this.b, j60Var.b);
    }

    public final int hashCode() {
        r60 r60Var = this.a;
        return this.b.hashCode() + ((r60Var == null ? 0 : r60Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnIssue(timelineItem=" + this.a + ", id=" + this.b + ")";
    }
}
