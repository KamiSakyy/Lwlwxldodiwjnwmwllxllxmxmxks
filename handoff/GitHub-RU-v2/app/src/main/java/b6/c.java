package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements z5.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f3507a;

    public c(int i) {
        this.f3507a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f3507a == ((c) obj).f3507a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3507a);
    }

    public final String toString() {
        return x.i.j(new StringBuilder("AppWidgetId(appWidgetId="), this.f3507a, ')');
    }
}
