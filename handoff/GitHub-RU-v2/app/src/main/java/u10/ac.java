package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ac {
    public String a;
    public hc0.kv b;

    public ac(String str, hc0.kv kvVar) {
        this.a = str;
        this.b = kvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return k71.k.b(this.a, acVar.a) && this.b == acVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterpriseSupportContact(link=" + this.a + ", linkType=" + this.b + ")";
    }
}
