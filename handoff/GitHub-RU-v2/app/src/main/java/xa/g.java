package xa;

import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends d {

    /* renamed from: s, reason: collision with root package name */
    public final int f34078s;

    /* renamed from: t, reason: collision with root package name */
    public final int f34079t;

    public g(int i, int i10) {
        super(2);
        this.f34078s = i;
        this.f34079t = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f34078s == gVar.f34078s && this.f34079t == gVar.f34079t;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34079t) + (Integer.hashCode(this.f34078s) * 31);
    }

    public final String toString() {
        return f4.h(this.f34078s, this.f34079t, "DiffLinesCollapsedIndicator(startLineNumber=", ", endLineNumber=", ")");
    }
}
