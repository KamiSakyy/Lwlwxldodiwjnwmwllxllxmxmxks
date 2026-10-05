package b3;

import j2.f;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f3380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3381b;

    public a(f fVar, int i) {
        this.f3380a = fVar;
        this.f3381b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f3380a, aVar.f3380a) && this.f3381b == aVar.f3381b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3381b) + (this.f3380a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f3380a);
        sb2.append(", configFlags=");
        return i.j(sb2, this.f3381b, ')');
    }
}
