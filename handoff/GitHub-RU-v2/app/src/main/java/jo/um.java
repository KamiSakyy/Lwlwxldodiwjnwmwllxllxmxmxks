package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class um {
    public final String a;
    public final zt.d b;

    public um(String str, zt.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return k71.k.b(this.a, umVar.a) && k71.k.b(this.b, umVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
