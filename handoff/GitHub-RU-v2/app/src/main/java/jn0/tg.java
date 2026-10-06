package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tg {
    public boolean a;
    public String b;

    public tg(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return this.a == tgVar.a && k71.k.b(this.b, tgVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
