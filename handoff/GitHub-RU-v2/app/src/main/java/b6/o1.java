package b6;

import android.widget.RemoteViews;

/* loaded from: /home/user/work/p/classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteViews f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f3654b;

    public o1(RemoteViews remoteViews, c1 c1Var) {
        this.f3653a = remoteViews;
        this.f3654b = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.f3653a, o1Var.f3653a) && k71.k.b(this.f3654b, o1Var.f3654b);
    }

    public final int hashCode() {
        return this.f3654b.hashCode() + (this.f3653a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f3653a + ", view=" + this.f3654b + ')';
    }
}
