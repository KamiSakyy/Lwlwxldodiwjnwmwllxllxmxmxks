package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ls implements aa.v0 {
    public final ns a;

    public ls(ns nsVar) {
        this.a = nsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls) && k71.k.b(this.a, ((ls) obj).a);
    }

    public final int hashCode() {
        ns nsVar = this.a;
        if (nsVar == null) {
            return 0;
        }
        return nsVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
