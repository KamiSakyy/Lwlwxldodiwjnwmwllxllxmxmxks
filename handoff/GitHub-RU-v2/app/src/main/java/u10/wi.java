package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wi {
    public String a;
    public q60.d b;

    public wi(String str, q60.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return k71.k.b(this.a, wiVar.a) && k71.k.b(this.b, wiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
