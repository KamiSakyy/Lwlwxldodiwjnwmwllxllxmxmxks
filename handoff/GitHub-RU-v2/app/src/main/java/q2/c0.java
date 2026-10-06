package q2;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30834a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f30834a == ((c0) obj).f30834a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30834a);
    }

    public final String toString() {
        return no.a.l("PointerKeyboardModifiers(packedValue=", this.f30834a, ')');
    }
}
