package androidx.compose.runtime.tooling;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f1853a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f1854b;

    public h(int i, Integer num) {
        this.f1853a = i;
        this.f1854b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1853a == hVar.f1853a && k.b(this.f1854b, hVar.f1854b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f1853a) * 31;
        Integer num = this.f1854b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f1853a + ", dataOffset=" + this.f1854b + ')';
    }
}
