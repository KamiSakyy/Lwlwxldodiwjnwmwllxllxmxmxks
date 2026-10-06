package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public o0 a;

    public m0(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && k71.k.b(this.a, ((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnProjectV2Owner(projectsV2=" + this.a + ")";
    }
    public static Object b(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
}
