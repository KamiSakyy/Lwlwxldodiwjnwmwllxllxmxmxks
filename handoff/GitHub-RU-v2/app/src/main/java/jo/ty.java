package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ty {
    public vy a;

    public ty(vy vyVar) {
        this.a = vyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty) && k71.k.b(this.a, ((ty) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(watchers=" + this.a + ")";
    }
}
