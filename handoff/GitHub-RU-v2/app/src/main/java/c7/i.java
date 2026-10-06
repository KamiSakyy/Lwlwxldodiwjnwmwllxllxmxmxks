package c7;

import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends z3 {

    /* renamed from: b, reason: collision with root package name */
    public b f4150b;

    public i(b bVar) {
        k71.k.g(bVar, "latestEvent");
        this.f4150b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && k71.k.b(this.f4150b, ((i) obj).f4150b);
    }

    public final int hashCode() {
        return this.f4150b.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f4150b + ", direction=-1)";
    }
}
