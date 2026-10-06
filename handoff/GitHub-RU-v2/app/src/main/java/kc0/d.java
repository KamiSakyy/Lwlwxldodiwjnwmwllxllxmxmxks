package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aaShadow.m0 {
    public final a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "Data(addComment=" + this.a + ")";
    }
}
