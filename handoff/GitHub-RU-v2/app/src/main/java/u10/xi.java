package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xi {
    public final String a;
    public final q60.d b;

    public xi(String str, q60.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return k71.k.b(this.a, xiVar.a) && k71.k.b(this.b, xiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
