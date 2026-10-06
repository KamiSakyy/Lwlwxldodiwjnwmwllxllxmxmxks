package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iz implements aaShadow.v0 {
    public mz a;

    public iz(mz mzVar) {
        this.a = mzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz) && k71.k.b(this.a, ((iz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
