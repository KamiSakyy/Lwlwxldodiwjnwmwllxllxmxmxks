package com.github.rudroid.feed;

/* loaded from: /home/user/work/p/classes.dex */
public final class r1 extends t {

    /* renamed from: b, reason: collision with root package name */
    public final t10.h f12698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t10.h hVar) {
        super(hVar.b());
        k71.k.g(hVar, "item");
        this.f12698b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && k71.k.b(this.f12698b, ((r1) obj).f12698b);
    }

    public final int hashCode() {
        return this.f12698b.hashCode();
    }

    public final String toString() {
        return "RecommendedFeedViewItem(item=" + this.f12698b + ")";
    }
}
