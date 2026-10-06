package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yl implements aaShadow.v0 {
    public am a;

    public yl(am amVar) {
        this.a = amVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl) && k71.k.b(this.a, ((yl) obj).a);
    }

    public final int hashCode() {
        am amVar = this.a;
        if (amVar == null) {
            return 0;
        }
        return amVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
