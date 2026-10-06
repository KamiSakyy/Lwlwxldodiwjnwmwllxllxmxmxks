package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yi implements aaShadow.m0 {
    public final zi a;

    public yi(zi ziVar) {
        this.a = ziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi) && k71.k.b(this.a, ((yi) obj).a);
    }

    public final int hashCode() {
        zi ziVar = this.a;
        if (ziVar == null) {
            return 0;
        }
        return ziVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsDone=" + this.a + ")";
    }
}
