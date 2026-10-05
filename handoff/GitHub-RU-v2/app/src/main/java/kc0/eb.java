package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eb implements aa.v0 {
    public final fb a;

    public eb(fb fbVar) {
        this.a = fbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb) && k71.k.b(this.a, ((eb) obj).a);
    }

    public final int hashCode() {
        fb fbVar = this.a;
        if (fbVar == null) {
            return 0;
        }
        return fbVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
