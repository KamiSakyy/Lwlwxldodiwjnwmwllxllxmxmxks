package me;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public f f29231a;

    /* renamed from: b, reason: collision with root package name */
    public i f29232b;

    public h(f fVar, i iVar) {
        this.f29231a = fVar;
        this.f29232b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.f29231a, hVar.f29231a) && k.b(this.f29232b, hVar.f29232b);
    }

    public final int hashCode() {
        return this.f29232b.hashCode() + (this.f29231a.hashCode() * 31);
    }

    public final String toString() {
        return "StringResourceSpan(stringResource=" + this.f29231a + ", spanType=" + this.f29232b + ")";
    }
}
