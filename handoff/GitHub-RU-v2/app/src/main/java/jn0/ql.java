package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ql {
    public final String a;
    public final qs0.d b;

    public ql(String str, qs0.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return k71.k.b(this.a, qlVar.a) && k71.k.b(this.b, qlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
