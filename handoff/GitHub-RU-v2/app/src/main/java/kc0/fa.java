package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa implements aa.v0 {
    public final ia a;

    public fa(ia iaVar) {
        this.a = iaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa) && k71.k.b(this.a, ((fa) obj).a);
    }

    public final int hashCode() {
        ia iaVar = this.a;
        if (iaVar == null) {
            return 0;
        }
        return iaVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
