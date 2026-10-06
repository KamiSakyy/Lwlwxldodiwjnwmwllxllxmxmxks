package g20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public e30.a b;

    public q(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Pusher(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
