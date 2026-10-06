package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pn implements aaShadow.v0 {
    public final qn a;

    public pn(qn qnVar) {
        this.a = qnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn) && k71.k.b(this.a, ((pn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
