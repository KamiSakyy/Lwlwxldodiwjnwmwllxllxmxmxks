package jn;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements g {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        k.g(str, "localizedUnlockingExplanation");
        k.g(str2, "url");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("DefaultUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ")");
    }
}
