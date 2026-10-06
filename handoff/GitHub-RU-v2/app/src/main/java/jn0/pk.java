package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pk implements aaShadow.m0 {
    public qk a;

    public pk(qk qkVar) {
        this.a = qkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk) && k71.k.b(this.a, ((pk) obj).a);
    }

    public final int hashCode() {
        qk qkVar = this.a;
        if (qkVar == null) {
            return 0;
        }
        return qkVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsDone=" + this.a + ")";
    }
}
