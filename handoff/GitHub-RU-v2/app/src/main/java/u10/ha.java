package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ha {
    public fa a;

    public ha(fa faVar) {
        this.a = faVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha) && k71.k.b(this.a, ((ha) obj).a);
    }

    public final int hashCode() {
        fa faVar = this.a;
        if (faVar == null) {
            return 0;
        }
        return faVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussionComment(discussion=" + this.a + ")";
    }
}
