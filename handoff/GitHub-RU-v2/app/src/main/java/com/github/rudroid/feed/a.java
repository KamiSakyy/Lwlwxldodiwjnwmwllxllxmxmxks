package com.github.rudroid.feed;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends t {

    /* renamed from: b, reason: collision with root package name */
    public final t10.k f12454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t10.k kVar) {
        super(kVar.a);
        k71.k.g(kVar, "item");
        this.f12454b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.f12454b, ((a) obj).f12454b);
    }

    public final int hashCode() {
        return this.f12454b.hashCode();
    }

    public final String toString() {
        return "AwesomeTopicFeedViewItem(item=" + this.f12454b + ")";
    }
}
