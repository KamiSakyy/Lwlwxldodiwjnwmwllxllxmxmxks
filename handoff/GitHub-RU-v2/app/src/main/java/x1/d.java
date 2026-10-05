package x1;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f33704a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f33704a == ((d) obj).f33704a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33704a);
    }

    public final String toString() {
        return no.a.l("AndroidContentDataType(androidAutofillType=", this.f33704a, ')');
    }
}
