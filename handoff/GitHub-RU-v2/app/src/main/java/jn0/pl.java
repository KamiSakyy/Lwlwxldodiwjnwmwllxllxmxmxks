package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pl {
    public final String a;
    public final qs0.d b;

    public pl(String str, qs0.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return k71.k.b(this.a, plVar.a) && k71.k.b(this.b, plVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
