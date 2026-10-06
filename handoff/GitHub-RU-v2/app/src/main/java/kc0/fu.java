package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fu implements aaShadow.v0 {
    public final hu a;

    public fu(hu huVar) {
        this.a = huVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu) && k71.k.b(this.a, ((fu) obj).a);
    }

    public final int hashCode() {
        hu huVar = this.a;
        if (huVar == null) {
            return 0;
        }
        return huVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
