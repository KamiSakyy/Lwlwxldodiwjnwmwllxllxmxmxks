package com.github.rudroid.fileeditor.commitbox;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f12906a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.b(this.f12906a, ((b) obj).f12906a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12906a.hashCode();
    }

    public final String toString() {
        return f1.e.z("CommitDetail(detail=", this.f12906a, ")");
    }
}
