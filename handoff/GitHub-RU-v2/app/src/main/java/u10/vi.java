package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vi {
    public final String a;
    public final q60.d b;

    public vi(String str, q60.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj;
        return k71.k.b(this.a, viVar.a) && k71.k.b(this.b, viVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
