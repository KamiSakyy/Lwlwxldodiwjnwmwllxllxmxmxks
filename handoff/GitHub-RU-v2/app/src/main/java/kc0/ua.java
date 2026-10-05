package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ua implements aa.v0 {
    public final wa a;

    public ua(wa waVar) {
        this.a = waVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua) && k71.k.b(this.a, ((ua) obj).a);
    }

    public final int hashCode() {
        wa waVar = this.a;
        if (waVar == null) {
            return 0;
        }
        return waVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
