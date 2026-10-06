package l81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o extends kotlinx.serialization.json.d {
    public boolean r;
    public String s;

    public o(Object obj, boolean z) {
        k71.k.g(obj, "body");
        this.r = z;
        this.s = obj.toString();
    }

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return this.s;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.r == oVar.r && k71.k.b(this.s, oVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (Boolean.hashCode(this.r) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z = this.r;
        String str = this.s;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        m81.t.a(str, sb);
        return sb.toString();
    }
}
