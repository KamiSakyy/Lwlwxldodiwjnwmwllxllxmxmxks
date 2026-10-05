package com.github.rudroid.fileschanged;

/* loaded from: /home/user/work/p/classes.dex */
final class a implements o5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13071a;

    public a(String str) {
        k71.k.g(str, "id");
        this.f13071a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.f13071a, ((a) obj).f13071a);
    }

    public final int hashCode() {
        return this.f13071a.hashCode();
    }

    public final String toString() {
        return f1.e.z("CommentId(id=", this.f13071a, ")");
    }
}
