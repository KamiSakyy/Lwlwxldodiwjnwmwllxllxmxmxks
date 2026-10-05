package wc0;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public final String a;
    public final ud0.a b;

    public q(String str, ud0.a aVar) {
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
        return f4.p("Pusher(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
