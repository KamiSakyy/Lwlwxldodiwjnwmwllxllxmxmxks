package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class os {
    public ks a;

    public os(ks ksVar) {
        this.a = ksVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os) && k71.k.b(this.a, ((os) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(contributors=" + this.a + ")";
    }
}
