package l9;

import i9.y;

/* loaded from: /home/user/work/p/classes.dex */
public final class n extends f {

    /* renamed from: a, reason: collision with root package name */
    public y f28417a;

    /* renamed from: b, reason: collision with root package name */
    public String f28418b;

    /* renamed from: c, reason: collision with root package name */
    public i9.f f28419c;

    public n(y yVar, String str, i9.f fVar) {
        this.f28417a = yVar;
        this.f28418b = str;
        this.f28419c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.f28417a, nVar.f28417a) && k71.k.b(this.f28418b, nVar.f28418b) && this.f28419c == nVar.f28419c;
    }

    public final int hashCode() {
        int hashCode = this.f28417a.hashCode() * 31;
        String str = this.f28418b;
        return this.f28419c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
