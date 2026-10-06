package m6;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f28932a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f28932a == ((c) obj).f28932a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28932a);
    }

    public final String toString() {
        int i = this.f28932a;
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Start" : i == 5 ? "End" : "Invalid";
    }
    public Object a = null;
}
