package mn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public a a;
    public b b;

    public c(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionCheckRunWithStep(checkRun=" + this.a + ", step=" + this.b + ")";
    }
}
