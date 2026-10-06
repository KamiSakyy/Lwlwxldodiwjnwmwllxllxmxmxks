package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h10 implements aaShadow.v0 {
    public l10 a;

    public h10(l10 l10Var) {
        this.a = l10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && k71.k.b(this.a, ((h10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
