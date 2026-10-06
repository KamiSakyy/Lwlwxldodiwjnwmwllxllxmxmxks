package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class od {
    public String a;
    public md b;

    public od(String str, md mdVar) {
        this.a = str;
        this.b = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return k71.k.b(this.a, odVar.a) && k71.k.b(this.b, odVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", history=" + this.b + ")";
    }
}
