package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pg implements aaShadow.v0 {
    public final qg a;

    public pg(qg qgVar) {
        this.a = qgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg) && k71.k.b(this.a, ((pg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
