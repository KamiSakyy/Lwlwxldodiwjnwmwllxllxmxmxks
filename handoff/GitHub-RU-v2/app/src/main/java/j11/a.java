package j11;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public Object a;
    public d b;
    public b c;

    public a(Object obj, d dVar, b bVar) {
        this.a = obj;
        this.b = dVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.c;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b) && ((bVar = this.c) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        b bVar = this.c;
        return (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
