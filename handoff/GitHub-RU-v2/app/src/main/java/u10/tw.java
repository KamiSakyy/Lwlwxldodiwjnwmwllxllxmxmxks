package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tw {
    public final uw a;

    public tw(uw uwVar) {
        this.a = uwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw) && k71.k.b(this.a, ((tw) obj).a);
    }

    public final int hashCode() {
        uw uwVar = this.a;
        if (uwVar == null) {
            return 0;
        }
        return uwVar.hashCode();
    }

    public final String toString() {
        return "ResolveReviewThread(thread=" + this.a + ")";
    }
}
