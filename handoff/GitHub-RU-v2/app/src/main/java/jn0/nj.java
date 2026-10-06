package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nj implements aaShadow.m0 {
    public final oj a;

    public nj(oj ojVar) {
        this.a = ojVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj) && k71.k.b(this.a, ((nj) obj).a);
    }

    public final int hashCode() {
        oj ojVar = this.a;
        if (ojVar == null) {
            return 0;
        }
        return ojVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsDone=" + this.a + ")";
    }
}
