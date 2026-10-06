package com.github.rudroid.fileschanged;

/* loaded from: /home/user/work/p/classes.dex */
final class n5 implements o5 {

    /* renamed from: a, reason: collision with root package name */
    public String f13405a;

    public n5(String str) {
        k71.k.g(str, "id");
        this.f13405a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5) && k71.k.b(this.f13405a, ((n5) obj).f13405a);
    }

    public final int hashCode() {
        return this.f13405a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ThreadId(id=", this.f13405a, ")");
    }
}
