package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zy {
    public String a;
    public boolean b;

    public zy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return k71.k.b(this.a, zyVar.a) && this.b == zyVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("PageInfo(endCursor=", this.a, ", hasNextPage=", ")", this.b);
    }
}
