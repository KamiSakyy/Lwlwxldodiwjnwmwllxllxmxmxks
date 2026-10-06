package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aw implements aaShadow.v0 {
    public cw a;

    public aw(cw cwVar) {
        this.a = cwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && k71.k.b(this.a, ((aw) obj).a);
    }

    public final int hashCode() {
        cw cwVar = this.a;
        if (cwVar == null) {
            return 0;
        }
        return cwVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
