package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jw {
    public kw a;

    public jw(kw kwVar) {
        this.a = kwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw) && k71.k.b(this.a, ((jw) obj).a);
    }

    public final int hashCode() {
        kw kwVar = this.a;
        if (kwVar == null) {
            return 0;
        }
        return kwVar.hashCode();
    }

    public final String toString() {
        return "RemoveUpvote(subject=" + this.a + ")";
    }
}
