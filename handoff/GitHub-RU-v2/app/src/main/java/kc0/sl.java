package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sl implements aaShadow.v0 {
    public ul a;

    public sl(ul ulVar) {
        this.a = ulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl) && k71.k.b(this.a, ((sl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
