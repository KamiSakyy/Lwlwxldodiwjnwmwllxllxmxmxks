package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uz implements aa.v0 {
    public final zz a;
    public final String b;
    public final String c;

    public uz(zz zzVar, String str, String str2) {
        this.a = zzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        return k71.k.b(this.a, uzVar.a) && k71.k.b(this.b, uzVar.b) && k71.k.b(this.c, uzVar.c);
    }

    public final int hashCode() {
        zz zzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((zzVar == null ? 0 : zzVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
