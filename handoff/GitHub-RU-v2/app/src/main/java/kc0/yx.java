package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yx implements aa.v0 {
    public final ay a;

    public yx(ay ayVar) {
        this.a = ayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx) && k71.k.b(this.a, ((yx) obj).a);
    }

    public final int hashCode() {
        ay ayVar = this.a;
        if (ayVar == null) {
            return 0;
        }
        return ayVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
