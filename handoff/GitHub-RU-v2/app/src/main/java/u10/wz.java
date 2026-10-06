package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wz {
    public zz a;
    public String b;

    public wz(zz zzVar, String str) {
        this.a = zzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        return k71.k.b(this.a, wzVar.a) && k71.k.b(this.b, wzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(starredRepositories=" + this.a + ", id=" + this.b + ")";
    }
}
