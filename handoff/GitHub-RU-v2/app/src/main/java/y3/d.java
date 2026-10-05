package y3;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34194a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34195b;

    /* renamed from: c, reason: collision with root package name */
    public final g f34196c;

    /* renamed from: d, reason: collision with root package name */
    public final f f34197d;

    /* renamed from: e, reason: collision with root package name */
    public final g f34198e;

    /* renamed from: f, reason: collision with root package name */
    public final f f34199f;

    public d(Object obj) {
        this.f34194a = obj;
        new LinkedHashMap();
        this.f34195b = obj;
        this.f34196c = new g(obj, -2, this);
        this.f34197d = new f(obj, 0, this);
        this.f34198e = new g(obj, -1, this);
        this.f34199f = new f(obj, 1, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return k71.k.b(this.f34195b, ((d) obj).f34195b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34195b.hashCode();
    }




}
