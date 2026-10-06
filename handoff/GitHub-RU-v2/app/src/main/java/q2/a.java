package q2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements r {

    /* renamed from: b, reason: collision with root package name */
    public int f30818b;

    public a(int i) {
        this.f30818b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k71.k.e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f30818b == ((a) obj).f30818b;
    }

    public final int hashCode() {
        return this.f30818b;
    }

    public final String toString() {
        return x.i.j(new StringBuilder("AndroidPointerIcon(type="), this.f30818b, ')');
    }
}
