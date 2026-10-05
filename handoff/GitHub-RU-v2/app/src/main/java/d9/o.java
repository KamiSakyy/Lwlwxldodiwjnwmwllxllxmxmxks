package d9;

import v8.j0;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f21706a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f21707b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.f21706a, oVar.f21706a) && this.f21707b == oVar.f21707b;
    }

    public final int hashCode() {
        return this.f21707b.hashCode() + (this.f21706a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f21706a + ", state=" + this.f21707b + ')';
    }
}
