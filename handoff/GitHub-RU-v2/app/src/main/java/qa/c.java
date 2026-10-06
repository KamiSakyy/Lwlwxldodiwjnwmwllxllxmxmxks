package qa;

import k21.f;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends f {
    public static final b Companion = new b();

    /* renamed from: c, reason: collision with root package name */
    public int f31026c;

    /* renamed from: d, reason: collision with root package name */
    public int f31027d;

    public c(int i, int i10) {
        this.f31026c = i;
        this.f31027d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f31026c == cVar.f31026c && this.f31027d == cVar.f31027d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31027d) + (Integer.hashCode(this.f31026c) * 31);
    }

    public final String toString() {
        return this.f31026c + "." + this.f31027d;
    }
}
