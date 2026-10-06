package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vc {
    public boolean a;
    public String b;

    public vc(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc)) {
            return false;
        }
        vc vcVar = (vc) obj;
        return this.a == vcVar.a && k71.k.b(this.b, vcVar.b);
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
