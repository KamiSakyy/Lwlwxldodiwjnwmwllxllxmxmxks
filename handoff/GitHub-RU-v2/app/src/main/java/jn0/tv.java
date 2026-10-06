package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tv {
    public final qv a;

    public tv(qv qvVar) {
        this.a = qvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && k71.k.b(this.a, ((tv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(forks=" + this.a + ")";
    }
}
