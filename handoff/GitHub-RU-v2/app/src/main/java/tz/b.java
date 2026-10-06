package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public boolean a;
    public String b;
    public boolean c;

    public b(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k71.k.b(this.b, bVar.b) && this.c == bVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return jo.f4.s(com.github.rudroid.copilot.h1.t("PageInfo(hasNextPage=", ", endCursor=", this.b, ", hasPreviousPage=", this.a), this.c, ")");
    }
    public Object c(Object, Object) { return null; }
    public Object e(Object, Object, Object) { return null; }
}
