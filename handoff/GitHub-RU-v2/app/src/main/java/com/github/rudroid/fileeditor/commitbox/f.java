package com.github.rudroid.fileeditor.commitbox;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f12917a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return k.b(this.f12917a, ((f) obj).f12917a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12917a.hashCode();
    }

    public final String toString() {
        return f1.e.z("CommitHeadline(headline=", this.f12917a, ")");
    }
}
