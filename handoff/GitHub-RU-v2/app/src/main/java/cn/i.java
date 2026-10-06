package cn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public h b;

    public i(String str, h hVar) {
        k71.k.g(str, "cacheKey");
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheEntryWithId(cacheKey=" + this.a + ", cacheEntry=" + this.b + ")";
    }
}
