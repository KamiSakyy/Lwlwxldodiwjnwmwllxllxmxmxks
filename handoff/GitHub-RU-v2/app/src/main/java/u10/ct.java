package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ct {
    public final gt a;
    public final String b;

    public ct(gt gtVar, String str) {
        this.a = gtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return k71.k.b(this.a, ctVar.a) && k71.k.b(this.b, ctVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
