package pi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements e {
    public final d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    @Override // pi.e
    public final d getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ANSIBasicEscapeCode(value=" + this.a + ")";
    }
}
