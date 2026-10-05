package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i3 implements aa.v0 {
    public final m3 a;

    public i3(m3 m3Var) {
        this.a = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3) && k71.k.b(this.a, ((i3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
